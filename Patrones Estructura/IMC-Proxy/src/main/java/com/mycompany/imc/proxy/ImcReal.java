/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imc.proxy;

/**
 *
 * @author natha
 */
public class ImcReal implements Imc{

    @Override
    public double calcularImc(double peso, double estatura) {
        double imc=peso/(estatura*estatura);
        return imc;
    }
    
}
