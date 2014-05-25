/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joseph.designpatterns.creational.abstract_Factory;

import com.joseph.designpatterns.creational.factory.AnimalInterface;

/**
 *
 * @author Common Sense
 */
public class ReptileFactory implements SpeciesFactoryInterface 
{
     @Override
     public AnimalInterface getAnimal(String type) {
	if ("snake".equals(type)) 
        {
            return new Snake();
	} 
        else 
        {
            return new Tyrannosaurus();
	}
}
}
