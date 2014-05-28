/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joseph.designPatterns.test.creational;

import com.joseph.designpatterns.creational.builderPattern.ItalianMealBuilder;
import com.joseph.designpatterns.creational.builderPattern.JapaneseMealBuilder;
import com.joseph.designpatterns.creational.builderPattern.Meal;
import com.joseph.designpatterns.creational.builderPattern.MealBuilder;
import com.joseph.designpatterns.creational.builderPattern.MealDirector;
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
public class BuilderTest {
    
    public BuilderTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void test() 
     {
         MealBuilder mealBuilder = new ItalianMealBuilder();
		MealDirector mealDirector = new MealDirector(mealBuilder);
		mealDirector.constructMeal();
		Meal meal = mealDirector.getMeal();
                Assert.assertEquals(meal.toString(), "drink:red wine, main course:pizza, side:bread");
		
		
		mealBuilder = new JapaneseMealBuilder();
		mealDirector = new MealDirector(mealBuilder);
		mealDirector.constructMeal();
		meal = mealDirector.getMeal();
		Assert.assertEquals(meal.toString(), "drink:sake, main course:chicken teriyaki, side:miso soup");
                
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
