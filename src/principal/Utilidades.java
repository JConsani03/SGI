package principal;

import java.time.LocalDate;

/**
 *
 * @author andre
 */
public class Utilidades {
    public static String getFecha(){
        LocalDate now = LocalDate.now();
        return String.valueOf(now.getYear() + '-' + now.getMonthValue() + '-' + now.getDayOfMonth());    
    }
}
