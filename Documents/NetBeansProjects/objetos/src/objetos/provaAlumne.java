/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author Danfer
 */
public class provaAlumne {

    public static void main(String[] args) {
        alumne luis = new alumne("Juan Carlos", 12, "ESO1-A");
        System.out.println(luis);
        alumne pedro = new alumne("Jose Pedro", 13, "ESO1B");
        System.out.println(pedro);
        //vector alumnos //NOMBRE DE LA CLASE Y DESPUES EL NOMNBRE DEL VECTOR
        alumne [] clase =new alumne[20];
        clase[0]=new alumne("Juan Carlos", 12, "ESO1-A");
        clase[1]= new alumne("Jose Pedro", 13, "ESO1B");
        clase[2]=luis;
        clase[3]=pedro;
        //MOSTAR EL VECTOR
        System.out.println("--------------------------------");
        pedro.setEdad(30);
        //MOSTRAR SOLO LAS POSICIONES QUE ESTEN OCUPADAD
        // != NULL
        
        for (int i = 0; i < clase.length && clase[i] != null ; i++) {
            System.out.println("Alumne "+(i+1)+ ": "+clase[i]);
            
            
        }
        System.out.println("El grupo de Pedro es:"+pedro.getGrup());
        
         
        
    }
}
