package com.br.orientacaooo.model.entity;

public class Cachorro extends Animal {

    private char porte;

    public Cachorro(String nome, String raca, String cor, int idade, String sexo,char porte) {
        super(nome, "Cachorro", raca, cor, idade, sexo);
        this.porte = porte;
    }

    @Override
    public String emitirSom(){
        if (isVivo()){
            return "au au";
        }
        return "Animal morto não emite som";
    }

    @Override
    public String isAdulto() {
        if (isVivo()){
            if (idadeMeses>24){
                return "Adutlto";
            }
            return "filhote";
        }
        return "Animal morto não verifica idade";
    }
}
