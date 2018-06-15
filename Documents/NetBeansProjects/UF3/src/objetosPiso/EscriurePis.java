package objetosPiso;
import java.util.Scanner;
import java.io.*;


/**
 * Classe per provar la classe Pis
 * @author prof
 */
public class EscriurePis {
    public static void main(String[] args) {
        
        // public Pis(int metrosCuadrados, int habitaciones, int aseos, double precio, boolean ascensor, int altura) {
        Pis meu = new Pis(100,4,2,352348.67,true,4);
        // Guardem el pis al disc
        gravarPis(meu);
    }
    
    // Espera una resposta S o N de part de l'usuari
    public static boolean siNo (String pregunta)
    {
        Scanner entrada = new Scanner(System.in);
        char car;
        do
        {
            System.out.print(pregunta+" [S/N] ? ");
            car = entrada.next().toUpperCase().charAt(0);
            if (car != 'N' && car != 'S')
            {
                System.out.println("S'esperava una resposta S/N ...");
            }
        }
        while (car != 'N' && car != 'S');
        return car == 'S';
    }
    
    // Guarda un pis al fitxer indicat per l'usuari
    public static void gravarPis(Pis p) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nom del fitxer a gravar ? ");
        String nomFitxer = entrada.next();
        File in = new File(nomFitxer);
        if(in.exists()) {
            System.out.print("El fitxer ja existeix... ");
            if (siNo ("Ho vols sobreescriure"))
            {
                // Eliminem el fitxer abans d'escriure les dades
                in.delete();
            }
            else
            {
                System.out.println("!!! ATENCIÓ !!!. No s'ha gravat el fitxer ...\n");
                return;
            }
        }
        try {
			FileOutputStream fo = new FileOutputStream(nomFitxer, false);
			ObjectOutputStream obo = new ObjectOutputStream(fo);
			// Mostrem el pis just abans de guardar-lo
			System.out.println(p);
			// Escrivim només un pis. En el cas d'un vector podria ser un bucle
			obo.writeObject(p);
			obo.close();
			fo.close();
		} catch (IOException e) {
			System.out.println("Problemes d'E/S");
			System.out.println(e);
		}
    }
}
