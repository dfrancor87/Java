/*
Inicializar vector de facturas.
Buscar facturas sin cobrar calcular y mostrar su importe
mostrar la factura de mayor importe 
 */
package objetos;

public class pruebaFactura {
    public static void main(String[] args) {
      factura [] vectorFacturas = new factura[3];
      //llenar vector facturas con parametros
      vectorFacturas[0]= new factura("Juan Carlos", "12345689P", 2, new fecha (21,1,2014), 193.78, false);
      vectorFacturas[1]= new factura("Danny Franco", "49785896P",2, new fecha (21,12,2014), 200.06, true);
      
      
        for (int i = 0; i < vectorFacturas.length && vectorFacturas[i]!=null; i++) {
            System.out.println(vectorFacturas[i]);
        }
        
    }
    
}
