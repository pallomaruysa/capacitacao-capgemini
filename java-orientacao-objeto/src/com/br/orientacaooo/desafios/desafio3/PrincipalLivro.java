package com.br.orientacaooo.desafios.desafio3;

import java.util.Scanner;

public class PrincipalLivro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MeuLivro ml = new MeuLivro();

        System.out.println("Digite o nome do livro");
        ml.setNome(sc.nextLine());
        System.out.println(ml);

        sc.close();
    }
}
