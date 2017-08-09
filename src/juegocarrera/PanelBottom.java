/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegocarrera;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author Usuario
 */
public class PanelBottom extends VBox{
    
    //
    private TextArea regConejo;
    private TextArea regTortuga;
    private Button empezar;
    private Label tiempo;
    
    public PanelBottom(Movimiento movConejo, Movimiento movTortuga){
        
        this.setSpacing(5);
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(5));
        
        this.regConejo = new TextArea();
        this.regConejo.setEditable(false);
        
        this.regTortuga = new TextArea(); 
        this.regTortuga.setEditable(false);
        
        this.empezar = new Button("Comenzar");
        
        this.tiempo = new Label("00:00");
        
        HBox panelReg = new HBox(5);
        panelReg.getChildren().addAll(this.regConejo,this.regTortuga);
        
        this.getChildren().addAll(this.tiempo,panelReg,this.empezar);
        
        
        this.empezar.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                movConejo.empezarMovimiento();
                movTortuga.empezarMovimiento();
            }
        });
        
        
    
    }
    
}
