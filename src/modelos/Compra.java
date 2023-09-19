package modelos;

/**
 * 
 * @version Alpha 0.0.2
 * @author Andrés García
 */
public class Compra {
    private int id;
    private String fecha;
    private int precioT;
    private String descrip;
    
    public Compra(int id, String fecha, int precioT, String descrip){
        this.id = id;
        this.fecha = fecha;
        this.precioT = precioT;
        this.descrip = descrip;
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

    public int getPrecioT() {
        return precioT;
    }

    public void setPrecioT(int precioT) {
        this.precioT = precioT;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
    
    
}
