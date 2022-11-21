/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.homework.controller;

import com.homework.doituong.Lop;
import com.homework.services.quanLyLop;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author HOME
 */
public class ThemLopController implements Initializable {

    @FXML
    private TextField txtMaLop;
    @FXML
    private TextField txtTenLop;
    @FXML
    private TextField txtGVCN;
    @FXML
    private Button btInsert;
    @FXML
    private Button btUpdate;
    @FXML
    private Button btClear;
    @FXML
    private Button btCheck;

    /**
     * Initializes the controller class.
     */
    
    ObservableList<Lop> dsLop = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        quanLyLop qlLop = new quanLyLop();
        try {
            qlLop.docDanhSachLop(dsLop);
        } catch (SQLException ex) {
            Logger.getLogger(ThemLopController.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtGVCN.setText("null");
    }    
    @FXML
    public void btInsert(ActionEvent evt) throws SQLException{
        if(txtMaLop.getText().isEmpty() || txtTenLop.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nhap du thong tín!", "Thong bao", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else{
            dsLop.clear();    
                try {
                    quanLyLop qlLop = new quanLyLop();
                    qlLop.docDanhSachLop(dsLop);
                } catch (SQLException ex) {
                    Logger.getLogger(ThemLopController.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
            
            boolean check = false;
            for(Lop lop : this.dsLop){
                if(lop.getMaLop().toLowerCase().equals(txtMaLop.getText().toLowerCase())){
                    check = true;
                }
            }
            if(check == true){
                txtGVCN.setText("null");
                txtTenLop.setText("");
                txtMaLop.setText("");
                JOptionPane.showMessageDialog(null, "Ma Lop ton tai!", "Thong bao", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            Statement stmt = null;
            try (Connection conn = com.homework.services.JdbcUtils.getConn()){   
                    if(txtGVCN.getText().isEmpty()){
                        txtGVCN.setText("null");
                    }
                   
                    String sql = "INSERT INTO lop (MaLop,TenLop,GVCN) VALUES ('"+ txtMaLop.getText() + "','"+txtTenLop.getText() + "','"+ txtGVCN.getText() + "')";
                    stmt = (Statement) conn.createStatement();
                    stmt.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null,sql,"Alter",JOptionPane.INFORMATION_MESSAGE);
                

            } 
                
        }
        
    
    @FXML
    public void btClear(ActionEvent evt){
        txtGVCN.setText("null");
        txtTenLop.setText("");
        txtMaLop.setText("");
        
    }

    @FXML
    private void btCheck(ActionEvent event) { 
        dsLop.clear();  
         try {
                quanLyLop qlLop = new quanLyLop();
                qlLop.docDanhSachLop(dsLop);
            } catch (SQLException ex) {
            Logger.getLogger(ThemLopController.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean checkTonTai = false;
        for(Lop lop : this.dsLop){
            if(lop.getMaLop().toLowerCase().equals(txtMaLop.getText().toLowerCase())){
                txtTenLop.setText(lop.getTenLop());
                txtGVCN.setText(lop.getgVCN());
                checkTonTai = true;
            }          
        }
        if(checkTonTai == false){
            JOptionPane.showMessageDialog(null, "Ma Lop khong ton tai!", "Thong bao", JOptionPane.ERROR_MESSAGE);
            txtTenLop.setText("");
            txtGVCN.setText("null");
            txtMaLop.setText("");
            return;
        }
    } 

    @FXML
    private void btUpdate(ActionEvent event) {
        dsLop.clear();
        boolean check = false;
         try {
                quanLyLop qlLop = new quanLyLop();
                qlLop.docDanhSachLop(dsLop);
            } catch (SQLException ex) { 
            Logger.getLogger(ThemLopController.class.getName()).log(Level.SEVERE, null, ex);
        }
         if(txtMaLop.getText().isEmpty() || txtTenLop.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nhap du thong tín!", "Thong bao", JOptionPane.ERROR_MESSAGE);
         }
         else{
             for(Lop lop : this.dsLop){
                 if(lop.getMaLop().toLowerCase().equals(txtMaLop.getText().toLowerCase())){
                     check = true;
                 }
             }
             if(check == false){
                    txtTenLop.setText("");
                     txtGVCN.setText("");
                     JOptionPane.showMessageDialog(null,"Ma Lop khong ton tai!","Thong bao",JOptionPane.INFORMATION_MESSAGE);
                     return;
             }
          try (Connection conn = com.homework.services.JdbcUtils.getConn()){
                String query = "update lop set TenLop ='"+txtTenLop.getText() + "',GVCN ='"+ txtGVCN.getText() + "' where MaLop ='" + txtMaLop.getText() +"'";
                Statement stmt = null;
                stmt = (Statement) conn.createStatement();
                stmt.execute(query);
                JOptionPane.showMessageDialog(null,"OK!","Thong bao",JOptionPane.INFORMATION_MESSAGE);
        }   catch (SQLException ex) { 
                Logger.getLogger(ThemLopController.class.getName()).log(Level.SEVERE, null, ex);
            } 
         }
    }
        
    
    }
    
    

