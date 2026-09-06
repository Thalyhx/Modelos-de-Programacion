package vehiculos.bridge;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author natha
 */
public abstract class Vehiculo {
    
    protected Motor motor;

    public Vehiculo(Motor motor) {
        this.motor = motor;
    }
    
    public abstract void acelerar();
    public abstract void frenar();
    
}
