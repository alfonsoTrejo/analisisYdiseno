/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.analisisydiseno2;

/**
 *
 * @author trejo
 */
public class Formato {
    ListaDeCurso tiraDeMaterias = new ListaDeCurso();
    public Formato(){
    
    }
    public void inscribir(String materia){
        tiraDeMaterias.UPDATE(materia);
    }
    public void actualizarFormato(String materia){
        inscribir(materia);
    }
}
