package interfaces;

/**
 *
 * @author Danny Franco
 */
class Cotxe implements Comparable {

    private String nombre;
    private int precio;
    private int anio;

    public Cotxe(String nom, int pre, int an) {
        nombre = nom;
        precio = pre;
        anio = an;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getAnio() {
        return anio;
    }

    
    
    
    @Override
    public String toString() {
        return "Cotxe{" + "nombre=" + nombre + ", precio=" + precio + ", anio=" + anio + '}';
    }

    @Override
    public int compareTo(Object t) {
        Cotxe c2 = (Cotxe) t;
//        if (anio == c2.anio) {
//            return 0;
//        } else if (anio > c2.anio) {
//            return 1;
//        } else {
//            return -1;
//        }
    //    return anio - c2.anio; //ordenar por any
    //return double.compareTo( precio - c2.precio );
    return nombre.compareTo(c2.nombre);//ordenar por nombre
    }
    

}
