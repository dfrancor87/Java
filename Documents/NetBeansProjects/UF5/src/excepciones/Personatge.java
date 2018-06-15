
package excepciones;

/**
 *
 * @author Danny Franco
 */
public class Personatge {
    private int edat;
    private String nom;
    
    
    //separar con , una nueva exception
  //public Personatge (int edat, String nom) throws EdatNegativaException, InventException{
    public Personatge (int edat, String nom) throws EdatNegativaException, InventException{
        if(edat < 0){
            throw new EdatNegativaException();
        }else{
            if (nom.charAt(0)=='D'){ 
                throw new InventException();
                
            }
        this.edat = edat;
        this.nom = nom;                                       
        }
    }

    @Override
    public String toString() {
        return "Personatge{" + "edat=" + edat + ", nom=" + nom + '}';
    }
    
    
    
    
}
