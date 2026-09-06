/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototypehouse.Pruebas;

import java.util.Scanner;
import prototypehouse.Prototipos.CuadradoPrototipo;

/**
 *
 * @author natha
 */
public class PruebaClienteCuadrado {
    
    public static void main( String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("-- Cuadrado --  :");
        System.out.print("Ingrese el color: ");
        String color = sc.nextLine();
        System.out.print("Ingrese borde: ");
        String borde = sc.nextLine();
        System.out.print("Ingrese el lado: ");
        double lado = sc.nextDouble();
        sc.nextLine();
        
        CuadradoPrototipo cuad = new CuadradoPrototipo(color, borde, lado);
        
        CuadradoPrototipo cuadClon = (CuadradoPrototipo) cuad.clonar();
                        
        System.out.println("\n");
        System.out.println("Cuadrado original: ");
        System.out.println(cuad.toString());

        System.out.println("Cuadrado clon: ");
        System.out.println(cuadClon.toString());
        
        sc.close();
     }
    
}
