package models;

/**
 * Modelo para la tabla <strong>Venta</strong>. Contiene todos los atributos
 * correspondientes a los campos de la tabla 'Venta' en la Base de Datos, como
 * también sus respectivos métodos {@code getters}.
 *
 * @author Andrés García
 * @version Alpha 0.1.0
 */
public class Venta {

    private final int id;
    private final String fecha;
    private final int precioT;
    private final String descrip;

    /**
     * Constructor de la clase. Aquí se inician los atributos según los
     * parámetros pasados.
     *
     * @param id {@linkplain Integer} con el <strong>id</strong> de la venta.
     * @param fecha {@linkplain String} con la <strong>fecha</strong> de la
     * venta.
     * @param precioT {@linkplain Integer} con el <strong>precio total</strong>
     * de la venta.
     * @param descrip {@linkplain String} con la <strong>descripción</strong> de
     * la venta.
     */
    public Venta(int id, String fecha, int precioT, String descrip) {
        this.id = id;
        this.fecha = fecha;
        this.precioT = precioT;
        this.descrip = descrip;
    }

    /**
     * Obtén el id de la venta.
     *
     * @return {@linkplain Integer} con el <strong>id</strong> de la venta.
     */
    public int getId() {
        return id;
    }

    /**
     * Obtén la fecha de la venta.
     *
     * @return {@linkplain String} con la <strong>fecha</strong> de la venta.
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Obtén el precio total de la venta.
     *
     * @return {@linkplain Integer} con el <strong>precio total</strong>
     * de la venta.
     */
    public int getPrecioT() {
        return precioT;
    }

    /**
     * Obtén la descripción de la venta.
     *
     * @return {@linkplain String} con la <strong>descripción</strong> de la
     * venta.
     */
    public String getDescrip() {
        return descrip;
    }

}
