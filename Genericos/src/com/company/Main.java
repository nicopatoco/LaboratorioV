package com.company;

import com.company.generics.GenericBag;
import com.company.generics.Pile;

public class Main {

    public static void main(String[] args) {
        System.out.println("Exercise 1 \nInteger\n");
        GenericBag<Integer> bag = new GenericBag<>();
        bag.add(5);
        bag.add(7);
        bag.add(9);
        bag.add(6);
        System.out.println(bag.getMyList());

        int num = 5;
        int num2 = 17;

        System.out.println("Compare: " + bag.compareTo(num));
        System.out.println("Compare: " + bag.compareTo(num2));

        System.out.println("Delete number: " + bag.delete(num));
        System.out.println(bag.getMyList());

        System.out.println("Min: " + bag.getMin());
        System.out.println("Max: " + bag.getMax());

        System.out.println("\nString\n");
        GenericBag<String> bag1 = new GenericBag<>();
        bag1.add("Nico");
        bag1.add("Juan");
        bag1.add("Pedro");
        bag1.add("Pepe");
        System.out.println(bag1.getMyList());

        String name = "Nico";
        String lastName = "Herrera";

        System.out.println("Compare: " + bag1.compareTo(name));
        System.out.println("Compare: " + bag1.compareTo(lastName));

        System.out.println("Delete String: " + bag1.delete(name));
        System.out.println(bag1.getMyList());

        System.out.println("Min: " + bag1.getMin());
        System.out.println("Max: " + bag1.getMax());


        System.out.println("\nEjercicio de pila.");
        System.out.println("Integer pile\n");
        Pile<Integer> intPile = new Pile<>();

        intPile.push(2);
        intPile.push(3);
        intPile.push(4);
        intPile.push(5);

        intPile.print();

        System.out.println("Pop up: " + intPile.pop());

        intPile.print();

        System.out.println("\nString pile\n");
        Pile<String> strPile = new Pile<>();

        strPile.push("Nico");
        strPile.push("Juan");
        strPile.push("Pedro");
        strPile.push("Pablo");

        strPile.print();

        System.out.println("Pop up: " + strPile.pop());

        strPile.print();

        while (!strPile.empty()) {
            System.out.println("Pop up: " + strPile.pop());
        }
    }
}
