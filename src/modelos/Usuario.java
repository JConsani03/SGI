package modelos;

/**
 * Modelo para la tabla <strong>Usuario</strong>. Contiene todos los atributos
 * correspondientes a los campos de la tabla 'Usuario' en la Base de Datos, como
 * también sus respectivos métodos {@code getters}.
 *
 * @author Andrés García
 * @version Alpha 0.1.0
 */
public class Usuario {

    private final String nombre;
    private final String pass;
    private final String correo;
    private final String cedula;

    /**
     * Constructor de la clase. Aquí se inician los atributos según los
     * parámetros pasados.
     *
     * @param nombre {@linkplain String} con el <strong>nombre</strong> del
     * usuario.
     * @param pass {@linkplain String} con la <strong>contraseña</strong> del
     * usuario.
     * @param correo {@linkplain String} con el <strong>correo</strong> del
     * usuario.
     * @param cedula {@linkplain String} con la <strong>cédula de
     * identidad</strong> del usuario.
     */
    public Usuario(String nombre, String pass, String correo, String cedula) {
        this.nombre = nombre;
        this.pass = pass;
        this.correo = correo;
        this.cedula = cedula;
    }
    
    /**
     * Obtén el nombre del usuario.
     *
     * @return El {@linkplain String} con el <strong>nom<bre</strong> del
     * usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtén la contraseña del usuario.
     *
     * @return El {@linkplain String} con la <strong>contraseña</strong> del
     * usuario.
     */
    public String getPass() {
        return pass;
    }

    /**
     * Obtén el correo del usuario.
     *
     * @return El {@linkplain String} con el <strong>correo</strong> del
     * usuario.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Obtén la cédula del usuario.
     *
     * @return El {@linkplain String} con la <strong>cédula</strong> del
     * usuario.
     */
    public String getCedula() {
        return cedula;
    }

}
