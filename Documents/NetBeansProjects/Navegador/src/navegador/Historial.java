/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navegador;

import java.time.LocalDateTime;

/**
 *
 * @author Danny Franco
 */
public class Historial {

    private String url;
    private LocalDateTime diaHora;


    public Historial() {
    }

    public Historial(String url) {
        this.url = url;
        this.diaHora = diaHora.now();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDateTime getDiaHora() {
        return diaHora;
    }

    public void setDiaHora(LocalDateTime diaHora) {
        this.diaHora = diaHora;
    }
 

    @Override
    public String toString() {
        return this.getUrl() + "  -  " + this.getDiaHora();
    }
}
