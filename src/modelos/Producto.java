package modelos;

/**
 * Modelo para la tabla <strong>Producto</strong>. Contiene todos los atributos
 * correspondientes a los campos de la tabla 'Producto' en la Base de Datos,
 * como también sus respectivos métodos {@code getters}.
 *
 * @author Andrés García
 * @version Alpha 0.1.0
 */
public class Producto {

    private final int id;
    private final String descrip;
    private final int precio;
    private final int unidades;
    private final String nombre;

    /**
     * Constructor de la clase. Aquí se inician los atributos según los
     * parámetros pasados.
     *
     * @param id {@linkplain Integer} con el <strong>id</strong> del producto.
     * @param nombre {@linkplain String} con el <strong>nombre</strong> del
     * producto.
     * @param descrip {@linkplain String} con la <strong>descripción</strong>
     * del producto.
     * @param precio {@linkplain Integer} con el <strong>precio</strong> del
     * producto.
     * @param unidades {@linkplain Integer} con el <strong>número de
     * unidades</strong> del producto.
     */
    public Producto(int id, String nombre, String descrip, int precio, int unidades) {
        this.id = id;
        this.descrip = descrip;
        this.precio = precio;
        this.unidades = unidades;
        this.nombre = nombre;
    }
    
    /**
     * Obtén el nombre del producto.
     * 
     * @return El {@linkplain String} con el nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtén el id del producto.
     * 
     * @return El {@linkplain Integer} con el <strong>id</strong> del producto.
     */
    public int getId() {
        return id;
    }

    /**
     * Obtén la descripción del producto.
     * 
     * @return El {@linkplain String} con la <strong>descripción</strong>
     * del producto.
     */
    public String getDescrip() {
        return descrip;
    }

    /**
     * Obtén el precio del producto.
     * 
     * @return El {@linkplain Integer} con el <strong>precio</strong> del
     * producto.
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Obtén las unidades disponibles del producto.
     * 
     * @return El {@linkplain Integer} con el <strong>número de
     * unidades</strong> del producto.
     */
    public int getUnidades() {
        return unidades;
    }

}
