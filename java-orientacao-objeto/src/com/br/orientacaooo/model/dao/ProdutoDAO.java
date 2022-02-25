package com.br.orientacaooo.model.dao;

import com.br.orientacaooo.infra.ConexaoMysql;
import com.br.orientacaooo.model.entity.Produto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// DAO = Data Access Object -> Objeto de acesso a dados
public class ProdutoDAO implements GenericoDAO<Produto> {

    private ConexaoMysql conexao;
    private String query;

    List<Produto> listaProdutos = new ArrayList<>();

    public ProdutoDAO() throws SQLException, ClassNotFoundException {
        conexao = new ConexaoMysql();
    }


    @Override
    public void save(Produto produto) throws SQLException {
        // statemente = > instrucao
        query = "insert into produto(descricao_produto, preco_produto, codigo_fornecedor) values(?, ?, ?);";

        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

            stmt.setString(1, produto.getDescricaoProduto());
            stmt.setDouble(2, produto.getPrecoProduto());
            stmt.setInt(3, produto.getCodigoFornecedor());

            stmt.execute();
            this.conexao.commit();

        } catch (SQLException e) {
            this.conexao.rollback();
            throw e;
        }
    }

    @Override
    public List<Produto> fidAll() throws SQLException {
        query = "select * from produto";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                Produto p = new Produto(
                        resultSet.getString("descricao_produto"),
                        resultSet.getDouble("preco_produto"),
                        resultSet.getInt("codigo_fornecedor"),
                        resultSet.getInt("codigo"));
                listaProdutos.add(p);
            }
            return listaProdutos;

        } catch (SQLException e) {
            throw e;
        }
    }

    public Produto findById(int id) throws SQLException {
        query = "select * from produto where codigo = ?;";

        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();
            if (resultSet.next()) {
                Produto pesquisado = new Produto(resultSet.getString("descricao_produto"),
                                                 resultSet.getDouble("preco_produto"),
                                                 resultSet.getInt("codigo_fornecedor"),
                                                 resultSet.getInt("codigo"));

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
        query = "delete from produto where codigo = ?;";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            this.conexao.commit();
        } catch (SQLException e) {
            this.conexao.rollback();
            throw e;
        }
    }


    public void merge(Produto produto, int id) throws SQLException {
        query = "update produto set descricao_produto = ?, preco_produto = ?, codigo_fornecedor = ? where codigo=?;";

        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
            stmt.setString(1, produto.getDescricaoProduto());
            stmt.setDouble(2, produto.getPrecoProduto());
            stmt.setInt(3, produto.getCodigoFornecedor());
            stmt.setInt(4, id);

            stmt.executeUpdate();
            this.conexao.commit();

        } catch (SQLException e) {
            this.conexao.rollback();
            throw e;
        }
    }
}
