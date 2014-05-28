/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joseph.designPatterns.test.creational;

import com.joseph.designpatterns.creational.factory.AnimalFactory;
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
public class FactoryTest {
    
    public FactoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void test() 
     {
          AnimalFactory animalFactory = new AnimalFactory();

		AnimalInterface a1 = animalFactory.getAnimal("feline");
		System.out.println("a1 sound: " + a1.makeSound());

		AnimalInterface a2 = animalFactory.getAnimal("canine");
		System.out.println("a2 sound: " + a2.makeSound());
                
                Assert.assertNotSame(a1.makeSound(), a2.makeSound(), "Not the same animal");
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
