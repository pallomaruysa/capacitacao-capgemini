package com.br.zoo.model.entity;

import com.br.zoo.model.dao.IAnimalDAO;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public  class Animal implements IAnimalDAO {
    private int id;
    private LocalDate dataCadastro;
    private LocalDate dataNascimento;
    private String nome;
    private String tipoAnimal;
    private String sexo;
    private int idade;

    public Animal() {

    }

    public Animal(String dataCadastro, String dataNascimento, String nome, String tipoAnimal, String sexo) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.sexo = sexo;

        transformDatas(dataCadastro, dataNascimento);
    }

    public void transformDatas(String dataCadastro, String dataNascimento){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dataCadastro = LocalDate.parse(dataCadastro, format);
        this.dataNascimento = LocalDate.parse(dataNascimento, format);

        Period period = Period.between(this.dataNascimento, this.dataCadastro);
        this.idade = (period.getYears() * 12) + period.getMonths();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id = " + id +
                ", dataCadastro = " + dataCadastro.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                ", dataNascimento = " + dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                ", nome = '" + nome + '\'' +
                ", tipoAnimal = '" + tipoAnimal + '\'' +
                ", sexo = '" + sexo + '\'' +
                ", idade = " + idade +
                '}';
    }
}
