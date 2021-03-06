package metodosYatributosStatitcos;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Danny Franco
 */
public  class Empleado {

    public static int countId = 1;
    
    private  int id ;
    private String nombre;
    private double sueldo;
    private Date altaContrato;
    

    public Empleado(String nom, double sue, int a, int m, int d) {
        this.id = obtenerId();
        this.nombre = nom;
        this.sueldo = sue;
        // usamos la clase GregorianCalendar para definir la fecha
        // m-1 xq los meses empiezan desde 0
        GregorianCalendar calendario = new GregorianCalendar(a, m - 1, d);
        // getTime para obtener la fecha
        this.altaContrato = calendario.getTime();
        
        countId++;

    }
     public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Date getAltaContrato() {
        return altaContrato;
    }

    // metodo para subir el sueldo
    public void subirSueldo(double porcentaje) {
        double aumento = this.sueldo * porcentaje / 100;
        this.sueldo += aumento;
    }

   //metodo estatico
    public static int obtenerId(){
        return countId;
    }
    
    

}
