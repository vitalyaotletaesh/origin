package com.flowers.se;

import java.util.Scanner;
import java.util.concurrent.Flow;

public class Constructor {

    public void foo() {

        String getName;
        String getColor;

        Flower flower = new Flower();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вид цветка: ");
        getName = scanner.nextLine();
        System.out.println("Введите цвет цветка: ");
        getColor = scanner.nextLine();

        flower.name = getName;
        flower.color = getColor;

        System.out.println(flower.color + " " + flower.name);
    }
}
