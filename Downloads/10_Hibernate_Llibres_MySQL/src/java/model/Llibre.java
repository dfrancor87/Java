package model;
// Generated 27-abr-2018 7:58:15 by Hibernate Tools 4.3.1



/**
 * Llibre generated by hbm2java
 */
public class Llibre  implements java.io.Serializable {


     private int idLlibre;
     private String titol;
     private String autor;

    public Llibre() {
    }

    public Llibre(int idLlibre, String titol, String autor) {
       this.idLlibre = idLlibre;
       this.titol = titol;
       this.autor = autor;
    }
   
    public int getIdLlibre() {
        return this.idLlibre;
    }
    
    public void setIdLlibre(int idLlibre) {
        this.idLlibre = idLlibre;
    }
    public String getTitol() {
        return this.titol;
    }
    
    public void setTitol(String titol) {
        this.titol = titol;
    }
    public String getAutor() {
        return this.autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }




}

