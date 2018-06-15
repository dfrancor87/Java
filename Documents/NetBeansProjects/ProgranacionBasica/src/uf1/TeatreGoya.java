package uf1;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class TeatreGoya {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad;
        double precio;
        System.out.println("TEATRO GOYA");
        System.out.println("Cuántos años tienes");
        edad = entrada.nextInt();
        if (edad < 0) {
            System.out.println("Error de edad");
        } else if (edad >= 65) {
            System.out.println("Eres del club TR3SC(si/no)");
            String siNo = entrada.next().toLowerCase();
            if (siNo.equals("si")) {
                precio = 22.40 + 2.00;
                System.out.println("El precio es de: " + precio);
            } else {
                precio = 23.80 + 2.00;
                System.out.println("El total seria:  " + (precio));
            }
        } else if (edad > 16 && edad < 30) {
            precio = 19.60 + 2.00;
            

            System.out.println("El total seria: " + precio);
        } else if (edad >= 12 && edad <= 16) {
            precio = 16.00 + 2.00;
            System.out.println("El total seria:" + precio);
        } else if (edad > 0 && edad < 12) {
            precio = 12.00 + 2.00;
            System.out.println("El total seria: " + precio);
        } else if (edad >= 31 && edad <= 65) {
            System.out.println("Eres del club TR3SC(si/no)");
            String siNo = entrada.next().toLowerCase();
            if (siNo.equals("si")) {
                precio = 22.40 + 2.00;
                System.out.println("El precio es de: " + precio);
            } else {
                System.out.println("Tienes carnet biblioteca? (si/no) ");
                siNo = entrada.next().toLowerCase();
                if (siNo.equals("si")) {
                    precio = 23.80 + 2.00;
                    System.out.println("El precio es de: " + precio);
                } else {
                    precio = 28.00 + 2.00;
                    System.out.println("el precio es de " + precio);
                }
            }

        } else if (edad == 30) {
            System.out.println("Tienes carnet jove? (si/no)");
            String siNo = entrada.next().toLowerCase();
            if (siNo.equals("si")) {
                precio = 21.00 + 2.00;
                System.out.println("EL total seria:  " + precio);
            } else {
                System.out.println("Tienes carnet de biblioteca?   ");
                siNo = entrada.next().toLowerCase();
                if (siNo.equals("si")) {
                    precio = 23.80 + 2.00;
                    System.out.println("El total es:" + precio);
                } else {
                    precio = 28.00 + 2.00;
                    System.out.println("EL total es: " + precio);
                }

            }

        }

    }
}
