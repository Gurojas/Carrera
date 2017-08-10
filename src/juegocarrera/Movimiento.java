/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegocarrera;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.concurrent.Task;

/**
 *
 * @author Usuario
 */
public class Movimiento {
    
    //
    private Task<Void> task;
    private Random random;
    private Conejo conejo;
    private Tortuga tortuga;
    
    public Movimiento(Animal animal){
        
        this.random = new Random();
        this.task = new Task<Void>() {
        

            @Override
            protected Void call() throws Exception {
                
                if (animal instanceof Conejo){    
                    conejo = (Conejo)animal;
                    while (!task.isCancelled()){
                        int num = random.nextInt(100) + 1;
                        if (num >= 1 && num <= 20){
                            conejo.dormir();
                            PanelBottom.regConejo.appendText("Dormir\r\n");
                        }
                        else if (num > 20 && num <= 40){
                            conejo.granSalto();
                            PanelBottom.regConejo.appendText("Gran salto\r\n");
                        }
                        else if (num > 40 && num <= 50){
                            conejo.pistaConHielo();
                            PanelBottom.regConejo.appendText("Resbalo pista con hielo\r\n");
                        }
                        else if (num > 50 && num <= 80){
                            conejo.pequenoSalto();
                            PanelBottom.regConejo.appendText("Salto pequeño\r\n");
                        }
                        else{
                            conejo.pistaConPlatano();
                            PanelBottom.regConejo.appendText("Resbalon platano en la pista\r\n");
                        }
                        if (conejo.carreraTerminada()){
                            pararMovimiento();
                        }
                        Thread.sleep(1000);
                    }
                }
                else{
                    tortuga = (Tortuga)animal;
                    while (!task.isCancelled()){
                        int num = random.nextInt(100) + 1;
                        if (num >= 1 && num < 50){
                            tortuga.avanceRapido();
                            PanelBottom.regTortuga.appendText("Avance rapido\r\n");
                        }
                        else if (num >= 50 && num < 70){
                            tortuga.pistaConAceite();
                            PanelBottom.regTortuga.appendText("Resbalo pista con aceite\r\n");
                        }
                        else{
                            tortuga.avanceLento();
                            PanelBottom.regTortuga.appendText("Avance lento\r\n");
                        }
                        if (tortuga.carreraTerminada()){
                            pararMovimiento();
                        }
                        Thread.sleep(1000);
                    }
                }
                
                return null;
            }
        };
        
    }
    
    public static int conversion(int dx){
        int xi = 0;
        int xf = 740;
        int max = 70;
        return ((xf-xi)*dx)/max;
    }
    
    
    public void empezarMovimiento(){
       Thread th = new Thread(this.task);
       th.setDaemon(true);
       th.start();
    }
    
    private void pararMovimiento(){
        
        
        this.task.cancel();
       

    }
    
    
    
    
   
    
}
