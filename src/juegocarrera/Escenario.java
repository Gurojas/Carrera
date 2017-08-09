/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegocarrera;

import javafx.scene.Group;
import javafx.scene.image.ImageView;

/**
 *
 * @author Usuario
 */
public class Escenario {
    
    private Group panelDibujo;
    private ImageView fondo;
    
    private final int w = 800;
    private final int h = 200;
    //
    
    public Escenario(Animal animal){
        this.panelDibujo = new Group();
        this.fondo = new ImageView("/imagen/fondo.png");
        this.fondo.setFitWidth(w);
        this.fondo.setFitHeight(h);
        this.panelDibujo.getChildren().add(fondo);
        
        this.panelDibujo.getChildren().add(animal.getCharacter());
        
       
    }

    
    public Group getEscenario(){
        return this.panelDibujo;
    }
    
    
    
    
    
}
