package iteratorSucursal;

/**
 *
 * @author Danny Franco
 */
public class Sucursal {
    private Empleado[] empleados = new Empleado[100];
    private int numero= 0;
    private String nombreSucursal;
    
    //constructor
    public Sucursal(String n){
        nombreSucursal = n;
    }
    
    public String getNombreSucursal(){
        return nombreSucursal;
    }
    
    public void add(String nombre){
        Empleado e = new Empleado(nombre, nombreSucursal);
        empleados[numero++] =e;
    }
    
    public SucursalIterator iterator(){
        return new SucursalIterator(empleados);
    }
}