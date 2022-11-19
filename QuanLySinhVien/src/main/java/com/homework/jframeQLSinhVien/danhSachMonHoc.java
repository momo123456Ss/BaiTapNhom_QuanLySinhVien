/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package com.homework.jframeQLSinhVien;

import com.homework.doituong.MonHoc;
import com.homework.services.quanLyMonHoc;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HOME
 */
public class danhSachMonHoc extends javax.swing.JFrame {

    /** Creates new form danhSachMonHoc */
    public danhSachMonHoc() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDSMonHoc = new javax.swing.JTable();
        txtFMonHoc = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Tim kiem");

        tbDSMonHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaMH", "TenMH", "So tin chi"
            }
        ));
        tbDSMonHoc.setEnabled(false);
        jScrollPane1.setViewportView(tbDSMonHoc);

        txtFMonHoc.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtFMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFMonHocActionPerformed(evt);
            }
        });
        txtFMonHoc.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                txtFMonHocTextValueChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtFMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private List<MonHoc> dsMonHoc = new ArrayList<>();
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        dsMonHoc.clear();
        try {
            quanLyMonHoc qlMonHoc = new quanLyMonHoc();
            qlMonHoc.docDanhSachMonHoc(dsMonHoc);
        } catch (SQLException ex) {
            Logger.getLogger(danhSachMonHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
         DefaultTableModel tbmMonHoc = (DefaultTableModel) tbDSMonHoc.getModel();
        for(MonHoc mh : this.dsMonHoc){
            tbmMonHoc.addRow(new Object[]{mh.getMaMH(),mh.getTenMH(),mh.getSoTinChi()});
        }
    }//GEN-LAST:event_formWindowOpened

    private void txtFMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFMonHocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFMonHocActionPerformed

    private void txtFMonHocTextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_txtFMonHocTextValueChanged
        // TODO add your handling code here:
        if(txtFMonHoc.getText().isEmpty()){
            DefaultTableModel tbmMonHoc = (DefaultTableModel) tbDSMonHoc.getModel();
            int rowCount = tbmMonHoc.getRowCount();
            for(int i = rowCount -1;i >= 0;i--){
                tbmMonHoc.removeRow(i);
            }
            for(MonHoc mh : this.dsMonHoc){
                tbmMonHoc.addRow(new Object[]{mh.getMaMH(),mh.getTenMH(),mh.getSoTinChi()});  
            }
        }
        else{
            DefaultTableModel tbmMonHoc  = (DefaultTableModel) tbDSMonHoc.getModel();
            int rowCount = tbmMonHoc.getRowCount();
            for(int i = rowCount -1;i >= 0;i--){
                tbmMonHoc.removeRow(i);
            }
            for(MonHoc mh : this.dsMonHoc){
                if(mh.getMaMH().toLowerCase().contains(txtFMonHoc.getText().toLowerCase()) || mh.getTenMH().toLowerCase().contains(txtFMonHoc.getText().toLowerCase())){
                    tbmMonHoc.addRow(new Object[]{mh.getMaMH(),mh.getTenMH(),mh.getSoTinChi()});
                }
            }
        }
    }//GEN-LAST:event_txtFMonHocTextValueChanged

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
            java.util.logging.Logger.getLogger(danhSachMonHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(danhSachMonHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(danhSachMonHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(danhSachMonHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new danhSachMonHoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDSMonHoc;
    private java.awt.TextField txtFMonHoc;
    // End of variables declaration//GEN-END:variables

}
