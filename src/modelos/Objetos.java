package modelos;

/**
 * 
 * @version Alpha 0.0.2
 * @author Andrés García
 */
public class Objetos {
    
    private int id;
    private String descrip;
    private int precio;
    private int unidades;
    private String fecha;
    
    public Objetos(int id, String descrip, int precio, int unidades, String fecha){
        this.id = id;
        this.descrip = descrip;
        this.precio = precio;
        this.unidades = unidades;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
