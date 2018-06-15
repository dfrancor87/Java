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
public class PruebaDispositivo {

    public static void main(String[] args) {
        DispositivoMovil losDispositivos[] = new DispositivoMovil[4];

        losDispositivos[0] = new Altres("LG", "X-01", 100.00, "Smartwatch");
        losDispositivos[1] = new Smartphone("Android", false, true, "Sony", "Xperia", 300.00);
        losDispositivos[2] = new Smartphone("iOs", true, true, "Apple", "iPhone", 900.00);
        losDispositivos[3] = new Tablet(15, "Apple", "Ipad", 900.00);

        for (DispositivoMovil losDispositivo : losDispositivos) {
            System.out.println(losDispositivo.toString());
        }

        
        System.out.println("====GAMA ALTA====");
        Smartphone movil1 = new Smartphone("Android", false, true, "Sony", "Xperia", 300.00);
        Smartphone movil2 = new Smartphone("iOs", true, true, "Apple", "iPhone", 900.00);
        Tablet tab = new Tablet(15, "Apple", "Ipad", 900.00);
        System.out.println(movil1.toString() + " --> " + movil1.isGamaAlta(movil1.getPreuFinal()));
        System.out.println(movil2.toString() + " --> " + movil2.isGamaAlta(movil2.getPreuFinal()));
        System.out.println(tab.toString() + " -->" + tab.isGamaAlta(tab.getPreuBase()));

//        System.out.println(altres.toString());
//        System.out.println(movil1.toString() + " --> " + movil1.isGamaAlta(movil1.getPreuFinal()));
//        System.out.println(movil2.toString() + " --> " + movil2.isGamaAlta(movil2.getPreuFinal()));
//        System.out.println(tab.toString() + " -->" + tab.isGamaAlta(tab.getPreuBase()));
//
//        System.out.println("GAMA ");
    }
}
