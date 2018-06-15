package objetoJugador;


import java.util.Scanner;

/**
 * Equip de futbol
 * @author carlos
 */
public class Equip {
    
    // Atributs privats
    private String nom;
    private int numJugadors;
    private Jugador [] jugadors;
    int maxJugadors;

    // Constructor
    public Equip() {
        System.out.print("Quin és el nom de l'equip ? ");
        Scanner input = new Scanner(System.in);
        nom = input.nextLine();
        System.out.print("Quants jugadors tindrà com a màxim ? ");
        maxJugadors=input.nextInt();
        // Nombre de jugadors actuals de l'equip:
        numJugadors = 0;
        // Ara creem el vector de jugadors
        jugadors = new Jugador[maxJugadors];
        System.out.println("\n\n");
    }

    
    // Mostra les dades de l'equip de futbol
    @Override
    public String toString ()
    {
        String dades="Dades de l'equip:\n"+"=================\n\n";
        dades += "Nom de l'equip: "+nom+"\n"+"Nombre actual de jugadors: "+numJugadors+"\n";
        if (numJugadors > 0)
        {
            dades += "Dades dels jugadors:\n====================\n";
            for (int n=0;n<numJugadors;n++)
                dades += jugadors[n].toString();
                // es igual que fer: dades += jugadors[n];
        }
        return dades;
    }


    // Funció per afegir un jugador a l'equip
    public void afegirJugador ()
    {
        if (numJugadors < maxJugadors)
        {
            jugadors[numJugadors] = new Jugador();
            numJugadors++;
        }
        else
            System.out.println("No hi ha diners per a més fitxatges ...");

    }

    // Cerca un jugador pel nom i retorna una variable de tipus jugador
    public Jugador cercaNom (String nom)
    {
        for (int i=0;i<numJugadors;i++)
            if (nom.equalsIgnoreCase(jugadors[i].nom))
                return jugadors[i];
        // Si no hem trobat el jugador amb aquest nom retornem null
        return null;
    }

}
