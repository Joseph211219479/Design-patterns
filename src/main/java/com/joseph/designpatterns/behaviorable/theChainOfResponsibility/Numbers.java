/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joseph.designpatterns.behaviorable.theChainOfResponsibility;

/**
 *
 * @author Common Sense
 */
public class Numbers {
    private int number1;
    private int number2;
    
    private String CalculationWanted;

    public Numbers(int i, int i0, String add) 
    {
        number1 = i;
        number2 = i0;
        CalculationWanted = add;    
    }
    
    
    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public String getCalculationWanted() {
        return CalculationWanted;
    }
    
    
}
