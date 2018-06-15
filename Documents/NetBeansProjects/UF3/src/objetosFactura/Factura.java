package objetosFactura;


import java.util.Scanner;
import java.io.Serializable;

/**
 * Clase Factura
 * @author prof
 */
public class Factura implements Serializable {

    private String nomCliente;
    private String nifCliente;
    private int numFactura;
    private Fecha fechaFactura;
    private double importe;
    private boolean cobrada;
    
    // Constructor amb paràmetres
    public Factura (String nomCliente, String nifCliente, int numFactura, Fecha fechaFactura, double importe, boolean cobrado) {
        this.nomCliente = nomCliente;
        this.nifCliente = nifCliente;
        this.numFactura = numFactura;
        this.fechaFactura = fechaFactura;
        this.importe = importe;
        this.cobrada = cobrado;
    }
    
    // Constructor sense paràmetres
    public Factura ()
    {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Nombre del cliente: ");
        nomCliente = entrada.nextLine();
        System.out.print("NIF del cliente: ");
        nifCliente = entrada.nextLine();  
        System.out.print("¿ Está cobrada la factura ? [S/N]: ");
        char resp = entrada.nextLine().charAt(0);
        if (resp == 'S' || resp == 's')
            cobrada = true;
        else
            cobrada = false;
        System.out.print("Número de la factura: ");
        numFactura = entrada.nextInt();
        System.out.print("Importe de la factura: ");
        importe = entrada.nextDouble();
        fechaFactura = new Fecha();
    }
    
    
    @Override
    public String toString() {
        String retorno = "Nombre del Cliente: " + nomCliente + ", NIF: " + nifCliente
                + ", Número: " + numFactura + ", Import: " + importe + ", Cobrada : ";
        // Indiquem si la factura està cobrada
        if (cobrada) { // equivale a cobrada == true
            return retorno + "Si , " + fechaFactura + '\n';
        } else {
            return retorno + "No , " + fechaFactura + '\n';
        }
    }
}
