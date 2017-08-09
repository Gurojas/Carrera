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
public class Conejo extends Animal implements IMovimiento{
    
    private final int w = 50;
    private final int h = 50;
    //
    public Conejo(){
        super();
        this.character = new ImageView("/imagen/conejo.png");
        this.character.setFitWidth(w);
        this.character.setFitHeight(h);
        
        this.character.setY(130);
    }

    @Override
    public void avanceRapido() {
        
    }

    @Override
    public void pistaConAceite() {
    }

    @Override
    public void avanceLento() {
    }
 
    @Override
    public void dormir() {
        this.setX(this.getX());
    }

    @Override
    public void granSalto() {
        int mov = Movimiento.conversion(9);
        if (this.getX() + mov < 740){
            this.setX(this.getX() + mov);
        }
        else{
            this.setX(740);
        }
        
    }

    @Override
    public void pistaConHielo() {
        int mov = Movimiento.conversion(12);
        if (this.getX() - mov > 0){
            this.setX(this.getX() - mov);
        }
        else{
            this.setX(0);
        }
        
    }

    @Override
    public void pequenoSalto() {
        int mov = Movimiento.conversion(1);
        if (this.getX() + mov < 740){
            this.setX(this.getX() + mov);
        }
        else{
            this.setX(740);
        }
        
    }

    @Override
    public void pistaConPlatano() {
        int mov = Movimiento.conversion(2);
        if (this.getX() - mov > 0){
            this.setX(this.getX() - mov);
        }
        else{
            this.setX(0);
        }
        
    }
    

    
    
    
}
