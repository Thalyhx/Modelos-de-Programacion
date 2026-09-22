/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarifastaxi.decorator;

/**
 *
 * @author natha
 */
public class TarifaLugar extends  DecoratorTarifa{
    private String lugar;
    public TarifaLugar(Tarifa tarifa, String lugar) {
        super(tarifa);
        this.lugar=lugar;
    }

    @Override
    public double calcTarifa(int distancia) {
        double recargoLugar=0;
        if(lugar.equalsIgnoreCase("Aeropuerto")){
            recargoLugar= 5000;
        }else if (lugar.equalsIgnoreCase("estadio")){
            recargoLugar=3000;
        }else if(lugar.equalsIgnoreCase("centro comercial")){
        recargoLugar=1000;
        }
            
        return super.calcTarifa(distancia)+recargoLugar;
    }
    
}
