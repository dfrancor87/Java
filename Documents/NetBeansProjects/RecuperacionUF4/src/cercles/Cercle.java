

package cercles;

import processing.core.PApplet;

/**
 * Clase Cercle que hereda de Figura
 * @author Hanhan
 *
 */
public class Cercle extends Figura {


	public Cercle(PApplet pApplet,  float color, int radi) {
		super(pApplet, color, radi);

	}
	/**
	 * implementa el metodo mostrar() de la Figura
	 */
	@Override
	public void mostrar (int x, int y) {
            //color rojo con distintos tonos
            Figura.pApplet.fill((float)this.getColor(), 0, 0);
            Figura.pApplet.ellipse(x, y, this.getRadi(), this.getRadi());
            Figura.pApplet.text((int)this.getRadi(), x, y+100);
	}

        

}
