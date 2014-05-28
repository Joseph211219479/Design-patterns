/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joseph.designPatterns.test.creational;

import com.joseph.designpatterns.creational.abstract_Factory.AbstractFactory;
import com.joseph.designpatterns.creational.abstract_Factory.SpeciesFactoryInterface;
import com.joseph.designpatterns.creational.factory.AnimalInterface;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Common Sense
 */
public class AbstractFactoryTest {
    
    public AbstractFactoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void test() 
     {
          AbstractFactory abstractFactory = new AbstractFactory();
        

		SpeciesFactoryInterface speciesFactory1 = abstractFactory.getSpeciesFactory("reptile");
		AnimalInterface a1 = speciesFactory1.getAnimal("tyrannosaurus");
                Assert.assertEquals(a1.makeSound(), "Roar");
                
                
		AnimalInterface a2 = speciesFactory1.getAnimal("snake");
		Assert.assertEquals(a2.makeSound(), "Hiss");

		SpeciesFactoryInterface speciesFactory2 = abstractFactory.getSpeciesFactory("mammal");
		AnimalInterface a3 = speciesFactory2.getAnimal("dog");
		Assert.assertEquals(a3.makeSound(), "Woof");
                
		AnimalInterface a4 = speciesFactory2.getAnimal("cat");
		Assert.assertEquals(a4.makeSound(), "Meow");

     }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
