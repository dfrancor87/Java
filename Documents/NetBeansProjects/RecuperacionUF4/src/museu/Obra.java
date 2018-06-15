

package museu;

/**
 *
 * @author Hanhan
 */
public abstract class Obra {
    
    private String nom;
    public static final String AUTOR_PER_DEFECTE = "ANONIM";
    private String autor; 
    
    public Obra(String nom){
        this.nom = nom;
        this.autor = AUTOR_PER_DEFECTE;
    }
    
    public Obra(String nom, String autor ){
        this.nom = nom;
        this.autor = autor;
    }
    
    public abstract int nouCodi();
    
    public String getNom(){
        return nom;
    }

    //retornar valores nom, autor i codi
    @Override
    public String toString() {
        return "Obra{" + "nom=" + nom + ", autor=" + autor +" Codi="+this.nouCodi()+'}';
    }
    
    
    
}
