package com.br.orientacaooo.model.dao;

import com.br.orientacaooo.infra.ConexaoMysql;
import com.br.orientacaooo.model.entity.Fornecedor;
import com.br.orientacaooo.model.entity.Produto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// DAO = Data Access Object -> Objeto de acesso a dados
public class FornecedorDAO implements GenericoDAO<Fornecedor>{

    private ConexaoMysql conexao;
    private String query = "";

    List<Fornecedor> listaFornecedor = new ArrayList<>();

    public FornecedorDAO() throws SQLException, ClassNotFoundException {
        conexao = new ConexaoMysql();
    }


    @Override
    public void save(Fornecedor fornecedor) throws SQLException {
        // statemente = > instrucao
         query = "insert into fornecedor(NOME_FORNECEDOR, CNPJ) values(?, ?);";

        try{
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

            stmt.setString(1, fornecedor.getNomeFornecedor());
            stmt.setString(2, fornecedor.getCNPJ());

            stmt.execute();
            this.conexao.commit();

        }catch (SQLException e){
            this.conexao.rollback();
            throw e;
        }
    }

    @Override
    public List<Fornecedor> fidAll() throws SQLException {
        query = "select * from fornecedor";
        try{
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
            ResultSet resultSet = stmt.executeQuery();

            while(resultSet.next()){
                Fornecedor f = new Fornecedor(  resultSet.getInt("codigo_fornecedor"),
                                                resultSet.getString("nome_fornecedor"),
                                                resultSet.getString("cnpj"));
                listaFornecedor.add(f);
            }
            return listaFornecedor;
        } catch (SQLException e) {
            throw e;
        }
    }

    public Fornecedor findById(int id) throws SQLException {
        query = "select * from fornecedor where codigo_fornecedor = ?;";

        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();
            if (resultSet.next()) {
                Fornecedor pesquisado = new Fornecedor(resultSet.getInt("codigo_fornecedor"),
                                                       resultSet.getString("nome_fornecedor"),
                                                       resultSet.getString("cnpj"));

                return pesquisado;
            } else {
                System.out.println("  -> O código digitado não existe no banco");
            }
        } catch (SQLException e) {
            throw e;
        }
        return null;
    }

    @Override
    public void delete(int id) throws SQLException {
        query = "delete from fornecedor where codigo_fornecedor = ?;";

        try{
           PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
           stmt.setInt(1, id);
           stmt.executeUpdate();
           this.conexao.commit();
        }catch (SQLException e){
            this.conexao.rollback();
            throw e;
        }
    }

    public void merge(Fornecedor fornecedor, int codigo) throws SQLException{
        query ="update fornecedor set nome_fornecedor =?, cnpj =? where codigo_fornecedor=?";
        try{
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
            stmt.setString(1,fornecedor.getNomeFornecedor());
            stmt.setString(2,fornecedor.getCNPJ());
            stmt.setInt(3, codigo);

            stmt.executeUpdate();
            this.conexao.commit();
        } catch (SQLException e) {
            this.conexao.rollback();
            throw e;
        }

    }

}
