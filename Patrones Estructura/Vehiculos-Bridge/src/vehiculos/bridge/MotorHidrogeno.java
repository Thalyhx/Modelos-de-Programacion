/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos.bridge;

/**
 *
 * @author natha
 */
public class MotorHidrogeno extends Motor{
    
    @Override
    public void accionar() {
        System.out.println("Motor a Hidrogeno: Generando energia limpia.(hidrogeno");
    }

    @Override
    public void parar() {
        System.out.println("Motor a Hidrogeno: Deteniendo flujo hidrogeno ");
    }
    
}
