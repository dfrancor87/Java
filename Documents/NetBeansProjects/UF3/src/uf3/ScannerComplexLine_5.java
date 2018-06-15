package uf3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Exemple de lectura de fitxers complexos amb Scanner.
 * El fitxer numeros.txt ha de contenir un conjunt de noms i edats:
 * Joan	    37
 * Nuria	22
 * Felip	14
 * Andreu	46
 * Anna	    12
 * Hem controlat també que el fitxer pugui contenir valors erronis.
 * Excepció: InputMismatchException
 * @author carlos
 */
public class ScannerComplexLine_5 {

    public static void main(String[] args) {
        // Fitxer a llegir, trajectòria absoluta o relativa...
        // File file = new File("G:\\Informatica\\Curs-2013-2014\\M03\\UF3\\NetBeansProjects\\classeScanner\\data.txt");
        File file = new File("D:\\prog\\nomedat.txt");
        try {
            Scanner sc = new Scanner(file);
            // Mentre quedin coses per llegir dins del fitxer
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                // Tractem la línia. Té un nom i després una edat
                Scanner entrada = new Scanner(line);
                String nom=entrada.next();
                int edat = entrada.nextInt();
                // Mostrem el nom i després l'edat
                System.out.println("Nom: "+nom+", edat: "+edat);
            }
            // Tanquem el flux de dades
            sc.close();

        } catch (FileNotFoundException ex) {
            System.out.println("No s'ha pogut trobar el fitxer: data.txt");
            System.out.println(ex);
        } catch (InputMismatchException ex) {
			System.out.println("Format incorrecte d'arxiu");
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println("Excepció inesperada");
			System.out.println(ex);
		}
    }
}

