/*
Crea una classe Estudiant que guarda nom i cognoms, nota mitjana i nom de l’Institut,
en el nostre cas “Jaume Balmes”. 
Defineix els atributs i els constructors.
Crea dos objectes de la classe Estudiant.
Passa a majúscules el nom i cognoms dels dos estudiants.
Canvia el nom de l’Institut per “Institut Jaume Balmes”.
 */
package basics;

/**
 *
 * @author Danny Franco
 */
public class Estudiant {

    private String nom, cog1, cog2;
    private double notaMitjana;
    public static String nomInstitut = "Jaume Balmes";

    public Estudiant(String n, String c1, String c2, double nota) {
        nom = n;
        cog1 = c1;
        cog2 = c2;
        notaMitjana = nota;
        nomInstitut = nomInstitut;
    }

    public static void setNomInstitut() {
        nomInstitut = "Institut Jaume Balmes";
    }

    public String setNom() {
        return nom = nom.toUpperCase();
    }

    public String setCog1() {
        return cog1 = cog1.toUpperCase();
    }

    public String setCog2() {
        return cog2 = cog2.toUpperCase();
    }

    @Override
    public String toString() {
        return "nom: " + nom + ", cog1: " + cog1 + ", cog2: " + cog2 + ", nota Mitjana: " + notaMitjana + " Institut: " + nomInstitut;
    }

}
