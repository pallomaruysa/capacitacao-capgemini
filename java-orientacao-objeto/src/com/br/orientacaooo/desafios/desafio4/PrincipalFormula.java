package com.br.orientacaooo.desafios.desafio4;

import java.util.Locale;
import java.util.Scanner;

public class PrincipalFormula {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Circulo c = new Circulo();

        System.out.println("Digite o valor do raio");
        c.setRaio(sc.nextDouble());

        System.out.printf("Implementei: %.2f%n",c.area());

        sc.close();
    }
}
