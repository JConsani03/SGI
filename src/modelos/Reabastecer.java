package modelos;

/**
 * 
 * @version Alpha 0.0.2
 * @author Andrés García
 */
public class Reabastecer {
    private int id;
    private String fecha;
    private String proveedor;
    private String unidades;
    private int precioT;
    private int precioPU;
    
    public Reabastecer(int id, String fecha, String proveedor, String unidades, int precioT, int precioPU){
        this.id = id;
        this.fecha = fecha;
        this.proveedor = proveedor;
        this.unidades = unidades;
        this.precioT = precioT;
        this.precioPU = precioPU;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getUnidades() {
        return unidades;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

    public int getPrecioT() {
        return precioT;
    }

    public void setPrecioT(int precioT) {
        this.precioT = precioT;
    }

    public int getPrecioPU() {
        return precioPU;
    }

    public void setPrecioPU(int precioPU) {
        this.precioPU = precioPU;
    }
    
    
}
