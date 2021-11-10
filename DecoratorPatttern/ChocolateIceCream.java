package com.company.model;

import com.company.interfaces.IceCream;
import com.company.interfaces.IceCreamDecorator;

public class ChocolateIceCream extends IceCreamDecorator {


    public ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("\nAdding Mint Chocolate Ice-Cream!");
        return 20 + super.cost();

    }
}
