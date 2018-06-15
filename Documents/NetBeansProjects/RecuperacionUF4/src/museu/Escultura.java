package museu;

/**
 *
 * @author Hanhan
 */
public class Escultura extends Obra {

    private static int codi = 20001;
    private double pes;

    public Escultura(String nom) {
        super(nom);
        codi++;
    }

    public Escultura(String nom, String autor) {
        super(nom, autor);
        codi++;
    }
    
    public int nouCodi(){
        return codi;
    }
}
