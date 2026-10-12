/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco.chainresponsability;
import java.util.Scanner;
/**
 *
 * @author natha
 */


public class Cliente {

    public static void main(String[] args) {

        Handler ejecutivo = new Ejecutivo();
        Handler lider = new LiderEjecutivo();
        Handler gerente = new Gerente();
        Handler director = new Director();


        ejecutivo.setSucesor(lider);
        lider.setSucesor(gerente);
        gerente.setSucesor(director);

        try (Scanner sc = new Scanner(System.in)) {
            int opcion = 0;
            
            do {
                System.out.println("\n========================================");
                System.out.println("   BANCO  DE PRESTAMOS     ");
                System.out.println("========================================");
                System.out.println("1. Solicitar un prestamo");
                System.out.println("2. Salir");
                System.out.print("Seleccione una opcion: ");
                
                if (sc.hasNextInt()) {
                    opcion = sc.nextInt();
                } else {
                    System.out.println("ingrese un numero valido ");
                    sc.next();
                    continue;
                }
                
                if (opcion == 1) {
                    sc.nextLine(); 
                    
                    System.out.print("\nIngrese el nombre del solicitante: ");
                    String nombre = sc.nextLine();
                    
                    System.out.print("Ingrese la cedula: ");
                    int cedula = sc.nextInt();
                    
                    System.out.print("Ingrese la edad: ");
                    int edad = sc.nextInt();
                    
                    sc.nextLine(); 
                    System.out.print("Ingrese la ocupacion: ");
                    String ocupacion = sc.nextLine();
                    
                    System.out.print("Ingrese el monto del prestamo ($): ");
                    double monto = sc.nextDouble();
                    

                    Prestamo prestamo = new Prestamo(nombre, cedula, edad, ocupacion, monto);
                    
                    System.out.println("\n--- EVALUANDO SOLICITUD ---");
                    
                    ejecutivo.ProcesarPrestamo(prestamo);
                    
                } else if (opcion == 2) {
                    System.out.println(" Saliendo...");
                } else {
                    System.out.println("Opcion no valida");
                }
                
            } while (opcion != 2);
        }
    }
}
