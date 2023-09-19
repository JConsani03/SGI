package modelos;

/**
 * 
 * @version Alpha 0.0.1
 * @author Andrés García
 */
public class Usuario {
    private String nombre;
    private String pass;
    private String correo;
    private String cedula;
    
    public Usuario(String nombre, String pass, String correo, String cedula){
        this.nombre = nombre;
        this.pass = pass;
        this.correo = correo;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    
}
