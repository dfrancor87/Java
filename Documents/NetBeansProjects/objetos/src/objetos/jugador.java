package objetos;

/**
 *
 * @author Danfer
 */
public class jugador {

    private String nom;
    private int dorsal;
    private String posicion;
    private int edad;
    private boolean titular;
    

    //constructor  sin parametros
    public jugador(String nom, int dorsal, String posicion, int edad, boolean titular) {
        this.nom = nom;
        this.dorsal = dorsal;
        this.posicion = posicion;
        this.edad = edad;
        this.titular = titular;
    }

    //getter y setter
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }
    //99999

    
    //toString
    @Override
    public String toString() {

        String retorno = "nombre: " + nom + ", Dorsal: " + dorsal + ", Posicion:" + posicion + ", edad:" + edad;
        if (titular) {
            return retorno + " Tiular";
        } else {
            return retorno + " Suplente";

        }

    }

}
