package ejemploAlumno;

/**
 *
 * @author Danny Franco
 */
public class Alumno {
    
    private String nombre;
    private int curso;
    private double notaMedia;
    
    
    public Alumno(String no, int cu, double not){
        nombre = no;
        curso = cu;
        notaMedia = not;
    }

    
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", curso=" + curso + ", notaMedia=" + notaMedia + '}';
    }
    
    
}
