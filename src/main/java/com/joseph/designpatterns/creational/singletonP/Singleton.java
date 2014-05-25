/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joseph.designpatterns.creational.singletonP;

/**
 *
 * @author Common Sense
 */
public class Singleton {
    
    private static Singleton reset = null;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (reset == null) {
			reset = new Singleton();
		}
		return reset;
	}

	public void reset() {
		System.out.println("system has been reset");
	}
    
}
