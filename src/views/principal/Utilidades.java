package views.principal;

import java.time.LocalDate;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *  Esta clase contiene métodos útiles para ser usados
 *  en diferentes clases.
 * 
 * @author Andrés García
 * @version Alpha 0.1.0
 * @since 1.8
 */
public class Utilidades {
    
    /**
     * Devuelve la fecha actual del dispositivo.
     * 
     * @return El {@linkplain String} con la fecha actual en formato <strong>"YYYY-MM-dd"</strong>.
     */
    public static String getFecha(){
        LocalDate now = LocalDate.now();
        return String.valueOf(now.getYear() + '-' + now.getMonthValue() + '-' + now.getDayOfMonth());    
    }
    
    /**
     * Añade un nuevo {@linkplain JPanel} principal y de historial al {@linkplain JTabbedPane} pasado.
     * 
     * @param titleP {@linkplain String} con el título del panel principal.
     * @param titleH {@linkplain String} con el título del panel Historial.
     * @param panelP {@linkplain JPanel} principal a añadir.
     * @param panelH {@linkplain JPanel} de historial a añadir.
     * @param contenedor {@linkplain JTabbedPane} contenedor.
     */
    public static void setVista(String titleP, String titleH, JPanel panelP, JPanel panelH, JTabbedPane contenedor){
        contenedor.removeAll();
        contenedor.add(titleP, panelP);
        contenedor.add(titleH, panelH);
        contenedor.revalidate();
        contenedor.repaint();
    }
    /**
     * Añade un nuevo {@linkplain JPanel} al {@linkplain JTabbedPane} pasado.
     * 
     * @param title {@linkplain String} con el título del panel.
     * @param panel {@linkplain JPanel} a añadir.
     * @param contenedor {@linkplain JTabbedPane} contenedor.
     */
    public static void setVista(String title, JPanel panel, JTabbedPane contenedor){
        contenedor.removeAll();
        contenedor.add(title, panel);
        contenedor.revalidate();
        contenedor.repaint();
    }
}
