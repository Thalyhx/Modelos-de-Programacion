/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos.bridge;

/**
 *
 * @author natha
 */
public class Camion extends Vehiculo{
    
    public Camion(Motor motor) {
        super(motor);
    }
    
    

    @Override
    public void acelerar() {
        System.out.print("Camion de carga acelerando -> ");
        this.motor.accionar();
    }

    @Override
    public void frenar() {
        System.out.print("Camion de carga frenando -> ");
        this.motor.parar();
    }
    
}
