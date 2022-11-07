/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package com.homework.jframeQLSinhVien;

import com.homework.doituong.MonHoc;
import static com.homework.jframeQLSinhVien.danhSachHoc.isNumeric;
import com.homework.services.quanLyMonHoc;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HOME
 */
public class themMonHoc extends javax.swing.JFrame {

    /** Creates new form themMonHoc */
    public themMonHoc() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMaMH = new java.awt.TextField();
        txtTenMH = new java.awt.TextField();
        txtSoTinChi = new java.awt.TextField();
        btThem = new javax.swing.JButton();
        btClear = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Yellow"));
        setBounds(new java.awt.Rectangle(400, 200, 0, 0));
        setMaximumSize(new java.awt.Dimension(299, 217));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Insert - Update");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Ma mon hoc");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Ten mon hoc");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("So tin chi");

        txtMaMH.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtMaMH.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                txtMaMHTextValueChanged(evt);
            }
        });

        txtTenMH.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtSoTinChi.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btThem.setText("Insert");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btClear.setText("Clear");
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearActionPerformed(evt);
            }
        });

        btUpdate.setText("Update");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btThem))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMaMH, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSoTinChi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenMH, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(45, 45, 45))
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtMaMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(txtTenMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btThem)
                            .addComponent(btClear)
                            .addComponent(btUpdate)))
                    .addComponent(txtSoTinChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private List<MonHoc> dsMH = new ArrayList<>();
    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        // TODO add your handling code here:
        if(txtMaMH.getText().isEmpty() || txtTenMH.getText().isEmpty() || txtSoTinChi.getText().isEmpty()){
             JOptionPane.showMessageDialog(this,"Nhap thong tin!","Thong bao",JOptionPane.ERROR_MESSAGE);
        }
        else{
            if(!isNumeric(txtSoTinChi.getText().toString())){
                JOptionPane.showMessageDialog(this,"So tin chi phai la chu so!","Thong bao",JOptionPane.ERROR_MESSAGE);
            }
            else{
                Statement stmt = null;
                try {
                    dsMH.clear();
                    quanLyMonHoc qlMH = new quanLyMonHoc();
                    qlMH.docDanhSachMonHoc(dsMH);
                } catch (SQLException ex) {
                    Logger.getLogger(themMonHoc.class.getName()).log(Level.SEVERE, null, ex);
                }
                boolean check = false;
                for(MonHoc mh : this.dsMH){
                    if(txtMaMH.getText().toLowerCase().equals(mh.getMaMH().toLowerCase())){
                        check = false;
                        JOptionPane.showMessageDialog(this,"Ton tai MaMH!","Thong bao",JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    else{
                        check = true;
                    }
                }
                
                if(check == true){  
                    try (Connection conn = com.homework.services.JdbcUtils.getConn()){
                        stmt = (Statement) conn.createStatement();
                        String query = "INSERT INTO monhoc " + "VALUES ('" + txtMaMH.getText().toString() + "','" + txtTenMH.getText().toString() + "'," + Integer.parseInt(txtSoTinChi.getText().toString()) + ")";
                        stmt.executeUpdate(query);
                        JOptionPane.showMessageDialog(this,"OK!","Alter",JOptionPane.INFORMATION_MESSAGE);
                    } catch (SQLException ex) {
                        Logger.getLogger(themMonHoc.class.getName()).log(Level.SEVERE, null, ex);
                        }
                }
            }
        }
    }//GEN-LAST:event_btThemActionPerformed

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        // TODO add your handling code here:
        txtMaMH.setText("");
        txtTenMH.setText("");
        txtSoTinChi.setText("");
    }//GEN-LAST:event_btClearActionPerformed

    private void txtMaMHTextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_txtMaMHTextValueChanged
        // TODO add your handling code here:
        
        if(txtMaMH.getText().isEmpty()){
            txtTenMH.setText("");
            txtSoTinChi.setText("");
        }
        
        try {
            dsMH.clear();
            quanLyMonHoc qlMH = new quanLyMonHoc();
            qlMH.docDanhSachMonHoc(dsMH);
        } catch (SQLException ex) {
            Logger.getLogger(themMonHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(MonHoc mh : this.dsMH){
            if(mh.getMaMH().toLowerCase().equals(txtMaMH.getText().toLowerCase())){
                txtTenMH.setText(mh.getTenMH());
                txtSoTinChi.setText(Integer.toString(mh.getSoTinChi()));
            }

           
        }
       
    }//GEN-LAST:event_txtMaMHTextValueChanged

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        // TODO add your handling code here:
        if(txtMaMH.getText().isEmpty() || txtTenMH.getText().isEmpty() || txtSoTinChi.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Nhap thong tin!","Thong bao",JOptionPane.ERROR_MESSAGE);
        }
        else{
            try {
            dsMH.clear();
            quanLyMonHoc qlMH = new quanLyMonHoc();
            qlMH.docDanhSachMonHoc(dsMH);
        } catch (SQLException ex) {
            Logger.getLogger(themMonHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            for(MonHoc mh : this.dsMH){
            if(!mh.getMaMH().toLowerCase().equals(txtMaMH.getText().toLowerCase())){
                  
                JOptionPane.showMessageDialog(this,"Khong ton tai mon hoc!","Thong bao",JOptionPane.ERROR_MESSAGE);
                return;
            }
            }
            if(!isNumeric(txtSoTinChi.getText())){
                JOptionPane.showMessageDialog(this,"So tin chi phai la chu so!","Thong bao",JOptionPane.ERROR_MESSAGE);
            }
            else{
                try (Connection conn = com.homework.services.JdbcUtils.getConn()){
                String query = "update monhoc set TenMH ='"+txtTenMH.getText() + "',SoTinChi ='"+ Integer.parseInt(txtSoTinChi.getText()) + "' where MaMH ='" + txtMaMH.getText() +"'";
                Statement stmt = null;
                stmt = (Statement) conn.createStatement();
                stmt.execute(query);
                JOptionPane.showMessageDialog(this,"OK!","Thong bao",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(themMonHoc.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,ex.toString(),"Thong bao",JOptionPane.INFORMATION_MESSAGE);
        }
            }
        }
    }//GEN-LAST:event_btUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(themMonHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(themMonHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(themMonHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(themMonHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new themMonHoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClear;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private java.awt.TextField txtMaMH;
    private java.awt.TextField txtSoTinChi;
    private java.awt.TextField txtTenMH;
    // End of variables declaration//GEN-END:variables

}
