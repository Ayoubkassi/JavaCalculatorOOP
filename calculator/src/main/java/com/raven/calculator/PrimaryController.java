package com.raven.calculator;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class PrimaryController {

//    @FXML
//    private void switchToSecondary() throws IOException {
//        App.setRoot("secondary");
//    }
    
    @FXML
    private Text actiontarget;
    @FXML 
    private TextField username;
    @FXML 
    private PasswordField passwordField;
    
    @FXML
    private void handleSubmitButtonAction() throws IOException{
        String user = username.getText();
        String password = passwordField.getText();
        boolean isLogedIn = (user.equals("Ayoubkassi") && password.equals("1234"));
        if(isLogedIn){
            actiontarget.setText("Loged In");
            App.setRoot("secondary");
        }else{
            actiontarget.setText("Error please try again");
        }
        
    }
}
