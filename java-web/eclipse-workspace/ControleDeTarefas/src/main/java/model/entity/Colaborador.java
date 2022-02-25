package model.entity;

public class Colaborador {


    public int idColaborador;
    public String nomeColaborador; 
    
    public Colaborador(String nomeColaborador) {
		super();
		this.nomeColaborador = nomeColaborador;
	}

	public Colaborador() {}

    public int getIdColaborador() {
        return idColaborador;
    }

    public void setIdColaborador(int idColaborador) {
        this.idColaborador = idColaborador;
    }

    public String getNomeColaborador() {
        return nomeColaborador;
    }

    public void setNomeColaborador(String nomeColaborador) {
        this.nomeColaborador = nomeColaborador;
    }

    @Override
    public String toString() {
        return "\nDados do Colaborador\n" +
                "Id do Colaborador: " + idColaborador +
                "\nNomeColaborador: " + nomeColaborador + "\n";
    }
}