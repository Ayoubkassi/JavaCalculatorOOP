/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.calculator;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author ryota
 */
public class CalcController {
    @FXML
    private TextField textField;
    @FXML
    private Label val1;
    @FXML
    private Label val2;
    @FXML
    private Label val3;
    
    Accumulateur sack;
    
    //here i must use dependency injection
    private Accumulateur stack;
    public CalcController(){
        this.stack = new Accumulateur();
    }
    
    @FXML
    private void loadWhenClicked(ActionEvent event){
        Button button = (Button) event.getSource();
        String actualVal = button.getText();
        
        String previousVal = textField.getText();
        String current = previousVal.concat(actualVal);
        textField.setText(current);
        
    }
    
    @FXML
    private void pushVal(ActionEvent event){
        int val = Integer.parseInt(textField.getText());
        stack.push(val);
        //change the val to null
        textField.setText(null);
        
        //update the labels;
        val1.setText(String.valueOf(val));
    }
}
