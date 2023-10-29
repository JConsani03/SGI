package interfaces;

import java.util.ArrayList;

/**
 * Actúa como interfaz padre para todas aquellas interfaces del patrón de diseño
 * <strong>DAO</strong>.
 *
 * @author Andrés García
 * @version Alpha 0.1.0
 * 
 * @param <T> {@linkplain Object} con el tipo de los elementos con los que se
 * trabajará en las implementaciones.
 */
public interface DAO_CRUD<T> {

    public void insert(T t);

    public void update(T t);

    public ArrayList<T> select(String str);

    public void delete(int id);
}
