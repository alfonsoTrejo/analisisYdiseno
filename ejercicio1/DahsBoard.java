/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.analisisydiseno;

public class DahsBoard {
    SensorProxy proxy = new SensorProxy();
    public String updateDate(){
        return proxy.read();
    }
    
    public void updateDisplay(){
        System.out.println(updateDate());
    }
    
}
