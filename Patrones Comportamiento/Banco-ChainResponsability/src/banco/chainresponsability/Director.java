/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco.chainresponsability;

/**
 *
 * @author natha
 */
public class Director extends Handler{

    @Override
    public void ProcesarPrestamo(Prestamo prestamo) {
        double monto = prestamo.getMonto();
        if(monto>100000){
            System.out.println("Prestamo de $" + monto+ " aprobado por el Director");
        }else {
            
        System.out.println("Error Credito no aprovado.");
        }
    }
    
}
