package objetoJugador;

import java.util.Scanner;

/**
 * Classe per provar l'equip de Futbol.
 * @author carlos
 */
public class ProvaEquip {

    // Dibuixa un menú
    public static int Menu() {
        int opcio = 0;
        System.out.println("Programa per gestionar un equip de futbol.");
        System.out.println("==========================================");
        System.out.println("Escoll una opció del menú: ");
        // L'equip només es pot crear una vegada
        System.out.println("1 - Mostrar informació de l'equip");
        System.out.println("2 - Afegir jugador");
        System.out.println("3 - Cedir jugador");
        System.out.println("4 - Sancionar jugador");
        System.out.println("5 - Sortir");

        // No ens deixa sortir fins que no sigui tot correcte
        // Així no ens preocuparem a la resta del programa
        do {
            try {
                System.out.print("Opció : ");
                Scanner input = new Scanner(System.in);
                opcio = input.nextInt();
            } catch (Exception e) {
                System.out.println("S'esperava un paràmetre numèric ...");
            }
            if (opcio < 1 || opcio > 5) {
                System.out.println("Cal triar una opció entre 1 i 5 !");
            }
        } while  (opcio < 1 || opcio > 5);
        return opcio;
    }

    public static void main(String[] args) {
        int opt;
        System.out.println("Programa per a la gestió d'un equip de futbol");
        System.out.println("=============================================");
        Equip elMeuEquip = new Equip();
        Scanner in = new Scanner(System.in);
        do {
            // Mostrem el menú
            opt = Menu();
            switch (opt) {
                case 1: // Mostrem les dades de l'equip
                    System.out.println(elMeuEquip);
                    break;
                case 2: // Afegim un jugador
                    System.out.println("Afegint jugador ...");
                    elMeuEquip.afegirJugador();
                    break;
                case 3: // Cedir un jugador
                    System.out.println("Cedint jugador ...");
                    System.out.println("Quin jugador vols cedir ? :");
                    String nom;
                    System.out.print("Nom del jugador: ");
                    nom = in.nextLine();
                    Jugador cedit = elMeuEquip.cercaNom(nom);
                    if (cedit == null) {
                        System.out.println("No s'ha trobat el jugador: " + nom);
                    } else {
                        cedit.cedirJugador();
                    }
                    break;
                case 4: // Sancionar jugador
                    System.out.println("Sancionant jugador ...");
                    System.out.println("Quin jugador vols sancionar ? :");
                    System.out.print("Nom del jugador: ");
                    nom = in.nextLine();
                    Jugador sancionat = elMeuEquip.cercaNom(nom);
                    if (sancionat == null) {
                        System.out.println("No s'ha trobat el jugador: " + nom);
                    } else {
                        sancionat.sancionarJugador();
                    }
                case 5: // Sortir
                    System.out.println("Sortint de l'aplicació ...");
            }
        } while (opt != 5);
    }
}
