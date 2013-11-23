/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jstestcoverageui;

import checkboxlist.*;
import com.jstestcoverage.JSCoverage;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;
import java.util.Date;
import java.util.List;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.ListModel;
import org.jdesktop.layout.GroupLayout;

/**
 *
 * @author pannawat.janthong
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */

    private static boolean DEVMODE = false;
    private static String INSMODE = "replace";
    private CheckBoxList checkboxList;
    private ArrayList<ArrayList<String>> selectedFuncList;    
    //private ArrayList<ArrayList<String>> allFuncList;
    private ArrayList<ArrayList<String>> testAbleFuncList;
    private String fileName;
    private String filePath;
    //private ArrayList<ArrayList<ArrayList<String>>> allFileList;
    private HashMap allFileList;
    
    private static String ROOT_FOLDER = "D:\\Boxes\\Dropbox\\GIT\\master_project\\website";

    public MainWindow() {
        initComponents();
        checkboxList = new CheckBoxList();
        jScrollPane2.setViewportView(checkboxList);
        selectedFuncList = new ArrayList<>();
        //allFileList = new ArrayList<>();
        allFileList = new HashMap();
        testAbleFuncList = new ArrayList<>();
        Date now = new Date();        
        testId.setText(now.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        topPanel = new javax.swing.JPanel();
        newTest = new javax.swing.JButton();
        runButton = new javax.swing.JButton();
        testId = new javax.swing.JTextField();
        funcListPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        statusPanel = new javax.swing.JPanel();
        statusLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        openFile = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        fileChooser.setSelectedFile(new java.io.File("D:\\Explorer\\Content\\Space\\javascript\\src"));
        fileChooser.setMinimumSize(new java.awt.Dimension(425, 250));
        fileChooser.setPreferredSize(new java.awt.Dimension(582, 400));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        newTest.setText("New test");
        newTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTestActionPerformed(evt);
            }
        });

        runButton.setText("Run Test");
        runButton.setEnabled(false);
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });

        testId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addComponent(testId, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newTest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 257, Short.MAX_VALUE)
                .addComponent(runButton)
                .addContainerGap())
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(newTest)
                .addComponent(testId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(runButton))
        );

        javax.swing.GroupLayout funcListPanelLayout = new javax.swing.GroupLayout(funcListPanel);
        funcListPanel.setLayout(funcListPanelLayout);
        funcListPanelLayout.setHorizontalGroup(
            funcListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(funcListPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        funcListPanelLayout.setVerticalGroup(
            funcListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addComponent(statusLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        statusPanelLayout.setVerticalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addComponent(statusLabel)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        openFile.setText("Open a JavaScript file");
        openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileActionPerformed(evt);
            }
        });
        jMenu1.add(openFile);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(funcListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(statusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(funcListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileActionPerformed
        // TODO add your handling code here:
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file;
            file = fileChooser.getSelectedFile();
            try {
              // What to do with the file, e.g. display it in a TextArea
                //textarea.read( new FileReader( file.getAbsolutePath() ), null );
                if(file.getAbsolutePath() != null){
                    if(file.isDirectory()){
                    
                    } else {
                        // Clear result from last browsing
                        //this.allFuncList.clear();
                        //ArrayList<ArrayList<String>> allFuncList = new ArrayList();
                        //this.allFileList.clear();
                        
                        // Instrument and get list of functions in that file   
                        // allFuncList [index => funcName,lines,params]
                        ArrayList<ArrayList<String>> allFuncList = generateFunctionList(file.getAbsolutePath(), INSMODE, DEVMODE);
                                                
                        // fileFuncList [index => filePath,allFuncList]
                        //ArrayList fileFuncList = new ArrayList();
                        //fileFuncList.add(filePath);
                        //fileFuncList.add(allFuncList);
                        
                        // allFileList [index => fileFuncList]
                        addTestId(allFuncList.get(0).get(1).toString(),testId.getText());
                        this.allFileList.put(file.getAbsolutePath(), allFuncList);
                        
                        // [fileName: {objName:funcName:lines:param}]
                        renderCheckBoxList(allFileList);
                        
                        
                        
                    }
                }

            } catch(Exception ex) {
                ex.toString();
            }
        } else {

        }
    }//GEN-LAST:event_openFileActionPerformed

    private void addTestId(String filePath, String id){
        List<String> lines = null;
    	StringBuilder code = new StringBuilder();
    	
    	try {
            lines = Files.readAllLines(Paths.get(filePath), Charset.defaultCharset());
            int lineNum = lines.size();
            for(int i = 0; i<lineNum; i++) {
                String line = lines.get(i);                
                if(line.contains("_jstestcoverage_func(") && !line.contains("\"(anonymous") ){
                    line = line.replace("_jstestcoverage_func(","_jstestcoverage_func('"+ id + "',");
                }
                if(line.contains("_jstestcoverage_line(") && !line.contains("\"(anonymous") ){
                    line = line.replace("_jstestcoverage_line(","_jstestcoverage_line('"+ id + "',");
                }
                if(line.contains("_jstestcoverage_") && !line.trim().startsWith("_jstestcoverage")){                    
                    line = line.replace("_jstestcoverage", "\r\n_jstestcoverage");
                }
                
                lines.set(i, line);
            }
            
            FileWriter writer = new FileWriter(filePath);
            for(String l: lines){
                l = l + "\r\n";
                writer.write(l);
            }	
            writer.close();
        } catch(Exception e){
            e.getMessage();
    	}
    }
    
    private ArrayList<ArrayList<String>> generateFunctionList(String filePath, String mode, Boolean devMode){
        
        try {
            JSCoverage jscov = new JSCoverage(filePath, mode, devMode);
            return jscov.getFunctionList();
        } catch(Exception e){
            e.toString();
            return null;
        }
        
    }
  
    private void renderCheckBoxList(HashMap list){
        Set<String> filePathList = list.keySet();
        
        for(String filePath : filePathList){
                       
            ArrayList<ArrayList<String>> allFuncList = (ArrayList<ArrayList<String>>) list.get(filePath);
            
            
            
            if(allFuncList!=null && allFuncList.size()>0){
                this.checkboxList.clear();
                this.checkboxList.repaint();
                testAbleFuncList.clear();
                
                for(ArrayList func : allFuncList){
                    if(func.size()>0){                        
                        String objName = (String)func.get(3);
                        objName = objName.replaceAll("\"", "");
                        String funcName = (String)func.get(4);
                        funcName = funcName.replaceAll("\"", "");
                        if(objName.length()>0){
                            funcName = objName + "." + funcName;
                        } 
                        
                        String param = (String)func.get(6);
                        param = param.replaceAll("\"", "");
                        JCheckBox cb =new JCheckBox("Function: " + funcName + " Parameter:" + param);
                        if(funcName.contains("(anonymous") ){
                            System.out.println();
                        }
                        if(param.contains("null") || funcName.contains("(anonymous") ){
                            cb.setEnabled(false);
                            //cb.setDisabledSelectedIcon(null);
                        } else {
                            this.checkboxList.addCheckbox(cb);
                            this.testAbleFuncList.add(func);
                        }
                    }
                }
                
                
                this.checkboxList.repaint();
                this.funcListPanel.repaint();                
                runButton.setEnabled(true);
            }
        }
    }
    
    
    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runButtonActionPerformed
         // TODO add your handling code here:
        ListModel currentList = checkboxList.getModel();
        this.selectedFuncList.clear();
        for (int i = 0; i < currentList.getSize(); i++) {
            JCheckBox cb = (JCheckBox) currentList.getElementAt(i);
            if(cb.isSelected()){
                this.selectedFuncList.add(testAbleFuncList.get(i));
            }
        }

        for (ArrayList func : this.selectedFuncList) {
            String testedFile = func.get(0).toString();
            String instrumentFilePath = func.get(1).toString();
            String modulePath = func.get(2).toString();
            String objName = func.get(3).toString().replaceAll("\"","");
            String funcName = func.get(4).toString().replaceAll("\"","");
            String[] line = func.get(5).toString().replaceAll("\"","").split(":");
            String[] param = func.get(6).toString().replaceAll("\"","").split("\\|");
            
            DOHTestCase tc = new DOHTestCase(testedFile, instrumentFilePath, modulePath, objName, funcName, Integer.parseInt(line[0]), Integer.parseInt(line[1]), param);            
            
            tc.execute();
        }


    }//GEN-LAST:event_runButtonActionPerformed

    private void testIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testIdActionPerformed

    private void newTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newTestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newTestActionPerformed

    private void runTest(ArrayList<String> selectedFuncList){
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JPanel funcListPanel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton newTest;
    private javax.swing.JMenuItem openFile;
    private javax.swing.JButton runButton;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JTextField testId;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
