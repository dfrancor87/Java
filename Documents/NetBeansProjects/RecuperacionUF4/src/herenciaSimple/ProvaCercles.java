/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaSimple;

/**
 *
 * @author Danny Franco
 */
public class ProvaCercles {

    public static void main(String[] args) {
        Cercle arrays[] = new Cercle[5];

        arrays[0] = new Cercle(50);

        arrays[1] = new Cercle(100);
        arrays[2] = new Cercle(25);
        arrays[3] = new Cilindre(100, 50);
        arrays[4] = new Cilindre(150, 100);
        
        for(Cercle c: arrays){
            System.out.println(c.calcularArea());
            
        }

    }

}
