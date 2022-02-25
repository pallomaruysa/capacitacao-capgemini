package com.br.orientacaooo.model.entity;

public class GatoDesafio extends Animal{
    public GatoDesafio(String nome,  String raca, String cor, int idade, String sexo) {
        super(nome, "gato", raca, cor, idade, sexo);
    }

    @Override
    public String getTipoAnimal() {
        return this.nomeAnimal+" é um gato";
    }

    @Override
    public String emitirSom() {
        return "Miau Miau";
    }

    @Override
    public String isAdulto() {
        return "true";
    }
}
