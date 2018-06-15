/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasYcircles2;

import processing.core.PApplet;

/**
 *
 * @author Danny Franco
 */
public class Cercle extends Figura {

    public Cercle(PApplet pApplet, float radi, float color) {
        super(pApplet, radi, color);
    }
    

    @Override
    public void mostrar(int x, int y) {
        Figura.pApplet.fill((float) this.getColor(), 0, 0);
     //posiciona y vizualiza el cercla en la poscion x y      
        // para dibujar el circulo, coordenadas de donde estará y su radio
        Figura.pApplet.ellipse(x, y, this.getRadi(), this.getRadi());
        Figura.pApplet.text((int)this.getRadi(), x, 250);
        
    }
    
}
