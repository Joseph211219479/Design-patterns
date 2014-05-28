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
public class MultNumbers implements Chain {
    private Chain nextInChain;
    private int total;
    
    @Override
    public void setNextChain(Chain nextChain) {
         this.nextInChain = nextChain;
    }

    @Override
    public int calculate(Numbers request) 
    {
        if(request.getCalculationWanted() == "mult")
            total = request.getNumber1() * request.getNumber2();
        else
            nextInChain.calculate(request);
        
        return total;    
    }
}
