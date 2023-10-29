package impl;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import dataBase.Conector;
import interfaces.DAO_Producto;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.Producto;

/**
 * Implementación de la interfaz {@linkplain DAO_Producto}.
 * 
 * @author Andrés García
 * @version Alpha 0.1.0
 * 
 * @see Producto
 * @see DAO_Producto
 */
public class DAO_ProductoImpl extends Conector implements DAO_Producto{

    @Override
    public void insert(Producto producto) {
        conectar();
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT "
                    + "INTO Producto (descrip, precio, unidades, nombre) "
                    + "VALUES (?, ?, ?, ?)");
            ps.setString(1, producto.getDescrip());
            ps.setInt(2, producto.getPrecio());
            ps.setInt(3, producto.getUnidades());
            ps.setString(4, producto.getNombre());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("ERROR-IMPL: " + ex);
        } finally {
            desconectar();
        }
    }

    @Override
    public void update(Producto producto) {
        conectar();
        try {
            PreparedStatement ps = conn.prepareStatement("UPDATE Producto "
                    + "SET descrip = ?, precio = ?, unidades = ?, nombre = ? "
                    + "WHERE id = ?");
            ps.setString(1, producto.getDescrip());
            ps.setInt(2, producto.getPrecio());
            ps.setInt(3, producto.getUnidades());
            ps.setString(4, producto.getNombre());
            ps.setInt(5, producto.getId());
            if(ps.executeUpdate() == 0){
                JOptionPane.showMessageDialog(null, "El id del producto no coincide con alguno existente.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            System.out.println("ERROR-IMPL: " + ex);
        } finally {
            desconectar();
        }
    }

    /**
     *
     * @param nombre
     * @return
     */
    @Override
    public ArrayList<Producto> select(String nombre) {
        conectar();
        ArrayList<Producto> lista = new ArrayList<>();
        try {
            String sql = (nombre.equals("") 
                    ? "SELECT * FROM Producto" 
                    : "SELECT * FROM Producto WHERE nombre LIKE '" + nombre + "%'");
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Producto p = new Producto(
                        rs.getInt("id"), 
                        rs.getString("nombre"), 
                        rs.getString("descrip"), 
                        rs.getInt("precio"), 
                        rs.getInt("unidades"));
                lista.add(p);
            }
        } catch (SQLException ex) {
            System.out.println("ERROR-IMPL: " + ex);
        } finally {
            desconectar();
        }
        return lista;
    }

    @Override
    public void delete(int id) {
        conectar();
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM Producto WHERE id = ?");
            ps.setInt(1, id);
            if(ps.executeUpdate() == 0){
                JOptionPane.showMessageDialog(null, "El id del producto no coincide con alguno existente.", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "¡Elminación exitosa!", "ELIMINACIÓN", JOptionPane.QUESTION_MESSAGE);
            }
        } catch (SQLException ex) {
            System.out.println("ERROR-IMPL: " + ex);
        } finally {
            desconectar();
        }
    }
    
}
