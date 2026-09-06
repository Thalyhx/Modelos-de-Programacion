/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos.bridge;

/**
 *
 * @author natha
 */
public class MotorElectrico extends Motor{
    
    @Override
    public void accionar() {
        System.out.println("Motor Electrico:  acelerando (consumiendo energia) ");
    }

    @Override
    public void parar() {
        System.out.println("Motor Electrico: Cortando energia");
    }
    
}
