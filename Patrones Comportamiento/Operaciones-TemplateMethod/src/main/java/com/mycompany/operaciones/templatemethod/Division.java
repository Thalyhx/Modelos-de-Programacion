/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.operaciones.templatemethod;

/**
 *
 * @author natha
 */
public class Division extends Operacion{
    
    @Override
    public boolean validar(double a, double b){
        if (b==0){
            return false;
        }
        return true;
    }
    
    @Override
    public double operar(double a, double b) {
        return a/b;
    }
    
}
