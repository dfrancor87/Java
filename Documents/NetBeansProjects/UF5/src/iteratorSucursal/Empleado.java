package iteratorSucursal;

/**
 *
 * @author Danny Franco
 */
public class Empleado {
    private String nombre;
    private String sucursal;
    
    public Empleado(String nom, String suc){
        nombre=nom;
        sucursal=suc;      
    }
    public String getNombre(){
        return nombre;
    }
    public void print(){
        System.out.println("Nombre: "+nombre+" "+"Sucursal: "+sucursal);
    }
}
