/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.homework.jframeQLSinhVien;

import com.homework.doituong.Hoc;
import com.homework.doituong.MonHoc;
import com.homework.doituong.SinhVien;
import com.homework.services.Menu;
import com.homework.services.quanLyHoc;
import com.homework.services.quanLyMonHoc;
import com.homework.services.quanLySinhVien;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HOME
 */
public class SinhVien_MonHoc extends javax.swing.JFrame {

    /**
     * Creates new form SinhVien_MonHoc
     */
    public SinhVien_MonHoc() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaSV = new java.awt.TextField();
        txtMaMH = new java.awt.TextField();
        txtNgayDangKy = new java.awt.TextField();
        txtDiem = new java.awt.TextField();
        cbSubmit = new javax.swing.JComboBox<>();
        btDangDy = new javax.swing.JButton();
        btSuaDiem = new javax.swing.JButton();
        btSubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Dang Ky Mon_Nhap Diem");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("MaMH");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("MaSV");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Ngay dang ky");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Diem");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Submit");

        txtMaSV.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                txtMaSVTextValueChanged(evt);
            }
        });

        txtMaMH.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                txtMaMHTextValueChanged(evt);
            }
        });

        txtNgayDangKy.setEnabled(false);
        txtNgayDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayDangKyActionPerformed(evt);
            }
        });

        txtDiem.setText("0");

        cbSubmit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1" }));

        btDangDy.setText("Hoan thanh");
        btDangDy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDangDyActionPerformed(evt);
            }
        });

        btSuaDiem.setText("Nhap diem");
        btSuaDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaDiemActionPerformed(evt);
            }
        });

        btSubmit.setText("Submit All");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(77, 77, 77)
                            .addComponent(txtMaMH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(84, 84, 84)
                            .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(75, 75, 75)
                            .addComponent(cbSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(87, 87, 87)
                            .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(28, 28, 28)
                            .addComponent(txtNgayDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btSuaDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btDangDy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(txtMaMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3))
                    .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNgayDangKy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDangDy)
                    .addComponent(btSuaDiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSubmit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String boolToString(boolean a){
        
        if (a == true) {
            return "true";
        }
        else {
            return "false";
        }
    }
    
    private void txtNgayDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayDangKyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayDangKyActionPerformed
    private List<SinhVien> dsSV = new ArrayList<>();
    private List<MonHoc> dsMH = new ArrayList<>();
    private List<Hoc> dsHoc = new ArrayList<>();
    private void txtMaMHTextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_txtMaMHTextValueChanged
        // TODO add your handling code here:
        if(txtMaMH.getText().isEmpty() || txtMaSV.getText().isEmpty()){
            cbSubmit.enable(true);
            txtDiem.enable(true);
            txtNgayDangKy.setText("");
            txtDiem.setText("0.00");
            cbSubmit.setSelectedItem("false");
        }
        dsSV.clear(); dsMH.clear(); dsHoc.clear();
        
        quanLyHoc qlHoc = new quanLyHoc();
        try {
            qlHoc.docDanhSachHoc(dsHoc);
        } catch (SQLException ex) {
            Logger.getLogger(SinhVien_MonHoc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(SinhVien_MonHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(Hoc hc : this.dsHoc){
            if(hc.getMaMH().toLowerCase().equals(txtMaMH.getText().toLowerCase()) && Integer.toString(hc.getMaSV()).equals(txtMaSV.getText())){

                    txtNgayDangKy.setText(Menu.F.format(hc.getNgayDangKy()));
                    txtDiem.setText(Double.toString(hc.getDiem()));
                    cbSubmit.setSelectedItem(Integer.toString(hc.isSubmit()));
                
            }
            
        }
          if(cbSubmit.getSelectedItem().equals("1")){
            cbSubmit.enable(false);
            txtDiem.enable(false);
        } 
        else {
            cbSubmit.enable(true);
            txtDiem.enable(true);
        }
        
    }//GEN-LAST:event_txtMaMHTextValueChanged
    public int booleanPrimitiveToIntTernary(boolean foo) {
        return (foo) ? 1 : 0;
    }
    private void btDangDyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDangDyActionPerformed
        // TODO add your handling code here:
        Date date = new Date();
        String days =Menu.F.format(date);
        txtNgayDangKy.setText(days);
        Statement stmt = null;
        dsHoc.clear();
        dsSV.clear();
        dsMH.clear();
        quanLyHoc qlHoc = new quanLyHoc();
        quanLySinhVien qlSV = new quanLySinhVien();
        quanLyMonHoc qlMH = new quanLyMonHoc();
        try {
            qlSV.docDanhSachSinhVien(dsSV);
            qlHoc.docDanhSachHoc(dsHoc);
            qlMH.docDanhSachMonHoc(dsMH);
        } catch (SQLException ex) {
            Logger.getLogger(SinhVien_MonHoc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(SinhVien_MonHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        boolean checkSV = false;
        boolean checkMH = false;
        for(SinhVien sv : this.dsSV){
            if(Integer.toString(sv.getMaSV()).equals(txtMaSV.getText())){
                   checkSV = true;
            }

        }
        
        
        for(MonHoc mh : this.dsMH){
            if(mh.getMaMH().toLowerCase().equals(txtMaMH.getText().toLowerCase())){
                 checkMH = true;
            }
        }
        
        if(checkSV == true && checkMH == true){
         try (Connection conn = com.homework.services.JdbcUtils.getConn()){   
                    String sql = "INSERT INTO hoc (MaMH,MaSV,NgayDangKy,Diem,submit) VALUES ('"
                            + txtMaMH.getText() + "','"
                            + txtMaSV.getText() + "','"
                            + txtNgayDangKy.getText() + "','"
                            + 0 + "','"
                            + booleanPrimitiveToIntTernary(Boolean.parseBoolean(cbSubmit.getSelectedItem().toString()))+ "')";
                    JOptionPane.showMessageDialog(this,sql,"Alter",JOptionPane.INFORMATION_MESSAGE);
                    stmt = (Statement) conn.createStatement();
                    stmt.executeUpdate(sql);
                    
                
         } catch (SQLException ex) {
            Logger.getLogger(SinhVien_MonHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else{
              JOptionPane.showMessageDialog(this,"MaMH hoac MaSV ko ton tai","Alter",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btDangDyActionPerformed

    private void txtMaSVTextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_txtMaSVTextValueChanged
        // TODO add your handling code here:
         if(txtMaMH.getText().isEmpty() || txtMaSV.getText().isEmpty()){
            cbSubmit.enable(true);
            txtDiem.enable(true);
            txtNgayDangKy.setText("");
            txtDiem.setText("0.00");
            cbSubmit.setSelectedItem("0");
        }
         dsSV.clear(); dsMH.clear(); dsHoc.clear();
        
        quanLyHoc qlHoc = new quanLyHoc();
        try {
            qlHoc.docDanhSachHoc(dsHoc);
        } catch (SQLException ex) {
            Logger.getLogger(SinhVien_MonHoc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(SinhVien_MonHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(Hoc hc : this.dsHoc){
            if(hc.getMaMH().toLowerCase().equals(txtMaMH.getText().toLowerCase()) && Integer.toString(hc.getMaSV()).equals(txtMaSV.getText())){

                    txtNgayDangKy.setText(Menu.F.format(hc.getNgayDangKy()));
                    txtDiem.setText(Double.toString(hc.getDiem()));
                    cbSubmit.setSelectedItem(Integer.toString(hc.isSubmit()));
                
            }
            
        }
        if(cbSubmit.getSelectedItem().equals("1")){
            cbSubmit.enable(false);
            txtDiem.enable(false);
        } 
        else {
            cbSubmit.enable(true);
            txtDiem.enable(true);
        }
       
    }//GEN-LAST:event_txtMaSVTextValueChanged

    private void btSuaDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaDiemActionPerformed
        // TODO add your handling code here:
        if(txtMaMH.getText().isEmpty() || txtMaSV.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Nhap MaSV va MaMH ","Thong bao!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        dsHoc.clear();
        dsSV.clear();
        dsMH.clear();
        quanLyHoc qlHoc = new quanLyHoc();
        quanLySinhVien qlSV = new quanLySinhVien();
        quanLyMonHoc qlMH = new quanLyMonHoc();
        try {
            qlSV.docDanhSachSinhVien(dsSV);
            qlHoc.docDanhSachHoc(dsHoc);
            qlMH.docDanhSachMonHoc(dsMH);
        } catch (SQLException ex) {
            Logger.getLogger(SinhVien_MonHoc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(SinhVien_MonHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        if(txtNgayDangKy.getText().isEmpty()){
              JOptionPane.showMessageDialog(this, "Sinh vien chua dang ky mon!","Thong bao!",JOptionPane.ERROR_MESSAGE);
              return;
        }
        else{
            try (Connection conn = com.homework.services.JdbcUtils.getConn()){
                String query = "update hoc set Diem ='"
                        + Double.parseDouble(txtDiem.getText())
                        + "',submit ='"
                        + cbSubmit.getSelectedItem()
                        + "' where MaSV ='" + txtMaSV.getText() +"' and MaMH ='"
                        + txtMaMH.getText() + "'";
                Statement stmt = null;
                stmt = (Statement) conn.createStatement();
                stmt.execute(query);
                if(cbSubmit.getSelectedItem().equals("1")){
                    txtDiem.enable(false);
                    cbSubmit.enable(false);
                }
                else{
                    cbSubmit.enable(true);
                    txtDiem.enable(true);
                }
                JOptionPane.showMessageDialog(this,"OK!","Thong bao",JOptionPane.INFORMATION_MESSAGE);
        }   catch (SQLException ex) { 
                Logger.getLogger(SinhVien_MonHoc.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        
    }//GEN-LAST:event_btSuaDiemActionPerformed
    
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
            java.util.logging.Logger.getLogger(SinhVien_MonHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SinhVien_MonHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SinhVien_MonHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SinhVien_MonHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SinhVien_MonHoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDangDy;
    private javax.swing.JButton btSuaDiem;
    private javax.swing.JButton btSubmit;
    private javax.swing.JComboBox<String> cbSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private java.awt.TextField txtDiem;
    private java.awt.TextField txtMaMH;
    private java.awt.TextField txtMaSV;
    private java.awt.TextField txtNgayDangKy;
    // End of variables declaration//GEN-END:variables
}
