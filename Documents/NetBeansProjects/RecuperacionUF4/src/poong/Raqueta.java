/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poong;
import processing.core.PApplet;
/**
 *
 * @author Danny Franco
 */
public class Raqueta {
    
    PApplet parent;
    float x,y,w,h;
    
   

    public Raqueta(PApplet parent) {
        this.parent = parent;
        x = parent.width -15;
        y = 10;
        w = 10;
        h = 50;
    
    }
    
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getH() {
        return h;
    }
    
    
    // mover con el raton
    public void moverRaton(){
        y=parent.mouseY;
    }
     
    // mostrar
    public void display(){
        parent.rect(x, y, w, h);
    }
    
}
