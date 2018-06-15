package navegador;

import java.util.Scanner;

/**
 *
 * @author Danny Franco
 */
public class PracticaNavegador {

    public static void main(String[] args) {

        Navegador chrome = new Navegador();

        Scanner entrada = new Scanner(System.in);
        String url;
        int opcion;
        do {
            System.out.println("1 Anar a");
            System.out.println("2 Anar enrere");
            System.out.println("3 Anar endavant");
            System.out.println("4 Afegir a adreces d'interès");
            System.out.println("5 Eliminar de les adreces d'interès");
            System.out.println("6 Mostrar adreces d'interès");
            System.out.println("7 Mostrar l'historial");
            System.out.println("8 Mostrar visites per pàgina");
            System.out.print("Eige una opcion: \n");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Anar a: ");
                    Scanner in = new Scanner(System.in);
                    
                    url = in.nextLine();
                    chrome.historial(url);
                    break;

                case 2:
                    System.out.println("Anar enrere");
                    chrome.atras();
                    break;

                case 3:
                    System.out.println("Anar endavant");
                    chrome.adelante();
                    break;

                case 4:
                    System.out.println("Afegir a adreces d'interès");
                 //   url = chrome.urlActual();
                    System.out.println("url: ");
                    String urlFavo = entrada.next();
                    System.out.println("Nombre de favorito:");
                    String nombreFavorito = entrada.next();
//                    System.out.println("la url es: "+url);
//                    System.out.println("el nombre es: "+nombreFavorito);                    
                    chrome.favoritos(urlFavo, nombreFavorito);
                    break;

                case 5:
                    System.out.println("Eliminar de les adreces d'interès");
                    System.out.println("URL a eliminar: ");
                    String urlEliminar = entrada.next();
                    chrome.elminar(urlEliminar);
                    break;

                case 6:
                    System.out.println("Mostrar adreces d'interès");
                    chrome.muestraFavoritos();
                    break;

                case 7:
                    System.out.println("Mostrar l'historial");
                    chrome.muestraHistorial();
                    break;
                case 8:
                    System.out.println("Mostrar visites per pàgina");
                    break;
            }
        } while (opcion != 0);
    }
}
