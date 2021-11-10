package com.company.model;

import com.company.interfaces.IceCream;

public class BasicIceCream implements IceCream {

    public BasicIceCream() {
        System.out.println("\nCreating a basic Ice-Cream!");
    }

    @Override
    public double cost() {
        return 30;
    }
}