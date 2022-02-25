package com.br.orientacaooo.listas;

import java.util.HashMap;
import java.util.Map;

public class HashMapJava {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Roberto");
        usuarios.put(20, "Ricardo");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");
        // tamanho do MAP
        System.out.println("=> Mostra tamanho do MAP");
        System.out.println(usuarios.size());
        // verifica se MAP está vazio
        System.out.println("=> Verifica se MAP está vazio");
        System.out.println(usuarios.isEmpty());

        System.out.println("=> Lista KEY SET do MAP");
        System.out.println(usuarios.keySet());

        System.out.println("=> Lista os valores");
        System.out.println(usuarios.values());

        System.out.println("=> Lista o ENTRYSET");
        System.out.println(usuarios.entrySet());

        System.out.println("=> Verifica se existe a chave nr 20");
        System.out.println(usuarios.containsKey(20));

        System.out.println("=> Verifica se existe p elemento Rebeca");
        System.out.println(usuarios.containsValue("Rebeca"));

        System.out.println("=> Resgata o elemento nr 4");
        System.out.println(usuarios.get(4));

        System.out.println("=> Remova o primeiro elemento");
        System.out.println(usuarios.remove(1));

        System.out.println("=> Tenta remover o elemento 4 Gui");
        System.out.println(usuarios.remove(4, "Gui"));

        System.out.println("=> Cria uma variavel chave e atribui a ela o KeySet. Em seguida lista as chaves");
        for(int chave: usuarios.keySet()) {
            System.out.println(chave);
        }
        System.out.println("=> Cria uma variavel valor e atribui a ela o valor no MAP. Em seguida lista os valores");
        for(String valor: usuarios.values()) {
            System.out.println(valor);
        }
        System.out.println("=> Cria um registro composto do entryset. Em seguida lista as chaves e valores simultanemanente");
        for(Map.Entry<Integer, String> registro: usuarios.entrySet()) {
            System.out.print(registro.getKey() + " ==> ");
            System.out.println(registro.getValue());
        }
    }
}