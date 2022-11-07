/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.homework.jframeQLSinhVien;

import com.homework.doituong.Hoc;
import com.homework.services.Menu;
import com.homework.services.quanLyHoc;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HOME
 */
public class danhSachHoc extends javax.swing.JFrame {

    /**
     * Creates new form danhSachHoc
     */
    public danhSachHoc() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbHoc = new javax.swing.JTable();
        label1 = new java.awt.Label();
        txtFHoc = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tbHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaMH", "MaSV", "Ngay dang ky", "Diem", "Submit"
            }
        ));
        jScrollPane1.setViewportView(tbHoc);

        label1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label1.setText("Tim kiem");

        txtFHoc.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtFHoc.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                txtFHocTextValueChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private List<Hoc> dsHoc = new ArrayList<>();
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        dsHoc.clear();
        try {
            quanLyHoc qlHoc = new quanLyHoc();
            qlHoc.docDanhSachHoc(dsHoc);
        } catch (SQLException ex) {
            Logger.getLogger(danhSachHoc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(danhSachHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultTableModel tbmHoc = (DefaultTableModel) tbHoc.getModel();
        for(Hoc hoc : this.dsHoc){
            tbmHoc.addRow(new Object[]{hoc.getMaMH(),hoc.getMaSV(),Menu.F.format(hoc.getNgayDangKy()),hoc.getDiem(),hoc.isSubmit()});
        }
    }//GEN-LAST:event_formWindowOpened
    public static boolean isNumeric(String string) {
        // Checks if the provided string
        // is a numeric by applying a regular
        // expression on it.
        String regex = "[0-9]+[\\.]?[0-9]*";
        return Pattern.matches(regex, string);
    }
    private void txtFHocTextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_txtFHocTextValueChanged
        // TODO add your handling code here:
        DefaultTableModel tbmHoc = (DefaultTableModel) tbHoc.getModel();
        if(txtFHoc.getText().isEmpty()){
            
            int rowCount = tbmHoc.getRowCount();
            for(int i = rowCount -1;i >= 0;i--){
                tbmHoc.removeRow(i);
            }
            for(Hoc hoc : this.dsHoc){
                tbmHoc.addRow(new Object[]{hoc.getMaMH(),hoc.getMaSV(),Menu.F.format(hoc.getNgayDangKy()),hoc.getDiem(),hoc.isSubmit()}); 
            }
        }
        else{
            int rowCount = tbmHoc.getRowCount();
            for(int i = rowCount -1;i >= 0;i--){
                tbmHoc.removeRow(i);
            }
            for(Hoc hoc : this.dsHoc){
                  if(isNumeric(txtFHoc.getText().toString())){
                    if(Integer.toString(hoc.getMaSV()).equals(txtFHoc.getText())){
                      tbmHoc.addRow(new Object[]{hoc.getMaMH(),hoc.getMaSV(),Menu.F.format(hoc.getNgayDangKy()),hoc.getDiem(),hoc.isSubmit()}); 
                    }
                  }
                  else{
                      if(hoc.getMaMH().toLowerCase().contains(txtFHoc.getText())){
                          tbmHoc.addRow(new Object[]{hoc.getMaMH(),hoc.getMaSV(),Menu.F.format(hoc.getNgayDangKy()),hoc.getDiem(),hoc.isSubmit()}); 
                      }
                  }
                  
            }
        }
    }//GEN-LAST:event_txtFHocTextValueChanged

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
            java.util.logging.Logger.getLogger(danhSachHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(danhSachHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(danhSachHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(danhSachHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new danhSachHoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JTable tbHoc;
    private java.awt.TextField txtFHoc;
    // End of variables declaration//GEN-END:variables
}