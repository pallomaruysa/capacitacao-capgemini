package infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoMysql {
    private Connection connection = null;

    // usu�rio de conexao com o banco
    private final String USERNAME = "root";

    //senha do banco
    private final String PASSWORD = "192373";

    //endereço do banco              -- drive do banco  -- local do banco   -- nome do banco --definindo zona de fuso horário
    private final String DATABASE_URL = "jdbc:mysql://localhost:3306/projeto?";

    public ConexaoMysql() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        this.connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        this.connection.setAutoCommit(false);
    }

    public Connection getConnection() {
        return this.connection;
    }

    public void close() {
        if (connection != null) {
            try {
                connection.close();
            } catch (Exception e) {
                Logger.getLogger(ConexaoMysql.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    public void commit() throws SQLException {
        this.connection.commit();
        this.close();
    }

    public void rollback() {
        if (connection != null) {
            try {
                connection.rollback();
            } catch (Exception e) {
                Logger.getLogger(ConexaoMysql.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
}
