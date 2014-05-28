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
public interface Chain {
    public void setNextChain( Chain nextChain);
    public int calculate(Numbers request );
}
