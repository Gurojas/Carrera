/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegocarrera;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.util.Duration;

/**
 *
 * @author Usuario
 */
public class Timer {
    
    private Timeline timer;
    private final int frec = 1;
    private int min = 0;
    private int sec = 0;
    
    public Timer(){
        
        EventHandler<ActionEvent> listener = new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if (sec < 10){
                    PanelBottom.tiempo.setText("0"+min+":"+"0"+sec);
                }
                else{
                    PanelBottom.tiempo.setText("0"+min+":"+sec);
                }
                
                if (sec == 60){
                    sec = 0;
                    min++;
                }
                
                
                sec++;
                
            }
        };
        
        KeyFrame keyFrame = new KeyFrame(Duration.seconds(this.frec), listener);
        this.timer = new Timeline(keyFrame);
        this.timer.setCycleCount(Timeline.INDEFINITE);
    
    }
    
    public void empezar(){
        this.timer.play();
    }
    
    public void terminar(){
        this.timer.stop();
    }
    
}
