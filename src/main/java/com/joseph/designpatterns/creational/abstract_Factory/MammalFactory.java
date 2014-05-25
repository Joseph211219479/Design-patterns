/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joseph.designpatterns.creational.abstract_Factory;

import com.joseph.designpatterns.creational.factory.AnimalInterface;
import com.joseph.designpatterns.creational.factory.Cat;
import com.joseph.designpatterns.creational.factory.Dog;

/**
 *
 * @author Common Sense
 */
public class MammalFactory implements SpeciesFactoryInterface
{
    @Override
    public AnimalInterface getAnimal(String type) 
    {
        if ("dog".equals(type)) 
        {
            return new Dog();
	} 
        else 
        {
            return new Cat();
	}
	}
}
