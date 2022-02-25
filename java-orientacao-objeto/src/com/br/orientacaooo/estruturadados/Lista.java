package com.br.orientacaooo.estruturadados;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
    //Principais metodos de ArrayList
    public static void main(String[] args) {

        List<String> listaNomes = new ArrayList<>();

        listaNomes.add("Valquiria");
        listaNomes.add("Samyra de aniversario");
        listaNomes.add("Ana Rita");
        listaNomes.add("Ana Melo");
        listaNomes.add("Ana Caroline");

        System.out.println("Tamanho atual da lista: " + listaNomes.size());
        //percorrer a lista e apresentar todos os elementos
        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        // adicionar elemento por posicao
        listaNomes.add(2, "Alline");

        // remover por elemento ou indice
        listaNomes.remove("Valquiria");
        listaNomes.remove(2);

        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        //pegar o index do elemento
        System.out.println("-------------");
        System.out.println("Indice da Alline " + listaNomes.indexOf("Alline"));
        System.out.println("Indice da Ana Melo " + listaNomes.indexOf("Ana Melo"));
        System.out.println(" ---------------");

        /*
        // remover por lambda: excluir se achar na primeira letra do nome o 'A'
        listaNomes.removeIf(x -> x.charAt(0) == 'A'); // charAt(0)=> o (0) define a posição da letra
        */


        // filtro em cima da lista
        List<String> resultado = listaNomes.stream().filter(x -> x.charAt(0) == 'A')
                .collect(Collectors.toList());
        System.out.println("Resultado do filtro: ");

        for (String nome : resultado) {
            System.out.println(nome);

        }
    }
}