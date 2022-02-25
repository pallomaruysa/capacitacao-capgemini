package com.br.orientacaooo.desafios.desafio2;

public class Consulta {
    private String codigoConsulta;
    private String data;
    private String hora;
    private int idPaciente;
    private int idDentista;
    private boolean antendido;

    public Consulta() {
        this.antendido = false;
    }

    public Consulta(String codigoConsulta, String data, String hora, int idPaciente, int idDentista) {
        this.codigoConsulta = codigoConsulta;
        this.data = data;
        this.hora = hora;
        this.idPaciente = idPaciente;
        this.idDentista = idDentista;
        this.antendido = false;
    }

    public String getCodigoConsulta() {
        return codigoConsulta;
    }
    public void setCodigoConsulta(String codigo) {
        this.codigoConsulta = codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdDentista() {
        return idDentista;
    }

    public void setIdDentista(int idDentista) {
        this.idDentista = idDentista;
    }

    public boolean isAntendido() {
        return antendido;
    }

    public void setAntendido(boolean antendido) {
        this.antendido = antendido;
    }
}
