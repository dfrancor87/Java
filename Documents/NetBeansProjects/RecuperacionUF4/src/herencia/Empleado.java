package herencia;


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
        this.id = countId;
        this.nombre = nom;
        this.sueldo = sue;
        // usamos la clase GregorianCalendar para definir la fecha
        // m-1 xq los meses empiezan desde 0
        GregorianCalendar calendario = new GregorianCalendar(a, m - 1, d);
        // getTime para obtener la fecha
        this.altaContrato = calendario.getTime();
        
        countId++;
        
    }
    // este constructor llama al de arriba, ya que coincide 
    // con el numero de parametros    
    public Empleado (String nom){
        this(nom, 3000, 2000, 01,01);
    }
    

    public String dameNombre() {
        return nombre +" Id: "+ id;
    }

    public double dameSueldo() {
        return sueldo;
    }

    public Date dameAltaContrato() {
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
