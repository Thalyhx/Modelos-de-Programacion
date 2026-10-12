/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco.chainresponsability;

/**
 *
 * @author natha
 */
public class Ejecutivo extends Handler{

    @Override
    public void ProcesarPrestamo(Prestamo prestamo) {
        double monto = prestamo.getMonto();
        
        if (monto<= 10000){
            System.out.println("\nPrestamo de $" + monto + " aprobado por el Ejecutivo");
        } else if(sucesor != null){
            System.out.println("Ejecutivo  no puede procesar el prestamo ...");
            getSucesor().ProcesarPrestamo(prestamo);
        }
    }
    
}
