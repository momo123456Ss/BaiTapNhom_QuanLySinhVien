/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.homework.controller;

import com.homework.doituong.Lop;
import com.homework.doituong.sinhVien;
import com.homework.services.quanLyLop;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
/**
 * FXML Controller class
 *
 * @author HOME
 */
public class DsLopController implements Initializable {
    

    @FXML
    private TableColumn<Lop, String> tenLop;
    @FXML
    private TableView<Lop> tbLop;
    
    ObservableList<Lop> dsLop = FXCollections.observableArrayList();
    @FXML
    private TableColumn<Lop, String> maLopFX;
    @FXML
    private TableColumn<Lop, String> gVCN;
    @FXML
    private TextField txtSearch;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            loadData();
        } catch (SQLException ex) {
            Logger.getLogger(DsLopController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(DsLopController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        FilteredList<Lop> fileteredData = new FilteredList<>(dsLop, b -> true);
        txtSearch.textProperty().addListener((observable,oldValue,newValue) -> {
            fileteredData.setPredicate(Lop -> {
                if(newValue == null || newValue.isEmpty()){
                    return true;
                }
                String lowerCaseFilter = newValue.toLowerCase();
                
                if(Lop.getgVCN().toLowerCase().indexOf(lowerCaseFilter) != -1){
                    return true;
                }
                if(Lop.getMaLop().toLowerCase().indexOf(lowerCaseFilter) != -1){
                    return true;
                }
                else
                    return false;
            });
        });
        SortedList<Lop> sortData = new SortedList<>(fileteredData);
        
        sortData.comparatorProperty().bind(tbLop.comparatorProperty());
        
        tbLop.setItems(sortData);
        
    }    
    private void loadData() throws SQLException, ParseException {
        maLopFX.setCellValueFactory(new PropertyValueFactory<>("MaLop"));
        tenLop.setCellValueFactory(new PropertyValueFactory<>("TenLop"));
        gVCN.setCellValueFactory(new PropertyValueFactory<>("GVCN"));
        
        
        
        quanLyLop qlLop = new quanLyLop();
        qlLop.docDanhSachLop(dsLop);
        tbLop.setItems(dsLop);      
        tbLop.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        tbLop.getColumns().addAll(this.maLopFX,this.tenLop,this.gVCN);
        
        
    }
}
