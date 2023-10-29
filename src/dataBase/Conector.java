package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase de conexión con la base de datos. Contiene los métodos para iniciar y
 * cerrar la conexión con la base de datos <strong>SQLite.</strong>
 *
 * @author Andrés García
 * @version Alpha 0.1.0
 */
public class Conector {

    public Connection conn;
    private final String url = "jdbc:sqlite:src/dataBase/BaseDeDatos.db";

    public void conectar() {
        try {
            conn = DriverManager.getConnection(url);

            conn.prepareStatement("CREATE TABLE IF NOT EXISTS Venta ("
                    + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "fecha TEXT,"
                    + "precioT INTEGER, "
                    + "descrip TEXT"
                    + ");").executeUpdate();
            conn.prepareStatement("CREATE TABLE IF NOT EXISTS Usuario ("
                    + "cedula TEXT PRIMARY KEY,"
                    + "pass TEXT,"
                    + "correo TEXT, "
                    + "nombre TEXT"
                    + ");").executeUpdate();
            conn.prepareStatement("CREATE TABLE IF NOT EXISTS Producto ("
                    + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "descrip TEXT,"
                    + "precio INTEGER,"
                    + "unidades INTEGER,"
                    + "nombre TEXT"
                    + ");").executeUpdate();
            conn.prepareStatement("CREATE TABLE IF NOT EXISTS Venta_Producto ("
                    + "id_Venta INTEGER,"
                    + "id_Producto INTEGER,"
                    + "cantidad INTEGER, "
                    + "FOREIGN KEY(id_Venta) REFERENCES Venta(id),"
                    + "FOREIGN KEY(id_Producto) REFERENCES Producto(id)"
                    + ");").executeUpdate();
        } catch (SQLException e) {
            System.out.println("ERROR JDBC: " + e);
        }
    }

    public void desconectar() {
        try {
            if (!conn.isClosed() || conn != null) {
                conn = null;
            }
        } catch (SQLException e) {
            System.out.println("ERROR JDBC: " + e);
        }
    }
}
