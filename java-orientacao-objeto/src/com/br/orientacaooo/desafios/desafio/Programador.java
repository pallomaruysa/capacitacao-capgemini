package com.br.orientacaooo.desafios.desafio;

public class Programador extends Pessoa{
    private String linguagem;

    public Programador() {
    }

    public Programador(String nome, int idade, String linguagem) {
        super(nome, idade);
        this.linguagem = linguagem;
    }


    @Override
    public String toString() {
        return "Programador{" +
                nome + '\'' +
                idade +'\''+
                linguagem + '\'' +
                '}';
    }
}
