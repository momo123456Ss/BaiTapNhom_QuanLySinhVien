/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.homework.controller;

import com.homework.doituong.MonHoc;
import static com.homework.doituong.sinhVien.isNumeric;
import com.homework.services.quanLyMonHoc;
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
public class ThemMHController implements Initializable {

    @FXML
    private TextField txtMaMH;
    @FXML
    private TextField txtTenMH;
    @FXML
    private TextField txtSoTinChi;
    @FXML
    private Button btCheck;
    @FXML
    private Button btInsert;
    @FXML
    private Button btUpdate;
    @FXML
    private Button btClear;

    /**
     * Initializes the controller class.
     */
    ObservableList<MonHoc> dsMH = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btInsert(ActionEvent event) {
        if(txtMaMH.getText().isEmpty() || txtTenMH.getText().isEmpty() || txtSoTinChi.getText().isEmpty()){
             JOptionPane.showMessageDialog(null,"Nhap thong tin!","Thong bao",JOptionPane.ERROR_MESSAGE);
        }
        else{
            if(!isNumeric(txtSoTinChi.getText().toString())){
                JOptionPane.showMessageDialog(null,"So tin chi phai la chu so!","Thong bao",JOptionPane.ERROR_MESSAGE);
            }
            else{
                Statement stmt = null;
                try {
                    dsMH.clear();
                    quanLyMonHoc qlMH = new quanLyMonHoc();
                    qlMH.docDanhSachMonHoc(dsMH);
                } catch (SQLException ex) { 
                    Logger.getLogger(ThemMHController.class.getName()).log(Level.SEVERE, null, ex);
                }
                boolean check = false;
                for(MonHoc mh : this.dsMH){
                    if(txtMaMH.getText().toLowerCase().equals(mh.getMaMH().toLowerCase())){
                        check = false;
                        JOptionPane.showMessageDialog(null,"Ton tai MaMH!","Thong bao",JOptionPane.ERROR_MESSAGE);
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
                        JOptionPane.showMessageDialog(null,"OK!","Alter",JOptionPane.INFORMATION_MESSAGE);
                    } catch (SQLException ex) {
                        Logger.getLogger(ThemMHController.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                }
            }
        }
    }

    @FXML
    private void btUpdate(ActionEvent event) {
        if(txtMaMH.getText().isEmpty() || txtTenMH.getText().isEmpty() || txtSoTinChi.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Nhap thong tin!","Thong bao",JOptionPane.ERROR_MESSAGE);
        }
        else{
            try {
            dsMH.clear();
            quanLyMonHoc qlMH = new quanLyMonHoc();
            qlMH.docDanhSachMonHoc(dsMH);
        }   catch (SQLException ex) { 
                Logger.getLogger(ThemMHController.class.getName()).log(Level.SEVERE, null, ex);
            }
            boolean checkMH = false;
            for(MonHoc mh : this.dsMH){
            if(mh.getMaMH().toLowerCase().equals(txtMaMH.getText().toLowerCase())){
                  checkMH = true;
            }
            }
            if(checkMH == false){
                JOptionPane.showMessageDialog(null,"Khong ton tai mon hoc!","Thong bao",JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(!isNumeric(txtSoTinChi.getText())){
                JOptionPane.showMessageDialog(null,"So tin chi phai la chu so!","Thong bao",JOptionPane.ERROR_MESSAGE);
            }
            else{
                try (Connection conn = com.homework.services.JdbcUtils.getConn()){
                String query = "update monhoc set TenMH ='"+txtTenMH.getText() + "',SoTinChi ='"+ Integer.parseInt(txtSoTinChi.getText()) + "' where MaMH ='" + txtMaMH.getText() +"'";
                Statement stmt = null;
                stmt = (Statement) conn.createStatement();
                stmt.execute(query);
                JOptionPane.showMessageDialog(null,"OK!","Thong bao",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(ThemMHController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex.toString(),"Thong bao",JOptionPane.INFORMATION_MESSAGE);
        }
            }
        }
    }

    @FXML
    private void btClear(ActionEvent event) {
        txtMaMH.setText("");
        txtTenMH.setText("");
        txtSoTinChi.setText("0");
    }

    @FXML
    private void btCheck(ActionEvent event) {
        if(txtMaMH.getText().isEmpty()){
            txtTenMH.setText("");
            txtSoTinChi.setText("0");
        }
        boolean check = false;
        try {
            dsMH.clear();
            quanLyMonHoc qlMH = new quanLyMonHoc();
            qlMH.docDanhSachMonHoc(dsMH);
        } catch (SQLException ex) { 
            Logger.getLogger(ThemMHController.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(MonHoc mh : this.dsMH){
            if(mh.getMaMH().toLowerCase().equals(txtMaMH.getText().toLowerCase())){
                txtTenMH.setText(mh.getTenMH());
                txtSoTinChi.setText(Integer.toString(mh.getSoTinChi()));
                check = true;
            }    
        }
        if(check == false){
                txtTenMH.setText("");
                txtSoTinChi.setText("0");
                JOptionPane.showMessageDialog(null,"Ma mon ko ton tai!","Thong bao",JOptionPane.ERROR_MESSAGE);

        }
    }
    
}
