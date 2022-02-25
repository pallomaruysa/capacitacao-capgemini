package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import entity.Tarefa;
import infra.ConexaoSQL;

public class TarefaDAO {
	
	private ConexaoSQL conexao;
    private String query;

    public TarefaDAO() throws SQLException, ClassNotFoundException {
        conexao = new ConexaoSQL();
    }

    public void incluirTarefa(Tarefa tarefa) throws SQLException {
        query = "insert into tarefa(idColaborador, descrTarefa, dataHoraInicio, dataHoraFim, statusTarefa, prioridadeTarefa)" +
                "values(?,?,?,?,?,?);";
        try{
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

            stmt.setInt(1, tarefa.getIdColaborador());
            stmt.setString(2, tarefa.getDescrTarefa());
            stmt.setTimestamp(3, tarefa.getDataHoraInicio());
            stmt.setTimestamp(4, tarefa.getDataHoraFim());
            stmt.setString(5, tarefa.getStatusTarefa());
            stmt.setString(6, tarefa.getPrioridadeTarefa());

            stmt.execute();
            this.conexao.commit();
        } catch (SQLException e) {
            this.conexao.rollback();
            throw e;
            
        }
    }

    public void alterarTarefa() {

    }

    public void excluirTarefa() {

    }

    public void consultarTarefas() {

    }

    public void consultarTarefa() {

    }

}
