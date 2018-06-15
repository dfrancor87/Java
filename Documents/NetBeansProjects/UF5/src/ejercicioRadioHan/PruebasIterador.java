package ejercicioRadioHan;

import java.util.Iterator;

public class PruebasIterador {

    public static void main(String[] args) {
        Radio r = new Radio();
        r.afegirEmissora(new Emissora("ser", "pop", 101.3));
        r.afegirEmissora(new Emissora("rne", "rock", 98.3));
        r.afegirEmissora(new Emissora("juanarcos", "flamenco", 109.4));
        r.afegirEmissora(new Emissora("cope", "clàssica", 97.5));
        r.afegirEmissora(new Emissora("catRadio", "pop", 89.2));
        r.afegirEmissora(new Emissora("alternativa", "pop", 105.6));
        r.afegirEmissora(new Emissora("teletaxi", "flamenco", 102.9));
        
        System.out.println("Iterar per estil rock.....");
        Iterator it = r.creaIterator("rock");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        System.out.println("Iterar per estil flamenco...");
        Iterator it3 = r.creaIterator("flamenco");
        while (it3.hasNext()) {
            System.out.println(it3.next());
        }
       
        
        System.out.println("Iterar per estil pop...");
        Iterator it2 = r.creaIterator("pop");
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

        

        
    }
}
