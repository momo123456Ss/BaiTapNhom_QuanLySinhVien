/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.homework.controller;

import com.homework.doituong.Lop;
import com.homework.services.quanLyLop;
import java.net.URL;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author HOME
 */
public class DsLopHocController implements Initializable {

    @FXML
    private TableView<Lop> tbLopHoc;
    @FXML
    private TableColumn<Lop, String> maLop;
    @FXML
    private TableColumn<Lop, String> tenLop;
    @FXML
    private TableColumn<Lop, String> gVCN;

    /**
     * Initializes the controller class.
     */
    
    ObservableList<Lop> dsLop = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            loadData();
        } catch (SQLException ex) {
            Logger.getLogger(DsLopHocController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(DsLopHocController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    private void loadData() throws SQLException, ParseException {
        maLop.setCellValueFactory(new PropertyValueFactory<>("MaLop"));
        tenLop.setCellValueFactory(new PropertyValueFactory<>("TenLop"));
        gVCN.setCellValueFactory(new PropertyValueFactory<>("GVCN"));
        
        
        
        quanLyLop qlMH = new quanLyLop();
        qlMH.docDanhSachLop(dsLop);
        tbLopHoc.setItems(dsLop);      
        tbLopHoc.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        tbLopHoc.getColumns().addAll(this.maLop,this.tenLop,this.gVCN);
    }
}
