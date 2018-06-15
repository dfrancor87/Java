package interfaces;

import java.util.Comparator;

/**
 *
 * @author Danny Franco
 */
public class CotxePerAnio implements Comparator {

    @Override
    public int compare(Object t, Object t1) {
        Cotxe c1 =(Cotxe)t;
        Cotxe c2=(Cotxe)t1;
        return c1.getAnio()-c2.getAnio();
    }
    
    
}
