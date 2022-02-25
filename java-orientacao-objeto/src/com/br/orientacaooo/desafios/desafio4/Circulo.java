package com.br.orientacaooo.desafios.desafio4;

public class Circulo implements Forma{
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(raio,2);
    }
}
