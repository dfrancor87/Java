package objetosPiso;
import java.util.Scanner;
import java.io.*;


/**
 * Classe per provar la classe Pis
 * @author prof
 */
public class LlegirPis {
    public static void main(String[] args) {
        
        // public Pis(int metrosCuadrados, int habitaciones, int aseos, double precio, boolean ascensor, int altura) {
        Pis meu = llegirPis();
        // Mostrem el pis que tot just hem llegit
        if (meu != null) {
            System.out.println("Aquestes són les dades del pis:");
            System.out.println(meu);
        }
    }
    
    // Recupera un pis del fitxer indicat per l'usuari
    public static Pis llegirPis() {
        Pis aux = null;
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Nom del fitxer a recuperar ? ");
            String nomFitxer = entrada.next();
            FileInputStream fi = new FileInputStream(nomFitxer);
            ObjectInputStream obi = new ObjectInputStream(fi);
            aux = (Pis) obi.readObject();
            obi.close();
            fi.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fitxer no trobat");
        } catch (EOFException e) {
            System.out.println("Hem arribat al final del fitxer");
        } catch (ClassNotFoundException e) {
            System.out.println("Format de fitxer  incompatible");
        } catch (IOException e) {
            System.out.println("Problemes d'E/S");
            System.out.println(e);
        } 
        // Retornem el pis a la funció que ens ha cridat
        return aux;
    }
}
