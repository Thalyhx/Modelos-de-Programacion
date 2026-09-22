/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarifastaxi.decorator;

/**
 *
 * @author natha
 */
public class TarifaFestivo extends DecoratorTarifa{

    public TarifaFestivo(Tarifa tarifa) {
        super(tarifa);
    }
    
    @Override
    public double calcTarifa(int distancia) {
        double recargo= 5000;
        return super.calcTarifa(distancia) + recargo;
    }
        
}
