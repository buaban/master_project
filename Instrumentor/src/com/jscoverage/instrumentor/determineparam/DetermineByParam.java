package com.jscoverage.instrumentor.determineparam;

import java.util.ArrayDeque;
import java.util.HashMap;
import javax.swing.tree.DefaultMutableTreeNode;
import com.google.common.collect.HashBasedTable;

public class DetermineByParam extends IDetermineParamType {
	ArrayDeque<String> paramList = new ArrayDeque<String>();
	private static final String STR = "String";
	private static final String INT = "Integer";
	private static final com.google.common.collect.HashBasedTable<String,String,String> FUNC_MAP;
	static {	
		FUNC_MAP = HashBasedTable.create();
		FUNC_MAP.put("charAt", "0", INT);
		FUNC_MAP.put("charCodeAt", "0", INT);
		FUNC_MAP.put("compile", "0", INT);
		FUNC_MAP.put("concat", "0", STR);
		FUNC_MAP.put("concat", "1", STR);
		FUNC_MAP.put("concat", "2", STR);
		FUNC_MAP.put("concat", "3", STR);
		FUNC_MAP.put("concat", "4", STR);
		FUNC_MAP.put("concat", "5", STR);
		FUNC_MAP.put("concat", "6", STR);
		FUNC_MAP.put("concat", "7", STR);
		FUNC_MAP.put("concat", "8", STR);
		FUNC_MAP.put("concat", "9", STR);
		FUNC_MAP.put("concat", "10", STR);
		FUNC_MAP.put("exec", "0", STR);
		FUNC_MAP.put("indexOf", "0", STR);
		FUNC_MAP.put("join", "0", STR);
		FUNC_MAP.put("lastIndexOf", "0", STR);
		FUNC_MAP.put("localeCompare", "0", STR); 
		FUNC_MAP.put("replace", "1", STR);
		FUNC_MAP.put("slice", "0", STR);
		FUNC_MAP.put("slice", "1", INT);
		FUNC_MAP.put("splice", "0", INT);
		FUNC_MAP.put("splice", "1", INT);
		FUNC_MAP.put("split", "0", STR);
		FUNC_MAP.put("split", "1", INT);
		FUNC_MAP.put("substr", "0", INT);
		FUNC_MAP.put("substr", "1", INT);
		FUNC_MAP.put("substring", "0", INT);
		FUNC_MAP.put("substring", "1", INT);
		FUNC_MAP.put("test", "0", STR);
		FUNC_MAP.put("toExponential", "0", INT);
		FUNC_MAP.put("toFixed", "0", INT);
		FUNC_MAP.put("toPrecision", "0", INT);		
	}
	
	
	public DetermineByParam(String funcBody, String param) {
		super(funcBody, param);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String execute() {
		String[] lines = super.funcBody.split("\\n");
		HashMap<String, String> func_paramInd = new HashMap<String,String>();
		
		
		for (String line : lines ) {
			if(!line.contains(super.param) || line.contains("_yuitest")){
				continue;
			} else {
				DefaultMutableTreeNode tree = new DefaultMutableTreeNode();
				ArrayDeque<String> lineQ = new ArrayDeque<String>();
				
				String strArray[] = line.split("");
				
				for (String ch : strArray) {
					lineQ.offer(ch);
				}
				
				ParamTree pmt = new ParamTree(lineQ);
				tree = pmt.paramTree;
				
				if(tree == null) {
					
				} else {
					if(super.param.equals("params")){
						super.param.trim();
					}
					func_paramInd = findParam(tree, super.param);
					if(func_paramInd == null) {
						return null;
					} else {
						return FUNC_MAP.get(func_paramInd.get("funcName"), func_paramInd.get("index"));
					}
				}
			}
		}	
		return null;		
	}
	
	
	private HashMap<String, String> findParam(DefaultMutableTreeNode tree, String param){
		DefaultMutableTreeNode node = tree.getFirstLeaf();
		DefaultMutableTreeNode parent = null;				
		int index = -1;
		if(tree.getChildCount() == 0){
			return null;
		}
		while(node != null){
			String txt = node.getUserObject().toString().trim();
			if(txt.equals(param)){
				parent = (DefaultMutableTreeNode)node.getParent();
				index = parent.getIndex(node);
				break;
			} else {
				node = node.getNextLeaf();
			}
		}	
		
		if(parent!=null && index!=-1){
			HashMap<String, String> m = new HashMap<String, String>();
			String funcName = parent.getUserObject().toString();
			String f[] = funcName.split("\\s|\\.|\\+|\\-|\\*|\\/|\\%|;|,");
			funcName=f[f.length-1].trim();
			m.put("funcName", funcName);
			m.put("index", index+"");
			return m;
		} 	
		return null;
	}
}
