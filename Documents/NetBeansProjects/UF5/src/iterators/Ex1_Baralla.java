
package iterators;

import java.util.Iterator;

/** Primer exemple d'ús del patró Iterator, utilitzant la interface Iterator
 *  del paquet java.util. Els mètodes abstractes són next() i hasNext()
 *
 * @author Montse
 * @version gener 2014
 */
public class Ex1_Baralla implements Iterator{
    private Naip[]cartes;
    private int index=0;
    private int actual=0;
    
    public Ex1_Baralla(){
        cartes=new Naip[10];
    }
    
   public void afegirNaip(Naip p){
       cartes[actual++]=p;     
   }
    
    @Override
    public boolean hasNext() {
       if(actual==index) {
            return false;
        }
       else {
            return true;
        }
    }

    @Override
    public Object next() { //Naip
       return (Object)cartes[index++]; 
    }

    
    
    public static void main(String[] args) {
        Ex1_Baralla b=new Ex1_Baralla();
        b.afegirNaip(new Naip(2,"Bastos"));
        b.afegirNaip(new Naip(3,"Bastos"));
        b.afegirNaip(new Naip(4,"Espadas"));
        b.afegirNaip(new Naip(1,"Oros"));
        b.afegirNaip(new Naip(2,"Bastos"));
       
        
        while(b.hasNext()){
           System.out.println(b.next());
       }
        
        // NO VA si Baralla no es Iterable
//        for(Naip n: b){
//            System.out.println(n);
//        }
       /* nomes es pot fer servir bucle for-each
         * sempre i quan la classe sigui "Iterable", es a dir
         * que implementi la interface Iterable*/
    }

    @Override
    public void remove() {
        
    }
    
   


}


