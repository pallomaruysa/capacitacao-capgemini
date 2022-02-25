package model.entity;

import java.sql.Timestamp;

public class Tarefa {

    public int idTarefa;
    public int idColaborador;
    public String descrTarefa;
    public Timestamp dataHoraInicio;
    public Timestamp dataHoraFim;
    public String statusTarefa;
    public String prioridadeTarefa;

    public Tarefa(int idColaborador, String descrTarefa, Timestamp dataHoraInicio, Timestamp dataHoraFim, String statusTarefa, String prioridadeTarefa) {
        this.idColaborador = idColaborador;
        this.descrTarefa = descrTarefa;
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraFim = dataHoraFim;
        this.statusTarefa = statusTarefa;
        this.prioridadeTarefa = prioridadeTarefa;
    }

    public Tarefa() {

    }

    public int getIdTarefa() {
        return idTarefa;
    }

    public void setIdTarefa(int idTarefa) {
        this.idTarefa = idTarefa;
    }

    public int getIdColaborador() {
        return idColaborador;
    }

    public void setIdColaborador(int idColaborador) {
        this.idColaborador = idColaborador;
    }

    public String getDescrTarefa() {
        return descrTarefa;
    }

    public void setDescrTarefa(String descrTarefa) {
        this.descrTarefa = descrTarefa;
    }

    public Timestamp getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(Timestamp dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public Timestamp getDataHoraFim() {
        return dataHoraFim;
    }

    public void setDataHoraFim(Timestamp dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }

    public String getStatusTarefa() {
        return statusTarefa;
    }

    public void setStatusTarefa(String statusTarefa) {
        this.statusTarefa = statusTarefa;
    }

    public String getPrioridadeTarefa() {
        return prioridadeTarefa;
    }

    public void setPrioridadeTarefa(String prioridadeTarefa) {
        this.prioridadeTarefa = prioridadeTarefa;
    }

    @Override
    public String toString() {
        return "\nDetalhes da Tarefa\n" +
                "\nId da Tarefa: " + idTarefa +
                "\nId do Colaborador: " + idColaborador +
                "\nDescrição da Tarefa: " + descrTarefa + '\'' +
                "\nData e Hora de Início da Tarefa: " + this.dataHoraInicio +
                "\nData e Hora para o Fim da Tarefa: " + dataHoraFim +
                "\nStatus da Tarefa: " + statusTarefa + '\'' +
                "\nPrioridade da Tarefa: " + prioridadeTarefa +"\n";
    }
}