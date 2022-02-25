package com.br.orientacaooo.desafios.desafio3;

public class MeuLivro extends Livro{

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
