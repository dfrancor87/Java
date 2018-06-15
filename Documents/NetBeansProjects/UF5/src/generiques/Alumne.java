package generiques;

import java.util.Objects;

/**
 *
 * @author Danny Franco
 */
public class Alumne implements Comparable<Alumne> {

    private String apellido;
    private int curs;

    public Alumne(String a, int c) {

        apellido = a;
        curs = c;
    }

    public String getApellid() {
        return apellido;
    }

    public int getCurs() {
        return curs;
    }

    @Override
    public int compareTo(Alumne t) {
        // Alumne aux =(Alumne)t;
        return apellido.compareTo(t.apellido);
    }
    
    //ordenar por curso

    @Override
    public String toString() {
        return "apellido=" + apellido + ", curs=" + curs + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
        Alumne aux = (Alumne) obj;
        return apellido.equals(aux.apellido) && curs == aux.curs;
    }

}
