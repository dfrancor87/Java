
package museuRoger;

/**
 *
 * @author Roger Duñó
 */
public class Quadre extends Obra {
    private static int codi=10000;
    private float alt;
    private float ample;
    
    public Quadre(String nom, float alt, float ample){
        super(nom);
        this.alt=alt;
        this.ample=ample;
    }
    
    public Quadre(String nom, String autor, float alt, float ample){
        super(nom, autor);
        this.alt=alt;
        this.ample=ample;
    }    
    
    @Override
    public int nouCodi() {
        this.codi++;
        return codi;
    }
    
        
}
