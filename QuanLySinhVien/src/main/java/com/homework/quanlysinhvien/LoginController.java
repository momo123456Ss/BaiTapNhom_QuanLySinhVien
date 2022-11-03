/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.homework.quanlysinhvien;

import com.homework.doituong.userPassword;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author HOME
 */
public class LoginController implements Initializable {


    @FXML
    private TextField userName;
    @FXML
    private PasswordField passWord;
    @FXML
    private Button loginController;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
     @FXML
    private void qlSinhVienHandler(ActionEvent event) throws IOException {
        userPassword up = new userPassword();
        if(up.check(this.userName.getText(), this.passWord.getText())){
            
            App.setRoot("mainQuanLySinhVien");
        }
        else{
            
        }
        
    }
}
