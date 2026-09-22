/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarifastaxi.decorator;

/**
 *
 * @author natha
 */
public abstract class DecoratorTarifa extends Tarifa{
    
    protected Tarifa tarifa;
    protected double recargo;

    public DecoratorTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }
    
    @Override
    public double calcTarifa(int distancia) {
        return tarifa.calcTarifa(distancia); 
    }
    
}
