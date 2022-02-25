package com.br.orientacaooo.infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoMysql {

    //
    private Connection connection = null;

    //usuario de conexao com o banco
    private final String USERNAME = "root";

    //senha do banco
    private final String PASSWORD = "192373";

    //endereco do banco
    private final String DATABASE_URL = "jdbc:mysql://localhost:3306/demo?useTimezone=true&serverTimezone=UTC";

    // construtor
    public ConexaoMysql() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        this.connection = DriverManager.getConnection(DATABASE_URL,USERNAME, PASSWORD);
        this.connection.setAutoCommit(false);
    }

    //pegar conexao
    public Connection getConnection(){
        return this.connection;
    }

    //fechar a conexao
    public void close(){
        if (this.connection != null){
            //tenta executar esse bloco de comando
            try{
                this.connection.close();
            //se não conseguir ele printa na tela 'mais bunitinho' em qual class esta dando erro => qual o erro e a sua severidade
            }catch(SQLException e){
                Logger.getLogger(ConexaoMysql.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    // confirmar alteracao = > ctrl+enter (mysql)
    public void commit() throws SQLException {
        this.connection.commit();
        this.close();
    }

    //desfazer alteracao / aborta = > ctlr+c (git) => nao deixa inserir coisa incorretas no banco
    public void rollback(){
        if (this.connection != null){
            try{
                this.connection.rollback();
            }catch(SQLException e){
                Logger.getLogger(ConexaoMysql.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

}
