/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.homework.jframeQLSinhVien;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author HOME
 */
public class mQuanLySinhVien extends javax.swing.JFrame {

    /**
     * Creates new form mQuanLySinhVien
     */
    public mQuanLySinhVien() {
        
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btThemSinhVien = new javax.swing.JButton();
        btThemLop = new javax.swing.JButton();
        btThemMonHoc = new javax.swing.JButton();
        btDangKyMon = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btInDSSinhVien = new javax.swing.JButton();
        btInDSLop = new javax.swing.JButton();
        btInDSMonHoc = new javax.swing.JButton();
        btTimKiemDangKy = new javax.swing.JButton();
        btBackLog = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chuc nang");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
            public void windowDeiconified(java.awt.event.WindowEvent evt) {
                formWindowDeiconified(evt);
            }
            public void windowIconified(java.awt.event.WindowEvent evt) {
                formWindowIconified(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Insert_Update");

        btThemSinhVien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btThemSinhVien.setText("Sinh Vien");
        btThemSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemSinhVienActionPerformed(evt);
            }
        });

        btThemLop.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btThemLop.setText("Lop");
        btThemLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemLopActionPerformed(evt);
            }
        });

        btThemMonHoc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btThemMonHoc.setText("MonHoc");
        btThemMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemMonHocActionPerformed(evt);
            }
        });

        btDangKyMon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btDangKyMon.setText("DKMH_Nhap Diem");
        btDangKyMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDangKyMonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("View");

        btInDSSinhVien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btInDSSinhVien.setText("Danh sach Sinh Vien");
        btInDSSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInDSSinhVienActionPerformed(evt);
            }
        });

        btInDSLop.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btInDSLop.setText("Danh sach Lop");
        btInDSLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInDSLopActionPerformed(evt);
            }
        });

        btInDSMonHoc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btInDSMonHoc.setText("Danh sach Mon hoc");
        btInDSMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInDSMonHocActionPerformed(evt);
            }
        });

        btTimKiemDangKy.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btTimKiemDangKy.setText("Danh sach Dang Ky");
        btTimKiemDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimKiemDangKyActionPerformed(evt);
            }
        });

        btBackLog.setText("Back");
        btBackLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackLogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(68, 68, 68)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(btBackLog))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btDangKyMon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btThemSinhVien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btThemLop, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btThemMonHoc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btInDSLop, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btInDSSinhVien)
                            .addComponent(btInDSMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btTimKiemDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)))
                    .addComponent(btBackLog))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThemSinhVien)
                    .addComponent(btInDSSinhVien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThemLop)
                    .addComponent(btInDSLop))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThemMonHoc)
                    .addComponent(btInDSMonHoc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDangKyMon)
                    .addComponent(btTimKiemDangKy))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInDSSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInDSSinhVienActionPerformed
        // TODO add your handling code here:
        danhSachSinhVien dsSV = new danhSachSinhVien();
        dsSV.show();

    }//GEN-LAST:event_btInDSSinhVienActionPerformed

    private void btInDSLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInDSLopActionPerformed
        // TODO add your handling code here:
        danhSachLop dsLop = new danhSachLop();
        dsLop.show();
        
    }//GEN-LAST:event_btInDSLopActionPerformed

    private void btInDSMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInDSMonHocActionPerformed
        // TODO add your handling code here:
        danhSachMonHoc dsMon = new danhSachMonHoc();
        dsMon.show();
       
    }//GEN-LAST:event_btInDSMonHocActionPerformed

    private void btTimKiemDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimKiemDangKyActionPerformed
        // TODO add your handling code here:
        danhSachHoc dsHoc = new danhSachHoc();
        dsHoc.show();
        
    }//GEN-LAST:event_btTimKiemDangKyActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
       
    }//GEN-LAST:event_formWindowClosing

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
        // TODO add your handling code here:
       
    }//GEN-LAST:event_formWindowDeactivated

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        // TODO add your handling code here:
       
    }//GEN-LAST:event_formWindowLostFocus

    private void formWindowDeiconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeiconified
        // TODO add your handling code here:
     
    }//GEN-LAST:event_formWindowDeiconified

    private void formWindowIconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowIconified
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowIconified

    private void btBackLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackLogActionPerformed
        // TODO add your handling code here:
        mLogin log = new mLogin();
        log.show();
        this.dispose();
    }//GEN-LAST:event_btBackLogActionPerformed

    private void btThemMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemMonHocActionPerformed
        // TODO add your handling code here:
        themMonHoc thMH = new themMonHoc();
        thMH.show();
    }//GEN-LAST:event_btThemMonHocActionPerformed

    private void btThemLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemLopActionPerformed
        // TODO add your handling code here:
        themLop thLop = new themLop();
        thLop.show();
    }//GEN-LAST:event_btThemLopActionPerformed

    private void btThemSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemSinhVienActionPerformed
        // TODO add your handling code here:
        themSinhVien thSV = new themSinhVien();
        thSV.show();
    }//GEN-LAST:event_btThemSinhVienActionPerformed

    private void btDangKyMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDangKyMonActionPerformed
        // TODO add your handling code here:
        SinhVien_MonHoc SV_MH = new SinhVien_MonHoc();
        SV_MH.show();
    }//GEN-LAST:event_btDangKyMonActionPerformed

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
            java.util.logging.Logger.getLogger(mQuanLySinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mQuanLySinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mQuanLySinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mQuanLySinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mQuanLySinhVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBackLog;
    private javax.swing.JButton btDangKyMon;
    private javax.swing.JButton btInDSLop;
    private javax.swing.JButton btInDSMonHoc;
    private javax.swing.JButton btInDSSinhVien;
    private javax.swing.JButton btThemLop;
    private javax.swing.JButton btThemMonHoc;
    private javax.swing.JButton btThemSinhVien;
    private javax.swing.JButton btTimKiemDangKy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
