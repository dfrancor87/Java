
package museuRoger;

/**
 *
 * @author Roger Duñó
 */
public class Escultura extends Obra {
    private static int codi=20000;
    private float pes;

    public Escultura(String nom, float pes) {
        super(nom);
        this.pes=pes;
    }
    
    public Escultura(String nom, String autor, float pes) {
        super(nom,autor);
        this.pes=pes;
    }    
        
    @Override
    public int nouCodi() {
        this.codi++;
        return codi;
    }
        
}