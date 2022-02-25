package com.br.orientacaooo.model.entity;

public class Gato extends Animal {
    public Gato() {
    }

    public Gato(String nome, String raca, String cor, int idade, String sexo) {
        super(nome, "Gato", raca, cor, idade, sexo);
    }

    @Override
    public String emitirSom() {
        if (isVivo()){
            return "miau miau";
        }
        return "Animal morto não emite som";
    }

    @Override
    public String isAdulto() {
        return "null"; //this.idadeMeses>24
    }

    @Override
    public void morrer() {
        System.out.println("morreu porque comeu pelo de mais");
        super.morrer();
    }
}
