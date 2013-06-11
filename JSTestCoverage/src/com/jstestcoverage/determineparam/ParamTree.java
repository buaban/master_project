package com.jstestcoverage.determineparam;

import java.util.ArrayDeque;
import javax.swing.tree.DefaultMutableTreeNode;


public class ParamTree {
	ArrayDeque<String> line;
	public DefaultMutableTreeNode paramTree;
	
	public ParamTree(ArrayDeque<String> lineQ){
		this.line = lineQ;
		DefaultMutableTreeNode top = new DefaultMutableTreeNode();
		this.generateParamTree(top);		
	}
	
	public void generateParamTree(DefaultMutableTreeNode tree){
			    	
		String txt ="";
		while(!this.line.isEmpty()){
			String ch = this.line.poll();		
			
			if(ch.equals("(")){
				if(this.line.peek().equals(")")){
					txt += ch;
					txt += this.line.poll();
				} else {
					DefaultMutableTreeNode node = new DefaultMutableTreeNode(txt);
					txt="";
					tree.add(node);
					this.generateParamTree(node);
				}
			} else if(ch.equals(",")){
				if(!txt.isEmpty()){
					DefaultMutableTreeNode node = new DefaultMutableTreeNode(txt);
					txt="";
					tree.add(node);
				}
			} else if(ch.equals(")")) {
				if(!txt.isEmpty()){
					DefaultMutableTreeNode node = new DefaultMutableTreeNode(txt);
					txt="";
					tree.add(node);
				}
				break;
			} else {
				txt += ch;				
			}			
			
		}	
		
		
		
		this.paramTree = tree;
	}

	
	
	
	
}
