/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraordinariaUF4;

/**
 *
 * @author Danny Franco
 */
public class Smartphone extends DispositivoMovil {

    private String sistemaOperativo;
    private boolean acelerometro;
    private boolean gps;
    private double preuFinal;

    public Smartphone(String sistemaOperativo, boolean acelerometro, boolean gps, String marca, String model, Double preubase) {
        super(marca, model, preubase);
        this.sistemaOperativo = sistemaOperativo;
        this.acelerometro = acelerometro;
        this.gps = gps;
        preuFinal = calculaPreuFinal(acelerometro, gps);
    }

    public Smartphone() {
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public boolean isAcelerometro() {
        return acelerometro;
    }

    public void setAcelerometro(boolean acelerometro) {
        this.acelerometro = acelerometro;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public double getPreuFinal() {
        return preuFinal;
    }

    public void setPreuFinal(double preuFinal) {
        this.preuFinal = preuFinal;
    }


    

    public double calculaPreuFinal(boolean acelerometro, boolean gps) {
        double aumento = 0;
        if (acelerometro) {
            aumento += this.getPreuBase() * 5 / 100;
        }
        if (gps) {
            aumento += this.getPreuBase() * 5 / 100;
        }
        this.preuFinal = this.getPreuBase() + aumento;
        return this.preuFinal;
    }

    @Override
    public String toString() {
        String auxAce = (acelerometro) ? "Si" : "No";
        String auxGps = (gps) ? "Si" : "No";
        return "Smartphone: Sistema operativo:" + sistemaOperativo + ", acelerometro:" + auxAce + ", gps:" + auxGps + " precio Base:" + this.getPreuBase() + " Precio Final:" + preuFinal;
    }


    public String isGamaAlta(double preu) {
        // System.out.println("EL PREU QUE LLEGAES "+preu);
        if (preu > 400) {
            return "Es gama alta";
        } else {
            return "No es gama alta";
        }
    }

    
}
