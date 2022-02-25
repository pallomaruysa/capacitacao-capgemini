package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import entity.Colaborador;
import infra.ConexaoSQL;

public class ColaboradorDAO {
	
	private ConexaoSQL conexao;
    private String query;

    public ColaboradorDAO() throws SQLException, ClassNotFoundException {
        conexao = new ConexaoSQL();
    }

    public void incluirColaborador(Colaborador colaborador) throws SQLException {
        query ="insert into colaborador(nomeColaborador, cpfColaborador) values(?,?);";

        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
            stmt.setString(1,colaborador.getNomeColaborador());
            stmt.setString(2,colaborador.getCpf());

            stmt.execute();
            this.conexao.commit();
        } catch (SQLException e) {
            this.conexao.rollback();
            throw e;
        }
    }

    public void alterarColaborador() {

    }

    public void excluirColaborador() {

    }

    public void consultarColaboradores() {

    }

    public void consultarColaborador() {

    }

}
