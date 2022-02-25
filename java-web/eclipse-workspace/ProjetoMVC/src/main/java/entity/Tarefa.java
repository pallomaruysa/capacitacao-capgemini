package entity;

import java.sql.Timestamp;

public class Tarefa {
	public int idTarefa;
    public int idColaborador;
    public String descrTarefa;
    public Timestamp dataHoraInicio;
    public Timestamp dataHoraFim;
    public String statusTarefa;
    public String prioridadeTarefa;

    public Tarefa() {

    }

    public Tarefa(int idTarefa, int idColaborador, String descrTarefa, Timestamp dataHoraInicio, Timestamp dataHoraFim, String statusTarefa, String prioridadeTarefa) {
        this.idTarefa = idTarefa;
        this.idColaborador = idColaborador;
        this.descrTarefa = descrTarefa;
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraFim = dataHoraFim;
        this.statusTarefa = statusTarefa;
        this.prioridadeTarefa = prioridadeTarefa;
    }

    public Tarefa(int idColaborador, String descrTarefa, Timestamp dataHoraInicio, Timestamp dataHoraFim, String statusTarefa, String prioridadeTarefa) {
        this.idColaborador = idColaborador;
        this.descrTarefa = descrTarefa;
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraFim = dataHoraFim;
        this.statusTarefa = statusTarefa;
        this.prioridadeTarefa = prioridadeTarefa;
    }

    public int getIdTarefa() {
        return idTarefa;
    }

    public int getIdColaborador() {
        return idColaborador;
    }

    public String getDescrTarefa() {
        return descrTarefa;
    }

    public Timestamp getDataHoraInicio() {
        return dataHoraInicio;
    }

    public Timestamp getDataHoraFim() {
        return dataHoraFim;
    }

    public String getStatusTarefa() {
        return statusTarefa;
    }

    public String getPrioridadeTarefa() {
        return prioridadeTarefa;
    }

    @Override
    public String toString() {
        return "Model.entity.Tarefa{" +
                "idTarefa=" + idTarefa +
                ", idColaborador=" + idColaborador +
                ", descrTarefa='" + descrTarefa + '\'' +
                ", dataHoraInicio=" + dataHoraInicio +
                ", dataHoraFim=" + dataHoraFim +
                ", statusTarefa='" + statusTarefa + '\'' +
                ", prioridadeTarefa='" + prioridadeTarefa + '\'' +
                '}';
    }

}
