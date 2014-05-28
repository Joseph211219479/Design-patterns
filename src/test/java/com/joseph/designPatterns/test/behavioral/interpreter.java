/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joseph.designPatterns.test.behavioral;

import com.joseph.designpatterns.behaviorable.interpreter.Expression;
import com.joseph.designpatterns.behaviorable.interpreter.OrExpression;
import com.joseph.designpatterns.behaviorable.interpreter.TerminalExpression;
import org.testng.Assert;
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
public class interpreter {
    
    public interpreter() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     //@Test
    public static Expression createMale()
    {
         
         Expression dude1 = new TerminalExpression("aico");
         Expression dude2 = new TerminalExpression("Jos");
         return new OrExpression(dude1, dude2);                
     }
     
     @Test
     public void test()
     {
         Expression isMan = createMale();
         Assert.assertEquals(isMan.interpret("jesica"), false);
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
