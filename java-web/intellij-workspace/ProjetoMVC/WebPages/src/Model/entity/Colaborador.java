package Model.entity;

public class Colaborador {
    private int idColaborador;
    private String nomeColaborador;
    private String cpf;

    public Colaborador() {

    }

    public Colaborador(String nomeColaborador, String cpf) {
        this.nomeColaborador = nomeColaborador;
        this.cpf = cpf;
    }

    public Colaborador(int idColaborador, String nomeColaborador, String cpf) {
        this.idColaborador = idColaborador;
        this.nomeColaborador = nomeColaborador;
        this.cpf = cpf;
    }

    public int getIdColaborador() {
        return idColaborador;
    }

    public String getNomeColaborador() {
        return nomeColaborador;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Colaborador{" +
                "idColaborador=" + idColaborador +
                ", nomeColaborador='" + nomeColaborador + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
