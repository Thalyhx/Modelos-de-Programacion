/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototypehouse.Pruebas;

import java.util.Scanner;
import prototypehouse.Prototipos.CirculoPrototipo;

/**
 *
 * @author natha
 */
public class PruebaClienteCirculo {
    
    public static void main( String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("-- Circulo --  :");
        System.out.print("Ingrese el color: ");
        String color = sc.nextLine();
        System.out.print("Ingrese borde: ");
        String borde = sc.nextLine();
        System.out.print("Ingrese el radio: ");
        double radio = sc.nextDouble();
        sc.nextLine();
        
        CirculoPrototipo circ = new CirculoPrototipo(color, borde, radio);
        
        CirculoPrototipo circClon = (CirculoPrototipo) circ.clonar();
                        
        System.out.println("\n");
        System.out.println("Circulo original: ");
        System.out.println(circ.toString());

        System.out.println("Circulo clon: ");
        System.out.println(circClon.toString());
        
        sc.close();
     }
    
}
