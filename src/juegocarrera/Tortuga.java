/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegocarrera;

import javafx.scene.image.ImageView;

/**
 *
 * @author Usuario
 */
public class Tortuga extends Animal implements IMovimiento{
    
    private final int w = 50;
    private final int h = 50;
    //
    public Tortuga(){
        super();
        this.character = new ImageView("/imagen/tortuga.png");
        this.character.setFitWidth(w);
        this.character.setFitHeight(h);
        
        this.character.setY(130);
        
    }

    @Override
    public void avanceRapido() {
        int mov = Movimiento.conversion(3);
        if (this.getX() + mov < 740){
            this.setX(this.getX() + mov);
        }
        else{
            this.setX(740);
        }
        
    }

    @Override
    public void pistaConAceite() {
        int mov = Movimiento.conversion(6);
        if (this.getX() - mov > 0){
            this.setX(this.getX() - mov);
        }
        else{
            this.setX(0);
        }
        
    }

    @Override
    public void avanceLento() {
        int mov = Movimiento.conversion(1);
        if (this.getX() + mov < 740){
            this.setX(this.getX() + mov);
        }
        else{
            this.setX(740);
        }
    }

    @Override
    public void dormir() {
    }

    @Override
    public void granSalto() {
    }

    @Override
    public void pistaConHielo() {
    }

    @Override
    public void pequenoSalto() {
    }

    @Override
    public void pistaConPlatano() {
    }
    
}
