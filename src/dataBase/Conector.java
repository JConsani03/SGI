package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * 
 * @version Alpha 0.0.2
 * @author Andrés García
 */
public class Conector {
    public Connection conn;
    private final String url = "jdbc:sqlite:BaseDeDatos.db";
    
    public void conectar(){
        try{
        conn = DriverManager.getConnection(url);
        
        int g = conn.prepareStatement("CREATE TABLE IF NOT EXISTS Compra ("
                + "id INTEGER PRIMARY KEY,"
                + "fecha TEXT,"
                + "precioT INTEGER, "
                + "descrip TEXT"
                + ");").executeUpdate();
        }catch(SQLException e){
            System.out.println("ERROR JDBC: " + e);
        }
    }
    
    public void desconectar(){
        try {
            if(!conn.isClosed() || conn != null){
                conn = null;
            }
        } catch (SQLException e) {
            System.out.println("ERROR JDBC: " + e);
        }
    }
}
