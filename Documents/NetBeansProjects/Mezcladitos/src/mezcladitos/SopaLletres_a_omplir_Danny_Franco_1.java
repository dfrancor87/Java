package mezcladitos;

/**
 * Què fa el programa...
 *
 * @version 0.1
 * @author Danfer
 */
import java.util.*;

public class SopaLletres_a_omplir_Danny_Franco_1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        do {
            mostrarInstruccions();
            int dimensio = demanarDimensio();
            int puntuacio = 0;
            boolean continuar = true;
            char[][] tauler = generarSopaLletres(dimensio);
            mostrarSopaLletres(tauler);
            do {
                String paraula = demanarParaula();
                puntuacio += comprovar(tauler, paraula);
                mostrarSopaLletres(tauler);
                continuar = preguntarContinuar();
            } while (calcularLletresQueQueden(tauler) > 1 && continuar);
            mostrarPuntuacio(puntuacio);
        } while (tornarAJugar());
        mostrarCredits();
    }

    /**
     * Genera aleatoriament un tauler de dimensio x dimensio lletres. Hi ha
     * d'haver més vocals que consonants.
     *
     * @param dimensio num de files i columnes del tauler
     * @return el tauler ple de lletres
     */
    public static char[][] generarSopaLletres(int dimensio) {
        //CREA LA SOPA DE LETRAS
        //FALTA AGREGAR EL DOBLE DE VOCALES QUE CONSONANTES
        char[][] tauler = new char[dimensio][dimensio];
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[i].length; j++) {
                tauler[i][j] = (char) (Math.random() * ('Z' - 'A') + 'A');
            }
            // System.out.println("");
        }
        return tauler;
    }

    /**
     * Mostra per pantalla el tauler en forma de taula.
     *
     * @param tauler el tauler a mostrar
     */
    public static void mostrarSopaLletres(char[][] tauler) {
        //SOLO MUESTRA LA MATRIZ DE LA SOPA DE LETRA
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[i].length; j++) {
                System.out.print(tauler[i][j] + "  ");
            }
            System.out.println("");
        }

    }

    /**
     * Demana un paraula a buscar dins el tauler
     *
     * @return la paraula
     */
    public static String demanarParaula() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduce una palabra que este en el tablero");
        String palabra = entrada.next();
        return palabra;
    }

    /**
     * Es calcula restant al total les substituïdes per '.'
     *
     * @param tauler el tauler del joc
     * @return num enter de lletres que queden disponibles per jugar
     */
    public static int calcularLletresQueQueden(char[][] tauler) {
        int quedan = 0;
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[i].length; j++) {
                if (tauler[i][j] != '.') {
                    quedan++;
                }
            }
        }       
        return quedan;
    }

    /**
     * Fórmula = longitud de la paraula multiplicat per (la quantitat total de
     * lletres del tauler - les que queden)
     *
     * @param par la paraula introduïda pel jugador
     * @param queden el num de lletres que queden disponibles
     * @param dimensio la dimensió del tauler
     * @return un enter que és la puntuació segons la fórmula
     */
    public static int calcularPuntuacio(String paraula, int queden, int dimensio) {
        int puntuacion=0;
        puntuacion = paraula.length() * dimensio - queden ;
        return puntuacion;        
    }

    /**
     * Substitueix dins el tauler, les lletres de la paraula per '.' Només en el
     * cas que la paraula sencera es trobi al tauler. Si la paraula no es troba,
     * retornarà un 0
     *
     * @param tauler rep la sopa de lletres, el tauler de joc
     * @param paraula la paraula a buscar
     * @return un enter que és la puntuació de la paraula, 0 si no es troba
     */
   public static int comprovar(char[][] tauler, String paraula) {
        int iPalabra = 0;// indice de palabra
        boolean trobat = true; // si encuentra una letra de la palabra
        //copiar el tablero
      //  char[][] copiTauler = tauler;
        //busca la palabra si esta en el tablero
        while (trobat && iPalabra < paraula.length()) {
            char letra = paraula.charAt(iPalabra);
            trobat = buscaLetra(letra, tauler);
            iPalabra++;
        }
        return 10;//PUNTUACION POR PALABRA INGRESADA
    }

    //ESTA  FUNCION  COMPRUEBA SI ESTA LA LETRA
    public static boolean buscaLetra(char letra, char[][] tauler) {
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[i].length; j++) {
                //buscar letras de la palabra       
                //funcion buscar letra en tablero
                if (tauler[i][j] == letra) {
                    tauler[i][j] = '.';
                    return true;
                }
            }
        }
        return false;
    }
    /**
     * Pregunta a l'usuari si vol seguir introduint paraules o acabar
     *
     * @return true si vol continuar, false altrament
     */
    public static boolean preguntarContinuar() {
        Scanner entrada = new Scanner(System.in);
        String respuesta;
        //filtro para escribir bien la respuesta
        do {
            System.out.println("Quieres seguir jugando (SI/NO)");
            respuesta = entrada.next().toUpperCase();
        } while (!respuesta.equals("SI") && !respuesta.equals("NO"));
        if (respuesta.equals("SI")) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * Mostra la puntuació
     *
     * @param p la puntuació del joc
     */
    public static void mostrarPuntuacio(int p) {
        System.out.println("La puntuacion es de: " + p);

    }

    public static int demanarDimensio() {
        Scanner entrada = new Scanner(System.in);

        int dimension;
        do {
            System.out.println("De que dimension será el tablero(min 3 max 20");
            dimension = entrada.nextInt();
        } while (dimension < 3 || dimension > 20);
        return dimension;
    }

    /**
     * Acomiadar-se del programa i mostrar informació
     */
    public static void mostrarCredits() {
        System.out.println("Adios y gracias por jugar");
    }

    /**
     * Explica breument com es juga
     *
     */
    public static void mostrarInstruccions() {
        System.out.println("Se trata de buscar palabras en la sopa de letras");
        System.out.println("por cada palabara encontrada se ganan 10 puntos");
        System.out.println("y por cada palabra no encontrada se resta la mitad de la puntuacion");
        System.out.println("\n\n");
    }

    /**
     * Es pregunta a l'usuari si vol tornar a jugar o no.
     *
     * @return true si vol tornar a jugar, false altrament
     */
    public static boolean tornarAJugar() {
        Scanner entrada = new Scanner(System.in);
        String respuesta;
        //filtro para escribir bien la respuesta
        do {
            System.out.println("Quieres jugar otra vez (SI/NO)");
            respuesta = entrada.next().toUpperCase();
        } while (!respuesta.equals("SI") && !respuesta.equals("NO"));
        if (respuesta.equals("SI")) {
            return true;
        } else {
            return false;
        }

    }
}
