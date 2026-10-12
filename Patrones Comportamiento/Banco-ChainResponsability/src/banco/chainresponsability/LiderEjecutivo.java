/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco.chainresponsability;

/**
 *
 * @author natha
 */
public class LiderEjecutivo extends Handler{

    @Override
    public void ProcesarPrestamo(Prestamo prestamo) {
        double monto = prestamo.getMonto();
        if(monto>10000 && monto <= 50000){
            System.out.println("Prestamo de $" + monto + " aprobado por el Lider Ejecutivo");
        }else if(sucesor!=null){
            System.out.println("Lider ejecutivo no puede procesar el prestamo....");
            getSucesor().ProcesarPrestamo(prestamo);
        }
    }
    
}
