/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.analisisydiseno;

/**
 *
 * @author trejo
 */
public class SensorProxy {
    Sensor [] sensores = new Sensor[2];
    TemperatureSensor sen1 = new TemperatureSensor();
    LightSensor sen2 = new LightSensor();
    String datos ="";
    public SensorProxy(){
        sensores[0] = sen1;
        sensores[1] = sen2;
    }
    public String read(){
        for (int i = 0; i < sensores.length; i++) {
            datos += ("Sensor{"+i+"}"+":"+sensores[i].read()+"\n");
        }
    return datos;
    }
    
}
