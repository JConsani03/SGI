package principal;

import java.time.LocalDate;

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
}
