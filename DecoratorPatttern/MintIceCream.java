package com.company.model;

import com.company.interfaces.IceCream;
import com.company.interfaces.IceCreamDecorator;

public class MintIceCream extends IceCreamDecorator {
    public MintIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("\nAdding Mint Ice-Cream!");
        return 15 + super.cost();
    }
}
