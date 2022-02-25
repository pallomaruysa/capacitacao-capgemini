package com.br.orientacaooo.server;

import com.br.orientacaooo.model.dao.FornecedorDAO;
import com.br.orientacaooo.model.dao.ProdutoDAO;
import com.br.orientacaooo.model.entity.Fornecedor;
import com.br.orientacaooo.model.entity.Produto;

import java.awt.*;
import java.sql.SQLException;
import java.util.Scanner;

public class PrincipalCadastro {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);

        Produto p = new Produto("Detergente limpol",1.29, 1);
        Produto p4 = new Produto( "sabonete",2.99, 1);
        Produto p6 = new Produto( "atum",7.90,1);
        Produto p2 = new Produto( "guardanapo",2.90,-10);

        ProdutoDAO p2DAO = new ProdutoDAO();
        //System.out.println(p2DAO.fidAll());

        ProdutoDAO pDAO1 = new ProdutoDAO();
        //pDAO1.save(p4);
        //pDAO1.delete(30);
        //pDAO1.merge(p, 3);
        System.out.println(pDAO1.findById(5));

        ProdutoDAO p3DAO = new ProdutoDAO();
        //System.out.println(p3DAO.fidAll());

        // -----------------------------------------------------------

        Fornecedor fornecedor = new Fornecedor("Conseguimos Pai", "434.354.434-53");

        FornecedorDAO fDAO = new FornecedorDAO();
        //System.out.println(fDAO.fidAll());
        FornecedorDAO f2DAO = new FornecedorDAO();
        //f2DAO.save(fornecedor);
        //f2DAO.delete(12);
        //f2DAO.merge(fornecedor,10);
        System.out.println(f2DAO.findById(11));
        FornecedorDAO f3DAO = new FornecedorDAO();
        //System.out.println(f3DAO.fidAll());


        sc.close();
    }
}
