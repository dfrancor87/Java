package objetoJugador;


import java.util.Scanner;

/**
 * Jugador d'un equip de futbol
 * @author carlos
 */
public class Jugador {

    // Dades del jugador
    String nom;
    int edat;
    boolean sancionat;
    boolean cedit;
    int numero;

    // Constructor de Jugador
    public Jugador ()
    {
        // Aquí inicialitzem els atributs del jugador preguntant-li a l'usuari
        // Podríem fer un try catch per evitar errors d'execució...
        Scanner in = new Scanner(System.in);
        System.out.print("Nom del jugador: ");
        nom = in.nextLine();
        System.out.print("Edat del jugador: ");
        edat = in.nextInt();
        System.out.print("Número del jugador: ");
        numero = in.nextInt();
        // Per defecte inicialitzem les variables sancionat i cedit
        sancionat=false;
        cedit=false;
    }

    // Per mostrar les dades d'un jugador
    // System.out.println (Jugador);
    @Override
    public String toString ()
    {
        String cad="Nom: "+nom+"\n"+"Edat: "+edat+"\n"+"Número: "+numero+"\n";
        if (sancionat)
            cad +="Està sancionat, no pot jugar\n";  
        else
            cad +="No està sancionat, pot jugar\n";
        if (cedit)
            cad +="Està cedit\n";
        else
            cad +="No està cedit\n";
        return cad;
    }

    // Marca a true la variable de cedir el jugador
    public void cedirJugador ()
    {
        if (cedit)
            System.out.println("El jugador ja està cedit...");
        else
            cedit=true;
        System.out.println("\n");
    }

    // Marca a true la variable de sancionar el jugador
    public void sancionarJugador ()
    {
        if (sancionat)
            System.out.println("El jugador ja està sancionat...");
        else
            sancionat=true;
        System.out.println("\n");
    }
}
