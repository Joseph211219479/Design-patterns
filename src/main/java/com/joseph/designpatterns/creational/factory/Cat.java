/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joseph.designpatterns.creational.factory;

/**
 *
 * @author Common Sense
 */
public class Cat implements AnimalInterface
{
    @Override
    public String makeSound() 
    {
	return "Meow";
    }
}
