/*
 * Troba l'edat màxima i mínima que s'ha trobat a un fitxer amb el format:
 * 1, Anna, 30
 * 2, Albert, 52
 * 3, Lluis, 45
 * 4, Laura, 21
 */
 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Joan Carles
 */
public class LecturaTextoScannerEdades_4 {

    public static void main(String[] args) {
        File f = new File("D:\\exemple.txt");
        int edat,edatMin=200,edatMax=-10;
        String nom,nomMin="",nomMax="";
        Scanner s;
        boolean primeraLinia=true;
        try {
            s = new Scanner(f);
            while (s.hasNextLine()) {
                String linea = s.nextLine();
                Scanner sl = new Scanner(linea);
                sl.useDelimiter("\\s*,\\s*");
                System.out.print(sl.next() + " - ");
                nom=sl.next();
                System.out.print(" Nom: " + nom + ",");
                edat = sl.nextInt();
                System.out.println(" Edat: " + edat);
                
                if (primeraLinia) {
                    edatMax=edatMin=edat;
                    nomMax=nomMin=nom;
                    primeraLinia=false;
				}
                else if (edat > edatMax) {
                    edatMax=edat;
                    nomMax=nom;
                }
                else if (edat < edatMin) {
                    edatMin=edat;
                    nomMin=nom;
                }
            }
            s.close();
            System.out.println("La edat mínima és: "+edatMin+" i correspon a: "+nomMin);
			System.out.println("La edat màxima és: "+edatMax+" i correspon a: "+nomMax);
        } catch (FileNotFoundException e) {
            System.out.println("S'ha trobat l'error següent: " + e.toString());
        } catch (InputMismatchException e) {
            System.out.println("Errors en el fitxer.");
        }
    }

}
