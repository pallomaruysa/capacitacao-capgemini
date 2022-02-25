package com.br.orientacaooo.server;

import com.br.orientacaooo.model.entity.*;

import java.util.Scanner;

public class PrincipalAniamal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeAnimal = "Lua crescente";
        String tipoAnimal = "felino";
        String raca = "ns";
        String cor = "branca com manchas prestas";

        System.out.printf("O seu animal chamado %s, é do tipo %s da raça %s com a pelagem %s\n",
                nomeAnimal, tipoAnimal, raca, cor);
        System.out.println("--------------------------------------------------------------");

        //Instancia da class Girafa, sendo portanto, um objeto mais específico
        Girafa gi = new Girafa("Gigi", "Doberman", "bolinhas amarelas", 23,"femea");
        System.out.println(gi);
        System.out.println("É Adulto: "+gi.isAdulto());
        System.out.println("--------------------------------------------------------------");
        Animal gi2 = new Girafa("Gonga", "reig", "bolinhas marrons", 59,"femea");
        System.out.println(gi2);
        System.out.println("É Adulto: "+gi2.isAdulto());
        System.out.println("--------------------------------------------------------------");

        //Declarando um nova instancia da class Cachorro usando a class específica
        Cachorro c = new Cachorro("Júpter", "Pastor Alemão", "marrom",19, "macho",'p');
        System.out.println(c);
        System.out.println(c.emitirSom());
        System.out.println("É Adulto: "+c.isAdulto());
        System.out.println("--------------------------------------------------------------");

        Gato g2 = new Gato("Lua Minguante", "NS", "preta com manchas brnacas", 7,"femea");
        System.out.println(g2);
        System.out.println(g2.emitirSom());
        System.out.println("É Adulto: "+g2.isAdulto());
        System.out.println("--------------------------------------------------------------");

        GatoDesafio gd = new GatoDesafio("Lua Cheia","NS", "branca",19,"femea");
        System.out.println(gd);
        System.out.println(gd.getTipoAnimal());

        Gato g = new Gato("Gigi", "pinscher", "malhadinha",20, "femea");
        System.out.println(g);
        g.morrer();
        System.out.println(g.emitirSom());
        sc.close();
    }
}