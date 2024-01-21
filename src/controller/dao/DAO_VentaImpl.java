package controller.dao;

import controller.dataBase.Conector;
import java.sql.*;
import java.util.ArrayList;
import models.Venta;
import controller.dao.DAO_venta;
import java.util.function.Consumer;

/**
 * Implementación de la interfaz {@linkplain DAO_Venta}.
 *
 * @author Andrés García
 * @version Alpha 0.1.0
 *
 * @see Venta
 * @see DAO_Venta
 */
public class DAO_VentaImpl extends Conector implements DAO_venta {

    @Override
    public void insert(Venta venta) {
        conectar();
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO Venta (fecha, precioT, descrip) VALUES(?, ?, ?)");
            ps.setString(1, venta.getFecha());
            ps.setInt(2, venta.getPrecioT());
            ps.setString(3, venta.getDescrip());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("ERROR-IMPL: " + ex);
        } finally {
            desconectar();
        }
    }

    @Override
    public void delete(int id) {
        conectar();
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM Venta WHERE id = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("ERROR-IMPL: " + ex);
        } finally {
            desconectar();
        }
    }

    @Override
    public void update(Venta venta) {
        conectar();
        try {
            PreparedStatement ps = conn.prepareStatement("UPDATE Venta SET fecha = ?, precioT = ?, descrip = ? WHERE id = '" + venta.getId() + "'");
            ps.setString(1, venta.getFecha());
            ps.setInt(2, venta.getPrecioT());
            ps.setString(3, venta.getDescrip());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("ERROR-IMPL: " + ex);
        } finally {
            desconectar();
        }
    }

    @Override
    public ArrayList<Venta> select(String fecha) {
        String sql = "SELECT * FROM Venta WHERE fecha = '" + fecha + "'";
        return selectCompraMetod(sql);
    }

    private ArrayList<Venta> selectCompraMetod(String sql) {
        conectar();
        ArrayList<Venta> Compras = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Compras.add(new Venta(rs.getInt("id"),
                        rs.getString("fecha"),
                        rs.getInt("precioT"),
                        rs.getString("descrip")));
            }

        } catch (SQLException ex) {
            System.out.println("ERROR-IMPL: " + ex);
        } finally {
            desconectar();
        }
        return Compras;
    }
}
