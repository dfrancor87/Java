package objetosPiso;

import java.util.Scanner;
import java.io.*;

/**
 * Classe per provar la classe Pis
 * @author prof
 */
public class EscriureVectorPisos {
    public static void main(String[] args) {
        
        // public Pis(int metrosCuadrados, int habitaciones, int aseos, double precio, boolean ascensor, int altura) {
        // Demanem memòria per a un vector de 5 pisos
        Pis [] vp = new Pis [5];
        // Constructor amb paràmetres
        vp[0] = new Pis(120, 4, 2, 350000, true, 4);
        vp[1] = new Pis(60, 2, 1, 150000, true, 2);
        vp[2] = new Pis(49, 1, 1, 90000, false, 4);
        vp[3] = new Pis(79, 3, 2, 190000, false, 1);
        // Per a cada pis hem de tornar a demanar memòria. Es crida el constructor sense paràmetres
        for (int i=4;i<5;i++) {
            System.out.println("Pis número: "+(i+1));
            System.out.println("=================");
            vp[i] = new Pis();
        }    

        // Guardem el vector de pisos al disc
        gravarVectorPisos(vp);

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
    
    // Guarda un vector de pisos al fitxer indicat per l'usuari
    public static void gravarVectorPisos (Pis [] vp) {
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
            // Escrivim tot el vector de pisos al fitxer mitjançant un bucle
            // for (int n=0;n<vp.length;n++) {
                // Al mateix temps que l'escrivim mostrem les dades de cada pis
				// System.out.println(vp[n]);
                obo.writeObject(vp);
            // }
            obo.close();
            fo.close();
        } catch (IOException e) {
            System.out.println("Problemes d'E/S");
            System.out.println(e);
        }
    }
}
