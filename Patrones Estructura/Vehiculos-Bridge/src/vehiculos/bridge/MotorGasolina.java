/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos.bridge;

/**
 *
 * @author natha
 */
public class MotorGasolina extends Motor{
    
    @Override
    public void accionar() {
        System.out.println("Motor a Gasolina: quemando combustible.");
    }

    @Override
    public void parar() {
        System.out.println("Motor a Gasolina: Deteniendo combustion.");
    }
}
