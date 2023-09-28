package interfaces;

import java.util.ArrayList;
import modelos.Compra;

/**
 * 
 * @version Alpha 0.0.2
 * @author Andrés García
 */
public interface DAO_Compra {
    public void insertCompra(Compra compra);
    public void deleteCompra(int id);
    public void updateCompra(Compra compra);
    public ArrayList<Compra> selectCompra(int id);
    public ArrayList<Compra> selectCompra();
}
