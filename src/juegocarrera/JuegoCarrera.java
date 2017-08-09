/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegocarrera;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Usuario
 */
//
public class JuegoCarrera extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        VBox main = new VBox(2);
        
        Conejo conejo = new Conejo();
        Tortuga tortuga = new Tortuga();
        
        Escenario escenarioTortuga = new Escenario(tortuga);
        Escenario escenarioConejo = new Escenario(conejo);
        
        main.getChildren().add(escenarioTortuga.getEscenario());
        main.getChildren().add(escenarioConejo.getEscenario());
        
        Movimiento movimientoConejo = new Movimiento(conejo);
        Movimiento movimientoTortuga = new Movimiento(tortuga);
        
        main.getChildren().add(new PanelBottom(movimientoConejo,movimientoTortuga));
        

       
        
        
        Scene scene = new Scene(main, 800, 600);
        
        primaryStage.setTitle("Carrera");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
