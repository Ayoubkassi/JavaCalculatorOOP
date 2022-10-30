/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.calculator;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author ryota
 */
public class CalcController {
    @FXML
    private TextField textField;
    
    @FXML
    private void loadWhenClicked(ActionEvent event){
        Button button = (Button) event.getSource();
        String actualVal = button.getText();
        
        String previousVal = textField.getText();
        String current = previousVal.concat(actualVal);
        textField.setText(current);
        
    }
}
