package basics;

/**
 *
 * @author Danny Franco
 */
public class Cotxe {

    public static int cont = 10000;
    private static int iva = 21;
    private int id;
    private String nom;
    private double preu;

    public Cotxe(String n, double p) {
        nom = n;
        preu = p;
        id = cont;
        cont++;
    }

    public static void setIva(int nouIva) {
        iva = nouIva;
    }

    public double calcularPreu() {
        return preu + preu * iva / 100;
    }

    @Override
    public String toString() {
        return "idCotxe: " + id + " Nom: " + nom +" Preu sense iva: " + preu +  " Preu amb Iva " + this.calcularPreu()  ;
    }

}
