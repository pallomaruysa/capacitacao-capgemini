package com.br.orientacaooo.listas;

import java.util.HashSet;

public class HashSetJava {
    public static void main(String[] args) {

        HashSet<String> cars = new HashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println("Lista o HasSet");
        System.out.println(cars);

        System.out.println("Verifica se existe Mazda");
        if (cars.contains("Mazda")) {
            System.out.println("Achei Mazda");
        }

        System.out.println("Remove Volvo");
        cars.remove("Volvo");
        System.out.println(cars);

        System.out.println("Tamanho do HashSet");
        System.out.println(cars.size());

        for (String i : cars) {
            System.out.println(i);
        }
    }
}