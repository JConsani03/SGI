package dataBase;

import modelos.Usuario;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Compra;

/**
 *
 * @version Alpha 0.0.2
 * @author Andrés García
 */
public class modelosImpl extends Conector {

    public modelosImpl() {
    }

    public void setU(Compra compra) {
        try {
            conectar();
            
            PreparedStatement ps = conn.prepareStatement(("INSERT INTO Compra (id, fecha, precioT, descrip) "
                    + "VALUES (?,?,?,?);"));
            ps.setInt(1, 3);
            ps.setString(2,"2023-09-18");
            ps.setInt(3, 300);
            ps.setString(4, "Hola");
            ps.executeUpdate();
            
            desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(modelosImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
