package basics;

/**
 *
 * @author Danny Franco
 */
public class Personaje {

    private String nom;
    private int x;
    private int y;
    private double dinero;
    private String mochila;

    //constructor 
    public Personaje(String n, int x, int y, double d, String m) {
        this.nom = n;
        this.x = x;
        this.y = y;
        this.dinero = d;
        this.mochila = m;
    }

    public double getDinero() {
        return dinero;
    }

    public String getMochila() {
        return mochila;
    }

    
    
    @Override
    public String toString() {
        return "soy: " + nom + " y estoy en (" + x + "," + y + ") dinero:" + dinero + " mochila: " + mochila ;
    }
    

    
    public void moverDerecha(){
        x--;        
    }
    public void moverAbajo(){
        x++;
    }
    public void moverIzquierda() {
        y--;
    }
    public void moverArriba(){
        y++;
    }
    //dar dinero
    public void darDinero(Personaje pers, double dine){
        
        dinero = dinero - dine;
       pers.dinero =pers.dinero + dine;
    }
    //mochila
    public void dejaObjeto (Personaje pers){
        pers.mochila = mochila;
        mochila = "";
                
    }
    public void cogerObjeto(Personaje pers, String objeto){
        pers.mochila = objeto;
    }

}
