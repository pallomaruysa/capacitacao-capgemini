package com.br.orientacaooo.desafios.desafio3;

public abstract class Livro {
    protected String nome;
    protected String autor;
    protected String editora;
    protected String dataLancamento;
    protected String dataEdicao;

    public Livro() {
    }

    public abstract void setNome(String nome);

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                ", dataLancamento='" + dataLancamento + '\'' +
                ", dataEdicao='" + dataEdicao + '\'' +
                '}';
    }
}
