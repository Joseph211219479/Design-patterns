/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joseph.designpatterns.creational.prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Common Sense
 */
public class Sheep implements Animal
{
    public Sheep()
    {
    }
    @Override
    public Animal makeCopy() 
    {
        Sheep sheep = null;
        
        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Sheep.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return sheep;
    }
    public String stString()
    {
        return "sheep has been made";
    }
}
