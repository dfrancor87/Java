
package objetos;

public class fecha {
    //atributos de fecha
    private int dia;
    private int mes;
    private int any;
    
    //Constructor
    public fecha(int dia, int mes, int any) {
        this.dia = dia;
        this.mes = mes;
        this.any = any;
    }
    
    //to string

    @Override
    public String toString() {
        //return "fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + any + '}';
       //modificamos el toString para que muestre bien la
        return "Naciste el día "+ dia+"/"+mes+"/"+any; //mostrara 13/7/1987
    }
    
    
}
