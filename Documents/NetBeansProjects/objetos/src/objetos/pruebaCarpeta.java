/*
156.Per una classe ProvaCarpeta que generarà un vector de carpetes i indicarà quina és
la carpeta del vector que conté més arxius.
També indicarà:
Quantes carpetes d'imatges tenim ?
Quants vídeos hi ha en total en totes les carpetes de vídeos ?
De quin tipus de contingut de tots quatre tenim més carpetes ?
De quin tipus de contingut de tots quatre tenim més fiters ?
 */
package objetos;

public class pruebaCarpeta {

    public static void main(String[] args) {
        carpeta[] vectorCarpeta = new carpeta[6];

        vectorCarpeta[0] = new carpeta("Ejercicios", "video", 5);
        vectorCarpeta[1] = new carpeta("Arjona", "video", 20);
        vectorCarpeta[2] = new carpeta("noticias", "imagenes", 10);
        vectorCarpeta[3] = new carpeta("pedroche", "imagenes", 100);
        vectorCarpeta[4] = new carpeta("Patricia", "imagenes", 10);
        vectorCarpeta[5] = new carpeta("pelis", "imagenes", 3);
        //Quantes carpetes d'imatges tenim ?
        int contImagenes = 0;
        for (int i = 0; i < vectorCarpeta.length; i++) {
            if (vectorCarpeta[i].getTipo() == "imagenes") {
                contImagenes++;
            }

        }
        System.out.println("Tenemos " + contImagenes + " Carpetas de imagenes");
        //Quants vídeos hi ha en total en totes les carpetes de vídeos ?7
        int contVideos = 0;
        for (int i = 0; i < vectorCarpeta.length; i++) {
            if (vectorCarpeta[i].getTipo() == "video") {
                contVideos = contVideos + vectorCarpeta[i].getNumArchivos();
            }
        }
        System.out.println("Tenemos " + contVideos + " videos en todas las carpetas");
        //De quin tipus de contingut de tots quatre tenim més carpetes ?
        int contadorTipo, elquemasrepite = 0;
        String tipo;
        for (int i = 0; i < vectorCarpeta.length - 1; i++) {
            contadorTipo = 1;
            for (int j = i + 1; j < vectorCarpeta.length; j++) {
                if (vectorCarpeta[j].getTipo() == vectorCarpeta[i].getTipo()) {
                    contadorTipo++;
                }
            }
            if (contadorTipo > elquemasrepite) {
                elquemasrepite = contadorTipo;
                tipo = vectorCarpeta[i ].getTipo();
                System.out.println("hay " + elquemasrepite + " carpetas de "+tipo );
            }

        }
        
        //De quin tipus de contingut de tots quatre tenim més fiters ?
        
    }
}
