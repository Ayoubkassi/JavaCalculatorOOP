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
    
    private int  itterator ;
    
    //here i must use dependency injection
    private Accumulateur stack;
    Label[] tableLabels;
    public CalcController(){
        this.stack = new Accumulateur();
        this.itterator = 0;
        
        System.out.println(itterator);

        
        
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
    private void reset(){
        stack.clear();
        val1.setText("");
        val2.setText("");
        val3.setText("");
    }
    
    //operations
    @FXML
    private void sub(){
        int result = stack.sub();
        stack.push(result);
        
        String temp = val2.getText();
        val2.setText(val1.getText());
        val3.setText(temp);
        val1.setText(String.valueOf(result));
    }
    
    @FXML
    private void add(){
        int result = stack.add();
        stack.push(result);
        
        String temp = val2.getText();
        val2.setText(val1.getText());
        val3.setText(temp);
        val1.setText(String.valueOf(result));
    }
    
    @FXML
    private void mul(){
        int result = stack.mul();
        stack.push(result);
        
        String temp = val2.getText();
        val2.setText(val1.getText());
        val3.setText(temp);
        val1.setText(String.valueOf(result));
    }
    
    @FXML
    private void div(){
        int result = stack.div();
        stack.push(result);
        
        String temp = val2.getText();
        val2.setText(val1.getText());
        val3.setText(temp);
        val1.setText(String.valueOf(result));
    }
    
    
    @FXML
    private void pushVal(ActionEvent event){
        int val = Integer.parseInt(textField.getText());
        stack.push(val);
        //change the val to null
        textField.setText(null);
        
        //animation function
        if(itterator >= 3){
            
            String temp = val2.getText();
            val2.setText(val1.getText());
            val3.setText(temp);
            val1.setText(String.valueOf(val));
        }else{
        
            //update the labels;
            if(itterator%3 == 0){
                val3.setText(String.valueOf(val));
            }
            else if(itterator%3 == 1){
                val2.setText(String.valueOf(val));
            }else{
                val1.setText(String.valueOf(val));
            }
        }
        
        itterator++;
//        itterator%= 3;


        
        textField.setText("");
        
//        if(itterator>=0){
//            
//        }
    }
}
