
package objetos;

public class factura {
    private String nomCliente;
    private String nifCliente;
    private int    numFactura;
    private fecha fechaFactura; //llamo a la clase FECHA    importe;
    private double importe;
    private boolean cobrada;
    
    //generar getter getter

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public String getNifCliente() {
        return nifCliente;
    }

    public void setNifCliente(String nifCliente) {
        this.nifCliente = nifCliente;
    }

    public int getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }

    public fecha getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(fecha fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public boolean isCobrada() {
        return cobrada;
    }

    public void setCobrada(boolean cobrada) {
        this.cobrada = cobrada;
    }
    
    
    //constructo
    public factura(String nomCliente, String nifCliente, int numFactura, fecha fechaFactura, double importe, boolean cobrada) {
        this.nomCliente = nomCliente;
        this.nifCliente = nifCliente;
        this.numFactura = numFactura;
        this.fechaFactura = fechaFactura;
        this.importe = importe;
        this.cobrada = cobrada;
    }
    //toString
    @Override
    public String toString() {
        return "Nombre: " + nomCliente + ", NIF: " + nifCliente + ", Numero Factura: " + numFactura + ", Fecha: " + fechaFactura + ", Importe: " + importe + ", Cobrada: " + cobrada ;
       
    }
    
}

