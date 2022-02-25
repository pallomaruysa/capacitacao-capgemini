package com.br.orientacaooo.model.entity;

public abstract class Animal implements IAnimal{
    protected String nomeAnimal;
    private String tipoAnimal;
    private String raca;
    private String cor;
    protected int idadeMeses;
    protected String sexo;
    private boolean vivo; // valor default = false;

    //Construtor Padrão
    public Animal() {
        System.out.println("objeto construido");
        this.vivo = true;
    }

    public Animal(String nomeAnimal, String tipoAnimal, String raca, String cor, int idadeMeses, String sexo) {
        this.nomeAnimal = nomeAnimal;
        this.tipoAnimal = tipoAnimal;
        this.raca = raca;
        this.cor = cor;
        this.idadeMeses = idadeMeses;
        this.sexo = sexo;
        this.vivo = true;
    }

    //Getters
    public String getNomeAnimal() {
        return this.nomeAnimal;
    }

    public String getTipoAnimal() {
        return this.tipoAnimal;
    }

    public String getRaca() {
        return this.raca;
    }

    public String getCor() {
        return this.cor;
    }

    public int getIdadeMeses() {
        return idadeMeses;
    }

    //Setters
    public void setNomeAnimal(String nome) {
        this.nomeAnimal = nome;
    }

    public void setTipoAnimal(String tipo) {
        this.tipoAnimal = tipo;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setIdadeMeses(int idadeMeses) {
        this.idadeMeses = idadeMeses;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public void morrer() {
        this.vivo = false;
    }
    public boolean isVivo(){
        return vivo;
    }

    //Sobrecarga do método ToString oriundo da class Object
    @Override

    public String toString() {
        return "Animal{" +
                "O meu animal chamado '" + nomeAnimal + '\'' +
                ", é do tipo '" + tipoAnimal + '\'' +
                ", é da raça '" + raca + '\'' +
                ", com  a pelagem '" + cor + '\'' + '}' +
                " e com " + idadeMeses + " meses de idade, "+sexo;
    }

}
