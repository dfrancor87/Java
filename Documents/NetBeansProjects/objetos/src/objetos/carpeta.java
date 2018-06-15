/*
155.Fer una classe Carpeta per gestionar la informació del nostre disc extraïble. Tindrà un
atribut nom amb el nom de la carpeta, un altre atributs tipus per indicar el possible
contingut de la carpeta (Música, Vídeo, Imatges, Documents) i un altre atribut
(numArxius) que indicarà el nombre d'arxius d'aquell tipus que conté la carpeta.
 */
package objetos;

public class carpeta {
    private String nom;
    private String tipo;
    private int numArchivos;
    
    //Constructor

    public carpeta(String nom, String tipo, int numArchivos) {
        this.nom = nom;
        this.tipo = tipo;
        this.numArchivos = numArchivos;
    }
    //getter

    public String getTipo() {
        return tipo;
    }

    public int getNumArchivos() {
        return numArchivos;
    }
    
    //ToString

    @Override
    public String toString() {
        return "carpeta{" + "nom=" + nom + ", tipo=" + tipo + ", numArchivos=" + numArchivos + '}';
    }
    
    
    
}
