/*
114.Donada una taula 3 x 3 de caràcters comptar quantes vocals hi ha.
 */
package matrices;

/**
 *
 * @author Danfer
 */
public class ejercicio113 {

    public static void main(String[] args) {
        char[][] matriz = new char[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (char) (Math.random() * ('f' - 'a') + 'a');
                System.out.print(matriz[i][j] + "  ");

            }
            System.out.println("");
        }
          int total=0, cont=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 'a' ||matriz[i][j] == 'e') {
                    cont++;
                    
                }  
           total=cont;
            } 
            

        }
        System.out.println("hay "+total);
      
        
        
    }

}
