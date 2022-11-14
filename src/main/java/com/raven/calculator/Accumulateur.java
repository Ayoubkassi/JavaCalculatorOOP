/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.calculator;

import java.util.Stack;

/**
 *
 * @author ryota
 */
public class Accumulateur extends Stack{
    
    public int add(){
        int num1 = (int) this.pop();
        int num2 = (int) this.pop();
        return num1+num2;
    }
    
    public int sub(){
        int num1 = (int) this.pop();
        int num2 = (int) this.pop();
        return num1-num2;
    }
    
    public int mul(){
        int num1 = (int) this.pop();
        int num2 = (int) this.pop();
        return num1*num2;
    }
    
    public int div(){
        int num1 = (int) this.pop();
        int num2 = (int) this.pop();
        return num1/num2;                  
    }
}

