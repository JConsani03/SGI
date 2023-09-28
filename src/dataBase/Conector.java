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
    private final String url = "jdbc:sqlite:src/dataBase/BaseDeDatos.db";
    
    public void conectar(){
        try{
        conn = DriverManager.getConnection(url);
        
        conn.prepareStatement("CREATE TABLE IF NOT EXISTS Compra ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "fecha TEXT,"
                + "precioT INTEGER, "
                + "descrip TEXT"
                + ");").executeUpdate();
        conn.prepareStatement("CREATE TABLE IF NOT EXISTS Usuario ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "fecha TEXT,"
                + "precioT INTEGER, "
                + "descrip TEXT"
                + ");").executeUpdate();
        conn.prepareStatement("CREATE TABLE IF NOT EXISTS Reabastecer ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "fecha TEXT,"
                + "proveedor TEXT, "
                + "unidades INTEGER,"
                + "precioT INTEGER,"
                + "precioPU INTERGER"
                + ");").executeUpdate();
        conn.prepareStatement("CREATE TABLE IF NOT EXISTS producto ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "descrip TEXT,"
                + "precio INTEGER,"
                + "unidades INTEGER,"
                + "nombre TEXT"
                + ")").executeUpdate();
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
