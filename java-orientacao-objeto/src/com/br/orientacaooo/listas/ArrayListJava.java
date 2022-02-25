package com.br.orientacaooo.listas;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListJava {
    public static void main(String[] args) {
        int continua = 0;
        ArrayList<String> alunos = new ArrayList<>();

        for (int i = 0; continua == 0; i++) {
            alunos.add(JOptionPane.showInputDialog("Informe o nome do aluno"));
            continua = JOptionPane.showConfirmDialog(null, "Mais alunos?");
            System.out.println(alunos);
        }

        // Alterar um nome para outro no ArrayList
       // alunos.set(2, "PEDRO");
        System.out.println(alunos);

        System.out.println("Entrando no for");
        // Alterar sem saber onde está o registro
        for (int i = 0; i < alunos.size(); i++){
            if ("JOSE".equals(alunos.get(i))) {
                alunos.set(i, "PEDRO");
                break;
            }
            System.out.println(alunos);
        }
        System.out.println("Saindo do for");
        System.out.println(alunos);

        if (alunos.contains("JOSE")){
            System.out.println("Achei o Jose");
        } else {
            System.out.println("Não achei o Jose");
        }

        System.out.println(alunos);
        System.out.println("Classificando o array");
        Collections.sort(alunos);
        System.out.println(alunos);
        System.out.println("Limpando o array");
        alunos.clear();
        System.out.println("Verificando se array esta vazio");
        if (alunos.isEmpty()){
            System.out.println("Array vazio");
        }
        System.out.println(alunos);
        alunos.add("MARCIO");
    }
}