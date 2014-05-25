/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joseph.designpatterns.creational.prototype;

/**
 *
 * @author Common Sense
 */
public class Person implements PrototypeInterface
{
    String name;

	public Person(String name) 
        {
            this.name = name;
	}

	@Override
	public PrototypeInterface doClone() 
        {
            return new Person(name);
	}

	public String toString() 
        {
            return "This person is named " + name;
	}

    
}