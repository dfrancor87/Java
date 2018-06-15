package objetosFactura;

import java.util.Scanner;
import java.io.*;

/**
 * Serveix per provar la classe Factura
 * @author prof
 */
public class PruebaFactura {
    
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

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        // Declarem el vector de fins a 1000 factures
        Factura[] listaFacturas = null;
        int indice = 0;

        // Primer preguntem si volem recuperar les dades d'un fitxer
        System.out.println("1- Recuperar les dades d'un fitxer");
        System.out.println("2- Treballar en memòria");
        System.out.print ("Que vols fer [1/2] ? ");
        
        // Llegim la dada de l'usuari i si no és 1 o 2 sortim
        char resp = entrada.next().charAt(0);
        if (resp == '2') {
            listaFacturas = new Factura[1000];
            // Omplim unes quantes posicions del vector
            listaFacturas[0] = new Factura("Juan Carlos", "43401654C", 2, new Fecha(21, 1, 2014), 193.78, false);
            listaFacturas[1] = new Factura("José Felipe", "40529082T", 3, new Fecha(20, 1, 2014), 1321.56, true);
            listaFacturas[2] = new Factura("Juan Carlos", "43401654C", 7, new Fecha(21, 1, 2014), 656.78, false);
            listaFacturas[3] = new Factura("José Manuel", "43567898V", 9, new Fecha(10, 1, 2014), 456.56, true);
            listaFacturas[4] = new Factura("Juan Carlos", "43401654C", 12, new Fecha(21, 1, 2014), 23.78, false);
            listaFacturas[5] = new Factura("José Manuel", "43567898V", 6, new Fecha(12, 1, 2014), 192.56, true);
            listaFacturas[6] = new Factura("José Vicente", "40214134T", 11, new Fecha(14, 1, 2014), 131.56, true);
            listaFacturas[7] = new Factura("Juan Carlos", "43401654C", 20, new Fecha(18, 1, 2014), 1273.78, false);
            listaFacturas[8] = new Factura("José Manuel", "43567898V", 17, new Fecha(13, 1, 2014), 1888.56, true);
            indice=9;
        }
        
        else if (resp == '1') {
            // Demanem el nom del fitxer i llegim les dades
            listaFacturas = llegirVectorFactures();
        }

        // Bucle per afegir factures fins que l'usuario decideixi terminar
        while (siNo("Necessites afegir alguna factura")) {
            
            listaFacturas[indice] = new Factura();
            indice++;
        }
        
        // Just abans de sortir guardem totes les factures al fitxer indicat per l'usuari
        if (siNo("Vols guardar les modificacions en disc")) {
            gravarVectorFactures (listaFacturas,indice);
        }
    }
    
    
    
    // Guarda un vector de factures al fitxer indicat per l'usuari
    // Rep el vector i el nombre actual de factures
    public static void gravarVectorFactures (Factura [] vf, int numFactures) {
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
            // Escrivim el vector de factures al fitxer. Només les posicions plenes
            obo.writeObject(vf);
            for (int n=0;n<numFactures;n++) { // while (vf[n] != null)
                // Al mateix temps que l'escrivim mostrem les dades de cada factura
                System.out.println(vf[n]);
                // obo.writeObject(vf[n]);
            }
            obo.close();
            fo.close();
        } catch (IOException e) {
            System.out.println("Problemes d'E/S");
            System.out.println(e);
        }
    }
    
    // Recupera un vector de factures del fitxer indicat per l'usuari i el mostra
    // A partir d'aquí podem continuar treballant
    // Retorna el nombre de factures que ha llegit
    // Li passem el vector buit
    public static Factura [] llegirVectorFactures() {
        int n=0;
        Factura [] vf=null;
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Nom del fitxer a recuperar ? ");
            String nomFitxer = entrada.next();
            FileInputStream fi = new FileInputStream(nomFitxer);
            ObjectInputStream obi = new ObjectInputStream(fi);
            
            // Fem un bucle per llegir les dades del fitxer
            // Quan acabem amb les dades saltarà una excepció
            // No podem llegir més factures que les que puguem ficar al vector
            vf = (Factura []) obi.readObject();
            while (vf[n]!= null ) {
                 // vf[n] = (Factura) obi.readObject();
                 // Anem mostrant la factura llegida
                 System.out.println(vf[n]);
                 n++;
            }

            obi.close();
            fi.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fitxer no trobat");
        } catch (EOFException e) {
            System.out.println("S'han llegit "+n+" factures... ");
        } catch (IOException e) {
            System.out.println("Problemes d'E/S");
        } catch (ClassNotFoundException e) {
            System.out.println("Format incompatible");
        }
        // Retornem el nombre d'elements que hem llegit
        return vf;
    }
}

