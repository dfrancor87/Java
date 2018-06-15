package vectores;

public class rotarVector {

    public static void main(String[] args) {
        String[] vector1 = {"1", "2", "3","4"};
        String[] vector2 = {"5", "6","7","8"};
        //primer partido
        for (int i = 0; i < vector1.length; i++) {//primer vector
            System.out.print(vector1[i] + "-" + vector2[i] + "\n");
        }
        int partidos = 1;
        while (partidos < 7) {
            //rotar vector
            String ultmoEquipoV1, primerEquipoV2;
            ultmoEquipoV1 = vector1[vector1.length - 1];
            primerEquipoV2 = vector2[0];

            //rotar vector1
            for (int i = vector1.length - 1; i > 1; i--) {
                vector1[i] = vector1[i - 1];
            }
            vector1[1] = primerEquipoV2;

           //rotar vector2 
            for (int i = 0; i < vector2.length - 1; i++) {
                vector2[i] = vector2[i + 1];
            }
            vector2[vector2.length - 1] = ultmoEquipoV1;
       
            
            System.out.println("partido" +(partidos+1));
            for (int i = 0; i < vector1.length; i++) {//primer vector
                System.out.print(vector1[i] + "-" +vector2[i]+"\n");
             
            }
            System.out.println("\n\n");
            partidos++;
        }
    }

}
