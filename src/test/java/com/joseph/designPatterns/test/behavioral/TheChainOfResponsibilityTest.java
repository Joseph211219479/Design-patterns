/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joseph.designPatterns.test.behavioral;

import com.joseph.designpatterns.behaviorable.theChainOfResponsibility.AddNumbers;
import com.joseph.designpatterns.behaviorable.theChainOfResponsibility.Chain;
import com.joseph.designpatterns.behaviorable.theChainOfResponsibility.MultNumbers;
import com.joseph.designpatterns.behaviorable.theChainOfResponsibility.Numbers;
import com.joseph.designpatterns.behaviorable.theChainOfResponsibility.Sub;
import junit.framework.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Common Sense
 */
public class TheChainOfResponsibilityTest {
    
    public TheChainOfResponsibilityTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
     @Test
     public void hello() 
     {
         Chain addnum = new AddNumbers();
         Chain sub = new Sub();
         Chain multi = new MultNumbers();
         Numbers num;
         Numbers num2;
         
         addnum.setNextChain(sub);
         sub.setNextChain(multi);
         
          num = new Numbers(4,3 ,"add");
         // num2 = new Numbers(2,2, "mult");
         
         Assert.assertEquals(addnum.calculate(num), 7);
         //Assert.assertEquals(addnum.calculate(num2), 4);
         
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
