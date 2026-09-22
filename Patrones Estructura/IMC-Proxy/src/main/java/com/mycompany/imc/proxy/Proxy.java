/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imc.proxy;

/**
 *
 * @author natha
 */
public class Proxy implements Imc{
    
        private ImcReal objImc = null;

    @Override
    public double calcularImc(double peso, double estatura) {
            if (peso<=0 || estatura<=0){
                        throw new IllegalArgumentException("Error en el peso o la estatura");
            }
        
             this.objImc= new ImcReal();
            double imc= objImc.calcularImc(peso, estatura);
            return imc;

    }
}
