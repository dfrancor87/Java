package basics;

/**
 *
 * @author Danny Franco
 */
public class PersonaEjercicio1 {

    private int id;
    private String nom, cog1, cog2;
    //private Date dataNaixement;
    private int edat;
    private String clau;
//
    public PersonaEjercicio1(int id, String nom, String cog1, String cog2, int edat, String clau) {
        this.id = id;
        this.nom = nom;
        this.cog1 = cog1;
        this.cog2 = cog2;
        this.edat = edat;
        this.clau = clau;
    }

    //a
    public void setEdat(int nova) {
        edat = nova;
    }

    public int getEdat() {
        return edat;
    }

    //b
    public int gettId() {
        return id;
    }

    //d
    public void setPassword(String clauVella, String clauNova) {
        if (clauVella.equals(clau)) {
            clau = clauNova;
        }

    }

}
