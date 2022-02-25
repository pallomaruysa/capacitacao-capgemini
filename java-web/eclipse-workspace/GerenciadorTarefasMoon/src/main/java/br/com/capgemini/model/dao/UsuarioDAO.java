package br.com.capgemini.model.dao;

import br.com.capgemini.jdbc.ConnectionFactory;
import br.com.capgemini.model.entity.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
	ConnectionFactory conexao;
	String query;

	public UsuarioDAO() {
		conexao = new ConnectionFactory();
	}

	public void incluir(Usuario usuario) {
		 query = "insert into usuario(nome,telefone,email,dataNascimento,cpf,senha,ativo) values(?,?,?,?,?,?,?)";
		try {
			Connection conn = this.conexao.getConection();
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getTelefone());
			stmt.setString(3, usuario.getEmail());
			stmt.setDate(4, usuario.getDataNascimento());
			stmt.setString(5, usuario.getCpf());
			stmt.setString(6, usuario.getSenha());
			stmt.setBoolean(7, usuario.isAtivo());
			stmt.execute();
			this.conexao.commit();

		} catch (SQLException e) {
			this.conexao.roolback();

		}
	}
	
	public Usuario consultar(int id) throws SQLException {
		query = "select nome, telefone, email, dataNascimento, cpf, senha, ativo from usuario where idUsuario=?";

		try {
			Connection conn = this.conexao.getConection();
			PreparedStatement stmt = conn.prepareStatement(query);

			stmt.setInt(1, id);
			stmt.execute();
			
			ResultSet resultSet = stmt.executeQuery();
			
            if (resultSet.next()) {
                Usuario u = new Usuario(resultSet.getString("nome"),resultSet.getString("telefone"),
                		resultSet.getString("email"),resultSet.getDate("dataNascimento"),
                		resultSet.getString("cpf"), resultSet.getString("senha"),
                		resultSet.getBoolean("ativo"));
                u.setIdUsuario(resultSet.getInt("idUsuario"));
                return u;
            }
		} catch(SQLException e){
			throw e;
		}
		return null;
	}
	
	public void alterar (int id, Usuario usuario) throws SQLException{
		query="update usuario set nome=?, telefone=?, email=?, dataNascimento=?, cpf=?, senha=?, ativo=? where idUsuario=?";
		try {
			Connection conn = this.conexao.getConection();
			PreparedStatement stmt = conn.prepareStatement(query);
			
			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getTelefone());
			stmt.setString(3, usuario.getEmail());
			stmt.setDate(4, usuario.getDataNascimento());
			stmt.setString(5, usuario.getCpf());
			stmt.setString(6, usuario.getSenha());
			stmt.setBoolean(7, usuario.isAtivo());
			stmt.setInt(8, id);
		}catch (SQLException e){
			this.conexao.roolback();
		}
	
	}
}