/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.operaciones.templatemethod;

/**
 *
 * @author natha
 */
public abstract class Operacion {
    
    public final double templateMethod(String textoA, String textoB){
        
        double a = parsear(textoA);
        double b = parsear(textoB);
        if (validar(a,b)){
            double resultado = operar(a,b);
            return resultado;
        }
        throw new IllegalArgumentException(" Error al validar los numeros");
        
    }
        
    public final double parsear(String mensaje){
        try{
        double num = Double.parseDouble(mensaje);
        return num;
        }catch(NumberFormatException e)
        {System.out.println("Error al parsear");}
        return 0;
    }
    
    public abstract double operar(double a, double b);
    
    public boolean validar(double a, double b){
        return true;
     }
    

}
