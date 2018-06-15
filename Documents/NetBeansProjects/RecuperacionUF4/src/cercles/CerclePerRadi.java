

package cercles;

import java.util.Comparator;
import processing.core.PApplet;

/**
 * Clase Cercle que hereda de Figura
 * @author Hanhan
 *
 */
public class CerclePerRadi  implements Comparator {


        @Override
        public int compare(Object t, Object t1){
            Cercle c1 = (Cercle)t;
            Cercle c2 = (Cercle)t1;
            return Double.compare(c1.getRadi(), c2.getRadi());
        }
        

}
