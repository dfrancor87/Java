/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basics;

/**
 *
 * @author Danny Franco
 */
public class ProvaEstudiant {

    public static void main(String[] args) {
        Estudiant e1 = new Estudiant("Pepe", "Pujol", "Cabanes", 5);
        Estudiant e2 = new Estudiant("Agustín", "Roig", "Puig", 10);

        System.out.println(e1);
        System.out.println(e2);
        e1.setNom();
        e1.setCog1();
        e1.setCog2();

        e2.setNom();
        e2.setCog1();
        e2.setCog2();

        System.out.println(e1);
        System.out.println(e2);
        Estudiant.setNomInstitut();
        System.out.println(e1);
        System.out.println(e2);

    }

}
