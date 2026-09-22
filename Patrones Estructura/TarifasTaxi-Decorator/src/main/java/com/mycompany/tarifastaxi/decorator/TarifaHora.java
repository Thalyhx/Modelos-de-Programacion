/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarifastaxi.decorator;

/**
 *
 * @author natha
 */
public class TarifaHora extends DecoratorTarifa{
    private int hora;

    public TarifaHora( Tarifa tarifa, int hora) {
        super(tarifa);
        this.hora=hora;
    }
    
        @Override
    public double calcTarifa(int distancia) {
            if ((hora>= 22 && hora<=24) || (hora>=1 && 3<=hora)){
            this.recargo = 3000;}
             return super.calcTarifa(distancia) + recargo;
    }

}
