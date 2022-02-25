package br.com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionFactory {
    private Connection connection = null;
    private final String USERNAME = "root";
    private final String DATABASE_URL = "jdbc:mysql://localhost:3306/gerenciadordetarefas?useTimezone=true&serverTimezone=UTC";
    private final String PASSWORD = "test123";

    public ConnectionFactory() {
        try {
        	Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            this.connection.setAutoCommit(false);
            System.out.println("Conexão com o banco efetuada com sucesso");
        } catch (SQLException sql) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, 0);
            System.out.println("Não foi possível conectar ao banco, entre em contato com o Administrador do sistema");
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


    }

    public Connection getConection() {
        return this.connection;
    }

    public void close() {
        try {
            if (this.connection != null) {
                this.connection.close();
                System.out.println("Conexão fechada");
            } else {
                System.out.println("Não há nenhuma conexão ao banco");
            }
        } catch (SQLException e) {
            System.out.println("Não foi possível fechar a conexão");
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, 0);
        }


    }

    public void commit() {
        try {
            this.connection.commit();
            this.close();
        } catch (SQLException e) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, 0);
        }
    }

    public void roolback() {
        try {
            this.connection.rollback();
        } catch (SQLException e) {
            System.out.println("Não foi possível reverter o comando");
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, 0);

        }
    }
}
