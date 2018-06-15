package objetosFactura;


import java.util.Scanner;
import java.io.Serializable;

/**
 * Classe para guardar la data
 * @author prof
 */
public class Fecha implements Serializable {
    
    // Atributos internos de la clase
    private int dia;
    private int mes;
    private int anio;
    
    // Constructores
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    // Nos pregunta los datos
    public Fecha() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Fecha de la factura:");
        System.out.print("Dime el año: ");
        anio = entrada.nextInt();
        System.out.print("Dime el més: ");
        mes = entrada.nextInt();
        System.out.print("Dime el dia: ");
        dia = entrada.nextInt();
    }
    
    @Override
    public String toString() {
        // return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", año=" + anio + '}';
        return "Fecha: " + dia + "/" + mes + "/" + anio;
    }
}
