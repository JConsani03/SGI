package impl;

import dataBase.Conector;
import interfaces.DAO_Compra;
import java.sql.*;
import java.util.ArrayList;
import modelos.Compra;

/**
 *
 * @version Alpha 0.0.2
 * @author Andrés García
 */
public class DAO_CompraImpl extends Conector implements DAO_Compra {

    @Override
    public void insertCompra(Compra compra) {
        conectar();
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO Compra (fecha, precioT, descrip) VALUES(?, ?, ?)");
            ps.setString(1, compra.getFecha());
            ps.setInt(2, compra.getPrecioT());
            ps.setString(3, compra.getDescrip());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("ERROR-IMPL: " + ex);
        } finally {
            desconectar();
        }
    }

    @Override
    public void deleteCompra(int id) {
        conectar();
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM Compra WHERE id = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("ERROR-IMPL: " + ex);
        } finally {
            desconectar();
        }
    }

    @Override
    public void updateCompra(Compra compra) {
        conectar();
        try {
            PreparedStatement ps = conn.prepareStatement("UPDATE Compra SET fecha = ?, precioT = ?, descrip = ? WHERE id = '" + compra.getId() + "'");
            ps.setString(1, compra.getFecha());
            ps.setInt(2, compra.getPrecioT());
            ps.setString(3, compra.getDescrip());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("ERROR-IMPL: " + ex);
        } finally {
            desconectar();
        }
    }

    @Override
    public ArrayList<Compra> selectCompra(int id) {
        String sql = "SELECT * FROM Compra WHERE id = '" + id + "'";
        return selectCompraMetod(sql);
    }

    @Override
    public ArrayList<Compra> selectCompra() {
        String sql = "SELECT * FROM Compra";
        return selectCompraMetod(sql);
    }

    private ArrayList<Compra> selectCompraMetod(String sql) {
        conectar();
        ArrayList<Compra> Compras = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Compras.add(new Compra(rs.getInt("id"), rs.getString("fecha"), rs.getInt("precioT"), rs.getString("descrip")));
            }

        } catch (SQLException ex) {
            System.out.println("ERROR-IMPL: " + ex);
        } finally {
            desconectar();
        }
        return Compras;
    }
}
