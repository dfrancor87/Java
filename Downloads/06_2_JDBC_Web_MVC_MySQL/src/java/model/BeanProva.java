package model;


import java.io.Serializable;

/**
 *
 * @author Montse
 */
public class BeanProva implements Serializable{
    //que tingui un atribut de cada tipus
    private String nom;
    private int numero;
    private double preu;
    private boolean necessari;
    
    
    @Override
    public String toString(){
        
        String s=(necessari)?" es necessari":" no es necessari";
        return nom+" "+numero+ " "+ preu+s;
    }
    public BeanProva(){
        
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the preu
     */
    public double getPreu() {
        return preu;
    }

    /**
     * @param preu the preu to set
     */
    public void setPreu(double preu) {
        this.preu = preu;
    }

    /**
     * @return the necessari
     */
    public boolean isNecessari() {
        return necessari;
    }

    /**
     * @param necessari the necessari to set
     */
    public void setNecessari(boolean necessari) {
        this.necessari = necessari;
    }
            
}
