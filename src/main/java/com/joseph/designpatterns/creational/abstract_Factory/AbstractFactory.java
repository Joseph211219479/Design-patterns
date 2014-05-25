/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joseph.designpatterns.creational.abstract_Factory;

/**
 *
 * @author Common Sense
 */
public class AbstractFactory {
    public SpeciesFactoryInterface getSpeciesFactory(String type) 
    {
	if ("mammal".equals(type)) 
        {
            return new MammalFactory();
	} else 
        {
            return new ReptileFactory();
	}
    }
}
