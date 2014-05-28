/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joseph.designPatterns.test.creational;

import com.joseph.designpatterns.creational.prototype.CloneFactory;
import com.joseph.designpatterns.creational.prototype.Sheep;
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
public class PrototypeTest {
    
    public PrototypeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void test() 
     {
         CloneFactory animalMaker = new CloneFactory();
         
         Sheep sally = new Sheep();
         Sheep cloned = (Sheep) animalMaker.getClone(sally);
         
         Assert.assertNotEquals(System.identityHashCode(sally), System.identityHashCode(cloned));
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
