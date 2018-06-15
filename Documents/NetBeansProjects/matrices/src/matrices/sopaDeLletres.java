/*
105.Creeu una ‘sopa de lletres’ aleatòria de 10 files per 10 columnes. Mostreu la taula per
pantalla.
 */
package matrices;

public class sopaDeLletres {

    public static void main(String[] args) {
        char[][]matriz=generaMatriz();
        muestraMatriz(matriz);
        System.out.println("");
        System.out.println("");        
       char[][]matTransp=cambiaMatriz(matriz);
       System.out.println("");
        System.out.println("");         
       muestraMatriz(matTransp);
      
    }

    
    
    public static char[][] generaMatriz (){
        char[][] matriz = new char[5][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (char) (Math.random() * ('Z' - 'A') + 'A');               
            }            
        }
        return matriz;
    }
    
     public static void muestraMatriz (char [][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {             
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }
     }
     public static char [][]cambiaMatriz(char[][]matriz){
         char[][] matriz2= new char [matriz[0].length][matriz.length];
         for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j < matriz[i].length; j++) {
                 matriz2[j][i] = matriz[i][j];
                 System.out.print(matriz2[j][i] + "  ");
             }  
             System.out.println("");       
         }
         
         return matriz2;
     }
}
