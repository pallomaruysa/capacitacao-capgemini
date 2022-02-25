package com.br.orientacaooo.model.entity;

public class Girafa extends Animal {
    public Girafa() {

    }
    public Girafa(String nome, String raca, String cor, int idade, String sexo) {
        super(nome, "girafa", raca, cor,idade, sexo);
    }

    @Override
    public String emitirSom() {
        if (isVivo()){
            return null;
        }
        return "Animal morto não emite som";
    }

    @Override
    public String isAdulto(){
        if(sexo.equalsIgnoreCase("Femea")) {
            if (this.idadeMeses >=36) {
                return "true";
            }
            else return "false";
        }
        else if (sexo.equalsIgnoreCase("Macho")){
            if (idadeMeses>=48){
                return "true";
            }
            else return "false";
        }
        return "false";
    }
}
