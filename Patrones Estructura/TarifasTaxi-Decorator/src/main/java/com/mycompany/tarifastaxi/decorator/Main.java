/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarifastaxi.decorator;

/**
 *
 * @author natha
 */
public class Main {

    public static void main(String[] args) {
        
        Tarifa tarifa = new TarifaTaxi(); 
        

        tarifa = new TarifaHora(tarifa,2);
        tarifa = new TarifaLugar(tarifa, "Aeropuerto");

        int distanciaKm = 10;
        System.out.println("Total: $" + tarifa.calcTarifa(distanciaKm));
    }
}
