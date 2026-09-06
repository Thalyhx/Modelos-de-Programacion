/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos.bridge;

/**
 *
 * @author natha
 */
public class Bus extends Vehiculo{
    
    public Bus(Motor motor) {
        super(motor);
    }

    @Override
    public void acelerar() {
        System.out.print("Bus acelerando -> ");
        this.motor.accionar();
    }

    @Override
    public void frenar() {
        System.out.print("Bus frenando -> ");
        this.motor.parar();
    }
    
}
