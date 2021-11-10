package com.company;

import com.company.interfaces.IceCream;
import com.company.model.BasicIceCream;
import com.company.model.MintIceCream;
import com.company.model.VanillaIceCream;

public class Main {

    public static void main(String[] args) {

        IceCream basicIceCream = new BasicIceCream();
        System.out.println("Basic Ice-cream cost rupees " + basicIceCream.cost());

        //Adding Vanilla to the order
        IceCream vanilla = new VanillaIceCream(basicIceCream); // wrapping vanilla
        System.out.println("Adding Vanilla - cost is: " + vanilla.cost());


        //Adding Mint to the order
        IceCream mint = new MintIceCream(vanilla);
        IceCream mint2 = new MintIceCream(basicIceCream);
        System.out.println("Adding Mint and Vanilla - cost is: " + mint.cost());


    }
}
