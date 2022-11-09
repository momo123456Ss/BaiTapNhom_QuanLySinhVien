/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package com.homework.jframeQLSinhVien;


import com.homework.doituong.Lop;
import com.homework.doituong.SinhVien;
import com.homework.services.Menu;
import com.homework.services.quanLyLop;
import com.homework.services.quanLySinhVien;
import static com.homework.services.quanLySinhVien.isValidDate;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author HOME
 */
public class themSinhVien extends javax.swing.JFrame {

    /** Creates new form themSinhVien */
    public themSinhVien() {
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbMaLop = new javax.swing.JComboBox<>();
        txtQuequan = new java.awt.TextField();
        txtTen = new java.awt.TextField();
        txtHo = new java.awt.TextField();
        txtMaSV = new java.awt.TextField();
        cbGioiTinh = new javax.swing.JComboBox<>();
        txtNgaySinh = new java.awt.TextField();
        label1 = new java.awt.Label();
        btInsert = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        btClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Insert_Update");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("MaSV");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Ho");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Ten");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Gioi tinh");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Ngay sinh");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Que quan");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Ma lop");

        txtMaSV.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                txtMaSVTextValueChanged(evt);
            }
        });

        cbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "null", "Nam", "Nu", "Khac" }));

        label1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label1.setText("yyyy-MM-dd");

        btInsert.setText("Insert");
        btInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInsertActionPerformed(evt);
            }
        });

        btUpdate.setText("Update");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        btClear.setText("Clear");
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btClear)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btUpdate)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btInsert))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addGap(22, 22, 22)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbMaLop, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMaSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtHo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtQuequan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtHo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(txtQuequan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInsert)
                    .addComponent(btUpdate)
                    .addComponent(btClear))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private List<SinhVien> dsSV = new ArrayList<>();
    private List<Lop> dsLop = new ArrayList<>();
    int dem = 0;
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        dsLop.clear();  
        cbMaLop.addItem("null");
        try {
             quanLyLop qlLop = new quanLyLop();
            qlLop.docDanhSachLop(dsLop);
        } catch (SQLException ex) {
            Logger.getLogger(themSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(Lop lop : this.dsLop){
            cbMaLop.addItem(lop.getMaLop());
        }
        
        dsSV.clear();    
            
            try {
                quanLySinhVien qlSV = new quanLySinhVien();
                qlSV.docDanhSachSinhVien(dsSV);
            } catch (SQLException ex) {
                Logger.getLogger(themSinhVien.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(themSinhVien.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            for(SinhVien sv : this.dsSV){
                dem++;
            }
             txtMaSV.setText(Integer.toString(dem+1));
    }//GEN-LAST:event_formWindowOpened
    
    private void btInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInsertActionPerformed
        // TODO add your handling code here:
        dem = 0;
        dsSV.clear();    
            
            try {
                quanLySinhVien qlSV = new quanLySinhVien();
                qlSV.docDanhSachSinhVien(dsSV);
            } catch (SQLException ex) {
                Logger.getLogger(themSinhVien.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(themSinhVien.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            for(SinhVien sv : this.dsSV){
                dem++;
            }
             txtMaSV.setText(Integer.toString(dem+1));
        if(txtHo.getText().isEmpty() || txtTen.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Nhap thong tin!","Thong bao",JOptionPane.ERROR_MESSAGE);
            return;
        }
        else{
            dsSV.clear();    
            try {
                quanLySinhVien qlSV = new quanLySinhVien();
                qlSV.docDanhSachSinhVien(dsSV);
            } catch (SQLException ex) {
                Logger.getLogger(themSinhVien.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(themSinhVien.class.getName()).log(Level.SEVERE, null, ex);
            }
            boolean check = false;
            int dem = 0;
            for(SinhVien sv : this.dsSV){
                if(txtMaSV.getText().equals(Integer.toString(sv.getMaSV()))){
                    JOptionPane.showMessageDialog(this, "Ma SV ton tai!", "Thong bao", JOptionPane.ERROR_MESSAGE);
                    return;
                }

            }
            
            Statement stmt = null;
            try (Connection conn = com.homework.services.JdbcUtils.getConn()){   
                    if(txtQuequan.getText().isEmpty()){
                        txtQuequan.setText("null");
                    }
                    if (txtNgaySinh.getText().isEmpty()){
                        txtNgaySinh.setText("1990-01-01");
                    }
                    if(!isValidDate(txtNgaySinh.getText())){
                           JOptionPane.showMessageDialog(this, "Ngay sinh phai la yyyy-MM-dd!", "Thong bao", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    String sql = "INSERT INTO sinhvien (MaSV,HoSV,TenSV,GioiTinh,NgaySinh,QueQuan,MaLop) VALUES ('"
                            + txtMaSV.getText() + "','"
                            +txtHo.getText() + "','"
                            +txtTen.getText() + "','"
                            +cbGioiTinh.getSelectedItem() + "','"
                            +txtNgaySinh.getText() + "','"
                            +txtQuequan.getText() + "','"
                            +cbMaLop.getSelectedItem()+ "')";
                    JOptionPane.showMessageDialog(this,sql,"Alter",JOptionPane.INFORMATION_MESSAGE);
                    stmt = (Statement) conn.createStatement();
                    stmt.executeUpdate(sql);
                    
                

            } catch (SQLException ex) {
                Logger.getLogger(themLop.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_btInsertActionPerformed

    private void txtMaSVTextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_txtMaSVTextValueChanged
        // TODO add your handling code here:
       dsSV.clear();    
            
            try {
                quanLySinhVien qlSV = new quanLySinhVien();
                qlSV.docDanhSachSinhVien(dsSV);
            } catch (SQLException ex) {
                Logger.getLogger(themSinhVien.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(themSinhVien.class.getName()).log(Level.SEVERE, null, ex);
            }
        for(SinhVien sv : this.dsSV){
            if(Integer.toString(sv.getMaSV()).equals(txtMaSV.getText())){
                txtHo.setText(sv.getHoSV());
                txtTen.setText(sv.getTenSV());
                cbGioiTinh.setSelectedItem(sv.getGioiTinh());
                txtNgaySinh.setText(Menu.F.format(sv.getNgaySinh()).toString());
                txtQuequan.setText(sv.getQueQuan());
                cbMaLop.setSelectedItem(sv.getMaLop());
            }
            else if(txtMaSV.getText().isEmpty()){
                txtHo.setText("");
                txtTen.setText("");
                cbGioiTinh.setSelectedItem("null");
                txtNgaySinh.setText("1990-01-01");
                txtQuequan.setText("");
                cbMaLop.setSelectedItem("null");
                
            }
        }
    }//GEN-LAST:event_txtMaSVTextValueChanged

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        // TODO add your handling code here:
        if(txtHo.getText().isEmpty() || txtTen.getText().isEmpty()){
             JOptionPane.showMessageDialog(this,"MaSV - Ho - Ten khong duoc de trong!","Thong bao",JOptionPane.INFORMATION_MESSAGE);
             return;
        }
        dsSV.clear();    
            
            try {
                quanLySinhVien qlSV = new quanLySinhVien();
                qlSV.docDanhSachSinhVien(dsSV);
            } catch (SQLException ex) {
                Logger.getLogger(themSinhVien.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(themSinhVien.class.getName()).log(Level.SEVERE, null, ex);
            }
        boolean checkSV = false; 
        for(SinhVien sv : this.dsSV){
            if(txtMaSV.getText().equals(Integer.toString(sv.getMaSV()))){
//                  JOptionPane.showMessageDialog(this,"MaSV khong ton tai!","Thong bao",JOptionPane.INFORMATION_MESSAGE);
//                  return;
                    checkSV = true;
            }
        }
        if(checkSV == false){
                  JOptionPane.showMessageDialog(this,"MaSV khong ton tai!","Thong bao",JOptionPane.INFORMATION_MESSAGE);
                  return;
        }
         if(!isValidDate(txtNgaySinh.getText())){
            JOptionPane.showMessageDialog(this, "Ngay sinh phai la yyyy-MM-dd!", "Thong bao", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try (Connection conn = com.homework.services.JdbcUtils.getConn()){
                String query = "update sinhvien set HoSV ='"
                        +txtHo.getText() 
                        + "',TenSV ='"
                        + txtTen.getText()
                        + "',GioiTinh ='"
                        + cbGioiTinh.getSelectedItem()
                        + "',NgaySinh ='"
                        + txtNgaySinh.getText()
                        + "',QueQuan ='"
                        + txtQuequan.getText()
                        + "',MaLop ='"
                        + cbMaLop.getSelectedItem()
                        + "' where MaSV ='" + txtMaSV.getText() +"'";
                Statement stmt = null;
                stmt = (Statement) conn.createStatement();
                stmt.execute(query);
                JOptionPane.showMessageDialog(this,"OK!","Thong bao",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(themMonHoc.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,ex.toString(),"Thong bao",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btUpdateActionPerformed

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        // TODO add your handling code here:
            dem = 0;
            dsSV.clear();    
            
            try {
                quanLySinhVien qlSV = new quanLySinhVien();
                qlSV.docDanhSachSinhVien(dsSV);
            } catch (SQLException ex) {
                Logger.getLogger(themSinhVien.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(themSinhVien.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            for(SinhVien sv : this.dsSV){
                dem++;
            }
            txtMaSV.setText(Integer.toString(dem+1));
            txtHo.setText("");
            txtTen.setText("");
            cbGioiTinh.setSelectedItem("null");
            txtNgaySinh.setText("1990-01-01");
            txtQuequan.setText("");
            cbMaLop.setSelectedItem("null");
    }//GEN-LAST:event_btClearActionPerformed

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
            java.util.logging.Logger.getLogger(themSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(themSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(themSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(themSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new themSinhVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClear;
    private javax.swing.JButton btInsert;
    private javax.swing.JButton btUpdate;
    private javax.swing.JComboBox<String> cbGioiTinh;
    private javax.swing.JComboBox<String> cbMaLop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private java.awt.Label label1;
    private java.awt.TextField txtHo;
    private java.awt.TextField txtMaSV;
    private java.awt.TextField txtNgaySinh;
    private java.awt.TextField txtQuequan;
    private java.awt.TextField txtTen;
    // End of variables declaration//GEN-END:variables

}
