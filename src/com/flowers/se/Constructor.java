package com.flowers.se;

import java.util.concurrent.Flow;

public class Constructor {

    public void foo() {

        Flower flower = new Flower("Ромашка", "Белая");
        System.out.println(flower.color + " " + flower.name);
    }
}
