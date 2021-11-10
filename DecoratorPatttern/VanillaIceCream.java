package com.company.model;

import com.company.interfaces.IceCream;
import com.company.interfaces.IceCreamDecorator;

public class VanillaIceCream extends IceCreamDecorator{
    public VanillaIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("\nAdding Vanilla Ice-Cream!");
        return 10 + super.cost();
    }
}
