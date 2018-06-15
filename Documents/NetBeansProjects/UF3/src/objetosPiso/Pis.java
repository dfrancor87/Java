package objetosPiso;


import java.util.Scanner;
import java.io.Serializable;
/**
 * Classe para guardar la informació de'un pis
 * @author prof
 */
public class Pis implements Serializable {
    private int metresQuadrats;
    private int habitacions;
    private int banys;
    private double preu;
    private boolean ascensor;
    private int altura;

    public Pis(int metresQuadrats, int habitacions, int banys, double preu, boolean ascensor, int altura) {
        this.metresQuadrats = metresQuadrats;
        this.habitacions = habitacions;
        this.banys = banys;
        this.preu = preu;
        this.ascensor = ascensor;
        this.altura = altura;
    }
    
    // Constructor sense paràmetres
    public Pis() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dades del pis...");
        System.out.print("Quants metres quadrats té el pis ? ");
        // Llegim els metres quadrats
        metresQuadrats = entrada.nextInt();
        System.out.print("Quantes habitacions ? ");
        // Llegim les habitacions
        habitacions = entrada.nextInt();
        System.out.print("Quants banys ? ");
        // Llegim el nombre de banys
        banys = entrada.nextInt();
        // Com queden caràcters pendents de llegir els buidem
        entrada.nextLine();
        System.out.print("Tiene ascensor [S/N] : ");
        char as = entrada.nextLine().charAt(0);
        if (as == 'S' || as == 's')
            ascensor = true;
        else
            ascensor = false;
        // Demanem l'alçada
        System.out.print("Quina és l'alçada del pis ? ");
        // Llegim l'alçada
        altura = entrada.nextInt();
        // Per últim demanem el preu
        System.out.print("Quin és el preu del pis ? ");
        // Llegim el preu
        preu = entrada.nextDouble();
    }

    @Override
    public String toString() {
		String as;
		if (ascensor) {
			as="SI";
		}
		else {
			as="NO";
		}
        return "Dades del Pis {" + "Metres Quadrats=" + metresQuadrats + ", Habitacions=" + habitacions + 
        ", Banys=" + banys + ", Preu=" + preu + ", Ascensor = " + as + ", Alçada=" + altura + '}';
    }
}
