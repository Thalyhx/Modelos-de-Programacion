/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco.chainresponsability.Pruebas;

import banco.chainresponsability.Director;
import banco.chainresponsability.Ejecutivo;
import banco.chainresponsability.Gerente;
import banco.chainresponsability.Handler;
import banco.chainresponsability.LiderEjecutivo;
import banco.chainresponsability.Prestamo;

/**
 *
 * @author natha
 */
public class ClientePrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Handler ejecutivo = new Ejecutivo();
        Handler lider = new LiderEjecutivo();
        Handler gerente = new Gerente();
        Handler director = new Director();
        
        ejecutivo.setSucesor(lider);
        lider.setSucesor(gerente);
        gerente.setSucesor(director);
        
        //Casos de prueba
        Prestamo prestamo1 = new Prestamo("Carlos Perez", 10123, 30, "Ingeniero", 8000.0);    
        Prestamo prestamo2 = new Prestamo("Ana Gomez", 20456, 35, "Doctora", 35000.0);       
        Prestamo prestamo3 = new Prestamo("Luis Torres", 30789, 42, "Empresario", 75000.0);   
        Prestamo prestamo4 = new Prestamo("Sofia Ruiz", 40321, 50, "Inversionista", 150000.0); 
        
        System.out.println("PROCESANDO PRESTAMO 1:");
        ejecutivo.ProcesarPrestamo(prestamo1);

        System.out.println("\n PROCESANDO PRESTAMO 2:");
        ejecutivo.ProcesarPrestamo(prestamo2);

        System.out.println("\n PROCESANDO PRESTAMO 3 :");
        ejecutivo.ProcesarPrestamo(prestamo3);

        System.out.println("\n PROCESANDO PRESTAMO 4:");
        ejecutivo.ProcesarPrestamo(prestamo4);
    }
    
}
