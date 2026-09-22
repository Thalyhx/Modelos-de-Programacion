/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarifastaxi.decorator;

/**
 *
 * @author natha
 */
public class TarifaTaxi extends Tarifa{

    @Override
    public double calcTarifa(int distancia) {
        return distancia*1000;
    }
    
}
