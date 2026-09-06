/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototypehouse.Pruebas;

import java.util.Scanner;
import prototypehouse.Prototipos.RectanguloPrototipo;

/**
 *
 * @author natha
 */
public class PruebaClienteRectangulo {
    
    public static void main( String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("-- Rectangulo --  :");
        System.out.print("Ingrese el color: ");
        String color = sc.nextLine();
        System.out.print("Ingrese borde: ");
        String borde = sc.nextLine();
        System.out.print("Ingrese la base: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese la altura: ");
        double altura = sc.nextDouble();
        sc.nextLine();
        
        RectanguloPrototipo rect = new RectanguloPrototipo(color, borde, base, altura);
        
        RectanguloPrototipo rectClon = (RectanguloPrototipo) rect.clonar();
                        
        System.out.println("\n");
        System.out.println("Rectangulo original: ");
        System.out.println(rect.toString());

        System.out.println("Rectangulo clon: ");
        System.out.println(rectClon.toString());
        
        sc.close();
     }
    
}
