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
        
        
        //Crea al invocador
        Invoker objInvoker= new Invoker();
        //Crea el receptor
        Calculadora objCalculadora = new Calculadora();
        //Crea las operaciones
        OperacionSumar objSumar = new OperacionSumar(objCalculadora);
        OperacionRestar objRestar = new OperacionRestar(objCalculadora);
        OperacionMultiplicar objMultiplicar = new OperacionMultiplicar(objCalculadora);
        OperacionDividir objDividir = new OperacionDividir(objCalculadora);
        OperacionGoogol objGoogol = new OperacionGoogol(objCalculadora);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("------------Calculadora--------");
        System.out.println("-----                  0              -----\n");
        System.out.println("Operaciones: \n1.Sumar\n2.restar\n3.multiplicar\n4.Dividir\n5.Utilizar Googol\n 6.Deshacer operacion");
        System.out.println("Ingrese la opcion que quiere: ");
        
        int opcion = 0;
            try {
                opcion = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error numero no valido ");
                sc.nextLine(); 
                return;
        }
            
         double a = 0;
        double b = 0;
        double resultado = 0;
        
        if (opcion >= 1 && opcion <= 4) {
            System.out.print("Ingrese el primer numero: ");
            a = sc.nextDouble();
            System.out.print("Ingrese el segundo numero: ");
            b = sc.nextDouble();
        } else if (opcion == 5) {
            System.out.print("Ingrese el numero al que le aplicara Googol: ");
            a = sc.nextDouble();
        }
        
        
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
                System.out.println("Opción invalida.");
                break;
        }

        sc.close();
    }
    
}
