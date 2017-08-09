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
public abstract class Animal{
    
    protected ImageView character;
    
    public Animal(){
    

    }
    
    public ImageView getCharacter(){
        return this.character;
    }
    
    protected void setX(int x){
        this.character.setX(x);
    }
    
    protected int getX(){
        return (int)this.character.getX();
    }
    
    protected boolean carreraTerminada(){
        if (this.character.getX() >= 740){
            return true;
        }
        return false;
    }
    
    
    

    
}
