package infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoSQL {
    private Connection connection = null;
    private final String USERNAME = "root";
    private final String PASSWORD = "192373";
    private final String DATABASE_URL = "jdbc:mysql://localhost:3306/office?useTimezone=true&serverTimezone=UTC";


    public ConexaoSQL() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        this.connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        this.connection.setAutoCommit(false);
    }

    public Connection getConnection() {
        return this.connection;
    }

    public void close(){
        if (this.connection != null){
            try{
                this.connection.close();
            }catch(SQLException e){
                Logger.getLogger(ConexaoSQL.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    public void commit() throws SQLException {
        this.connection.commit();
        this.close();
    }

    public void rollback(){
        if (this.connection != null){
            try{
                this.connection.rollback();
            }catch(SQLException e){
                Logger.getLogger(ConexaoSQL.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
}
