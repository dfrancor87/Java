
package cercles;

/**
 *
 * @author Hanhan
 */
/**
 * Es una subclase de PApplet para sobreescribir 3 m�todos 
 * @author chenh
 *
 */
import java.util.Arrays;
import processing.core.PApplet;

public class ProvaFigura extends PApplet {

	private Cercle cercles[] = new Cercle[5];  
	
	public static void main(String[] args) {
		PApplet.main("cercles.ProvaFigura");
	}
	
	/**
	 * Poner las medidas del marco donde pondremos las figuras
	 */
	@Override
	public void settings() {
		size(500, 500);
	}
	
	//Iniciar objetos de las figuras
	public  void setup() {
		cercles[0] = new Cercle(this, 180, 29);
		cercles[1] = new Cercle(this, 255, 70);
		cercles[2] = new Cercle(this, 100, 57);
		cercles[3] = new Cercle(this, 150, 95);
		cercles[4] = new Cercle(this, 200, 98);
                
                // ordenar según radio
                Arrays.sort(cercles, new CerclePerRadi());
                int distancia = 50;
                for(Cercle cercle : cercles){
                    cercle.mostrar(distancia, 100);
                    distancia += 100;
                }   
                
                Arrays.sort(cercles, new CerclePerColor());
                
                //ordenar según tono de color

                distancia = 50;
                for(Cercle cercle : cercles){
                    cercle.mostrar(distancia, 300);
                    distancia += 100;
                }  
                
	}
	

}
