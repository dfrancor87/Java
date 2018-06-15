package museu;

/**
 *
 * @author Hanhan
 */
public class Quadre extends Obra {

    private static int codi = 10001;
    private double alt;
    private double ample;

    public Quadre(String nom) {
        super(nom);
        codi++;
    }

    public Quadre(String nom, String autor) {
        super(nom, autor);
        codi++;
    }
    
    public int nouCodi(){
        return codi;
    }

}
