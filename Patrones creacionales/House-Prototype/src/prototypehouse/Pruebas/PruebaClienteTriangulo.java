/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototypehouse.Pruebas;

import java.util.Scanner;
import prototypehouse.Prototipos.TrianguloPrototipo;

/**
 *
 * @author natha
 */
public class PruebaClienteTriangulo {
    
     public static void main( String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("-- Triangulo --  :");
        System.out.print("Ingrese el color: ");
        String colorTecho = sc.nextLine();
        System.out.print("Ingrese borde: ");
        String bordeTecho = sc.nextLine();
        System.out.print("Ingrese el lado 1: ");
        double lado1 = sc.nextDouble();
        System.out.print("Ingrese el lado 2: ");
        double lado2 = sc.nextDouble();
        System.out.print("Ingrese el lado 3: ");
        double lado3 = sc.nextDouble();
        sc.nextLine();
        
        TrianguloPrototipo triang = new TrianguloPrototipo(colorTecho,bordeTecho,lado1,lado2,lado3);
        
         TrianguloPrototipo triangClon = (TrianguloPrototipo) triang.clonar();
                        
                        System.out.println("\n");
                        System.out.println("Triangulo original: ");
                        System.out.println(triang.toString());

                        System.out.println("Triangulo clon: ");
                        System.out.println(triangClon.toString());
        
     }
}
