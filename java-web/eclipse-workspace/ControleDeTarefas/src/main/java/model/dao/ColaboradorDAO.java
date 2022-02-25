package model.dao;

import model.entity.Colaborador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import infra.ConexaoMysql;

public class ColaboradorDAO {
    private  ConexaoMysql conexao;
    private String query = " ";

    public ColaboradorDAO() throws SQLException,ClassNotFoundException{
        conexao = new ConexaoMysql();
    }
    public boolean incluirColaborador(Colaborador colaborador) throws SQLException {
        String query = "insert into Colaborador (nomeColaborador) values (?)";
        try{
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

            stmt.setString(1,colaborador.getNomeColaborador());

            stmt.execute();
            this.conexao.commit();
            return true;
        }catch (SQLException e){
            this.conexao.rollback();
            return false;
        }

    }
    public void alterarColaborador(int id,String nome) throws SQLException {
        query="update Colaborador set nomeColaborador=? where idcolaborador =?";
        try{
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

            stmt.setString(1,nome);
            stmt.setInt(2,id);
            stmt.executeUpdate();
            this.conexao.commit();
        } catch (SQLException e){
            throw e;
        }
    }

    public boolean excluirColaborador(int id) throws SQLException {
        query="delete from Colaborador where idcolaborador = ?";
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

    public ArrayList<Colaborador>  consultarColaboradores() throws SQLException {
        query="select idcolaborador,nomeColaborador from Colaborador";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
            ResultSet resultSet = stmt.executeQuery();

            ArrayList<Colaborador> listaPesquisada = new ArrayList<>();

            while (resultSet.next()) {
                Colaborador c = new Colaborador(resultSet.getString("nomeColaborador"));
                c.setIdColaborador(resultSet.getInt("idColaborador"));
                listaPesquisada.add(c);
            }
            return listaPesquisada;
        } catch (SQLException e) {
            throw e;
        }

    }

    public Colaborador consultarColaborador(int id) throws SQLException {
        query="select *from Colaborador where idcolaborador =?";
        try{
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

            stmt.setInt(1,id);
            stmt.execute();
            ResultSet resultSet = stmt.executeQuery();
            if (resultSet.next()) {
                Colaborador c = new Colaborador(resultSet.getString("nomeColaborador"));
                c.setIdColaborador(resultSet.getInt("idcolaborador"));
                return c;
            }
        } catch (SQLException e){
            throw e;
        }
        return null;
    }

}
