/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operaciones.command;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author natha
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Crea al invocador
        Invoker objInvoker = new Invoker();
        // Crea el receptor
        Calculadora objCalculadora = new Calculadora();
        // Crea las operaciones
        OperacionSumar objSumar = new OperacionSumar(objCalculadora);
        OperacionRestar objRestar = new OperacionRestar(objCalculadora);
        OperacionMultiplicar objMultiplicar = new OperacionMultiplicar(objCalculadora);
        OperacionDividir objDividir = new OperacionDividir(objCalculadora);
        OperacionGoogol objGoogol = new OperacionGoogol(objCalculadora);
        
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        
        // Bucle de calculadora
        while (!salir) {
            // Menu
            System.out.println("\n------------ Calculadora ------------");
            System.out.println("----- Valor actual: " + objCalculadora.getActual() + " -----");
            System.out.println("Operaciones:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Utilizar Googol");
            System.out.println("6. Deshacer operacion");
            System.out.println("7. Salir");
            System.out.print("Ingrese la opcion que quiere: ");
            
            int opcion = 0;
            
            try {
                opcion = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: numero no valido.");
                sc.nextLine(); 
                continue; 
            }
            
            if (opcion == 7) {
                salir = true;
                System.out.println("Saliendo ....");
                break;
            }

            double a = objCalculadora.getActual(); 
            double b = 0;
            double resultado = 0;
            String simbolo = ""; //de la operacion
            
            // Asigna el simbolo
            switch (opcion) {
                case 1: simbolo = "+"; break;
                case 2: simbolo = "-"; break;
                case 3: simbolo = "*"; break;
                case 4: simbolo = "/"; break;
            }
            
            // Pide segundo numero
            if (opcion >= 1 && opcion <= 4) {
                System.out.print(a + " " + simbolo + " : "); 
                b = sc.nextDouble();
            } else if (opcion == 5) {
                a = objCalculadora.getActual(); 
            }
            
            //Switch case de operaciones
            switch (opcion) {
                case 1:
                    resultado = objSumar.operar(a, b);
                    objInvoker.setOperacion(objSumar);
                    System.out.println("\n-------------------------------------------");
                    System.out.println("------------- " + a + " + " + b + " = " + resultado + " -------------");
                    System.out.println("-------------------------------------------\n");
                    break;

                case 2:
                    resultado = objRestar.operar(a, b);
                    objInvoker.setOperacion(objRestar);
                    System.out.println("\n-------------------------------------------");
                    System.out.println("------------- " + a + " - " + b + " = " + resultado + " -------------");
                    System.out.println("-------------------------------------------\n");
                    break;

                case 3:
                    resultado = objMultiplicar.operar(a, b);
                    objInvoker.setOperacion(objMultiplicar);
                    System.out.println("\n-------------------------------------------");
                    System.out.println("------------- " + a + " * " + b + " = " + resultado + " -------------");
                    System.out.println("-------------------------------------------\n");
                    break;

                case 4:
                    try {
                        resultado = objDividir.operar(a, b);
                        objInvoker.setOperacion(objDividir);
                        System.out.println("\n-------------------------------------------");
                        System.out.println("------------- " + a + " / " + b + " = " + resultado + " -------------");
                        System.out.println("-------------------------------------------\n");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 5:
                    resultado = objGoogol.operar(a, 0);
                    objInvoker.setOperacion(objGoogol);
                    System.out.println("\n-------------------------------------------");
                    System.out.println("------------- " + a + " * Googol = " + resultado + " -------------");
                    System.out.println("-------------------------------------------\n");
                    break;

                case 6:
                    resultado = objInvoker.deshacer();
                    System.out.println("\n-------------------------------------------");
                    System.out.println("------------- Deshecho -> Estado actual: " + resultado + " -------------");
                    System.out.println("-------------------------------------------\n");
                    break;

                default:
                    System.out.println("Opcion invalida.");
                    break;
            }
        }

        sc.close();
    }
}
