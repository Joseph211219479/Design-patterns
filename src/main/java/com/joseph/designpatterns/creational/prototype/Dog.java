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
public class Dog implements PrototypeInterface
{
        String sound;

	public Dog(String sound) 
        {
		this.sound = sound;
	}

	@Override
	public PrototypeInterface doClone() {
		return new Dog(sound);
	}

        @Override
	public String toString() 
        {
		return "This dog says " + sound;
    
}
}