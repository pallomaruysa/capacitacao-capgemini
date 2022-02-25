package com.br.orientacaooo.desafios.desafio;

import java.util.Scanner;

public class PrincipalPessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome1 = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int idade1 = sc.nextInt();
        Pessoa p2 = new Pessoa(nome1,idade1);

        System.out.println(p2);
        System.out.println("--------------------------------------------------------------");

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua linguagem: ");
        String linguagem = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        Programador pr = new Programador(nome, idade, linguagem);
        System.out.println(pr);

        sc.close();
    }
}
