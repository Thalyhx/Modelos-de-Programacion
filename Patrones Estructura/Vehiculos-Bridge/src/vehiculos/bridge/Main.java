/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculos.bridge;

/**
 *
 * @author natha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Motor motorGasolina = new MotorGasolina();
        Motor motorElectrico = new MotorElectrico();

        Vehiculo bus = new Bus(motorGasolina);
        Vehiculo camion = new Camion(motorElectrico);

        System.out.println("--- Probando el bus ---");
        bus.acelerar();
        bus.frenar();

        System.out.println("\n--- Probando el Camion ---");
        camion.acelerar();
        camion.frenar();
    
    }
    
}
