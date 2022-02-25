package model.dao;

import model.entity.Tarefa;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import infra.ConexaoMysql;

public class TarefaDAO {
    private  ConexaoMysql conexao;
    private String query = " ";

    public TarefaDAO() throws SQLException,ClassNotFoundException{
        conexao = new ConexaoMysql();
    }
    public boolean incluirTarefa(Tarefa tarefa) throws SQLException {
        String query = "insert into Tarefa (idColaborador,descrTarefa,dataHoraInicio,dataHoraFim,statusTarefa,prioridadeTarefa) values (?,?,?,?,?,?)";
        try{
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

            stmt.setInt(1,tarefa.getIdColaborador());
            stmt.setString(2, tarefa.getDescrTarefa());
            stmt.setTimestamp(3,tarefa.getDataHoraInicio());
            stmt.setTimestamp(4,tarefa.getDataHoraFim());
            stmt.setString(5, tarefa.getStatusTarefa());
            stmt.setString(6, tarefa.getPrioridadeTarefa());

            stmt.execute();
            this.conexao.commit();
            return true;
        }catch (SQLException e){
            this.conexao.rollback();
            return false;
        }
    }

    public boolean alterarTarefa(int id,Tarefa tarefa) throws SQLException {
        query="update Tarefa set descrTarefa=?,statusTarefa=?,prioridadeTarefa =? where idTarefa=?";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

            stmt.setString(1, tarefa.getDescrTarefa());
            stmt.setString(2, tarefa.getStatusTarefa());
            stmt.setString(3, tarefa.getPrioridadeTarefa());
            stmt.setInt(4,id);

            stmt.executeUpdate();
            this.conexao.commit();
            return true;
        } catch (SQLException e) {
            this.conexao.rollback();
            return false;
        }
    }

    public boolean excluirTarefa(int id) throws SQLException {
        query="delete from Tarefa where idTarefa=?";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            this.conexao.commit();
            return true;
        } catch (SQLException e) {
            this.conexao.rollback();
            return false;
        }
    }

    public ArrayList<Tarefa> consultarTarefas() throws SQLException {
        query="select idTarefa,idColaborador,descrTarefa,dataHoraInicio,dataHoraFim,statusTarefa,prioridadeTarefa from Tarefa";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
            ResultSet resultSet = stmt.executeQuery();

            ArrayList<Tarefa> listaPesquisada = new ArrayList<>();

            while (resultSet.next()) {
                Tarefa t = new Tarefa(resultSet.getInt("idColaborador"),
                        resultSet.getString("descrTarefa"),
                        resultSet.getTimestamp("dataHoraInicio"),
                        resultSet.getTimestamp("dataHoraFim"),
                        resultSet.getString("statusTarefa"),
                        resultSet.getString("prioridadeTarefa"));
                t.setIdTarefa(resultSet.getInt("idTarefa"));
                listaPesquisada.add(t);
            }
            return listaPesquisada;
        } catch (SQLException e) {
            throw e;
        }

    }

    public Tarefa consultarTarefa(int id) throws SQLException {
        query = "select * from Tarefa where idTarefa = ? ";
        try{
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

            stmt.setInt(1,id);
            stmt.execute();
            ResultSet resultSet = stmt.executeQuery();
            if (resultSet.next()) {
                Tarefa t = new Tarefa(resultSet.getInt("idColaborador"),
                        resultSet.getString("descrTarefa"),
                        resultSet.getTimestamp("dataHoraInicio"),
                        resultSet.getTimestamp("dataHoraFim"),
                        resultSet.getString("statusTarefa"),
                        resultSet.getString("prioridadeTarefa"));
                t.setIdTarefa(resultSet.getInt("idTarefa"));
                return t;
            }
        } catch (SQLException e){
            throw e;
        }
        return null;
    }
}
