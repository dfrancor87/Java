/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorSucursal;

import java.util.Iterator;

/**
 *
 * @author Danny Franco
 */
public class Prueba {
    public static void main(String[] args) {
        Sucursal s = new Sucursal("BCN");
        s.add("Danny");
        s.add("ALex");
        
        Iterator it = s.iterator();
        while (it.hasNext()){
            Empleado e= (Empleado) it.next();
            e.print();
        }
    }
}
