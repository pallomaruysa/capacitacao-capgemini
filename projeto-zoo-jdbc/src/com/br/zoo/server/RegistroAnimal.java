package com.br.zoo.server;

import com.br.zoo.model.entity.Animal;

import java.util.Scanner;

public class RegistroAnimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Animal a = new Animal("11/10/2021", "19/01/2003", "lua nova", "pantera negra", "femea");

        System.out.println(a);

        sc.close();
    }
}
