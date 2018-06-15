package ejemploAlumno;

/**
 *
 * @author Danny Franco
 */
public class ProvaAlumne {
    public static void main(String[] args) {
        
        Alumno[] array = new Alumno[5];
        
        array[0] = new Alumno("Fernanda", 5, 8.5);
        array[1] = new Alumno("Ana", 5, 5.9);
        array[2] = new Alumno("Paola", 2, 6.5);
        array[3] = new Alumno("Mercedes", 2, 7);
        array[4] = new Alumno("Carla", 1, 9.1);
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            
        }
        
        
    }
    
}
