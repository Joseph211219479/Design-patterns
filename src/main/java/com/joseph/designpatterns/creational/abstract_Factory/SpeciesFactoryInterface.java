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
public interface SpeciesFactoryInterface {
    public abstract AnimalInterface getAnimal(String type);
}
