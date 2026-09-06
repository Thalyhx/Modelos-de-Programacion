/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototypehouse;

import java.util.Scanner;
import prototypehouse.Prototipos.CasaPrototipo;
import prototypehouse.Prototipos.CirculoPrototipo;
import prototypehouse.Prototipos.CuadradoPrototipo;
import prototypehouse.Prototipos.RectanguloPrototipo;
import prototypehouse.Prototipos.TrianguloPrototipo;

/**
 *
 * @author natha
 */
public class Cliente {
    
    public static void main( String[] args){
    
        //Techo
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Configuracion el Techo (Triangulo) :");
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
        
        TrianguloPrototipo techo = new TrianguloPrototipo(colorTecho,bordeTecho,lado1,lado2,lado3);
        
        // Paredes
        
        System.out.println("\nConfiguracion Pared (Rectangulo) ");
        System.out.print("Ingrese el color: ");
        String colorPared = sc.nextLine();
        System.out.print("Ingrese el borde: ");
        String bordePared = sc.nextLine();
        System.out.print("Ingrese la base: ");
        double basePared = sc.nextDouble();
        System.out.print("Ingrese la altura: ");
        double alturaPared = sc.nextDouble();
        sc.nextLine(); 
        
        RectanguloPrototipo pared = new RectanguloPrototipo(colorPared, bordePared, basePared,alturaPared);
        
         //Ventana
    
        System.out.println("\nConfiguracion Ventana (Circulo)");
        System.out.print("Ingrese el color: ");
        String colorVentana = sc.nextLine();
        System.out.print("Ingrese el borde: ");
        String bordeVentana = sc.nextLine();
        System.out.print("Ingrese el radio: ");
        double radioVentana = sc.nextDouble();
        sc.nextLine(); 
        
        CirculoPrototipo ventana = new CirculoPrototipo(colorVentana, bordeVentana, radioVentana);
        
        // Puerta
        System.out.println("\nConfiguracion Puerta (Cuadrado)");
        System.out.print("Ingrese el color: ");
        String colorPuerta = sc.nextLine();
        System.out.print("Ingrese el borde: ");
        String bordePuerta = sc.nextLine();
        System.out.print("Ingrese el lado: ");
        double ladoPuerta = sc.nextDouble();
        sc.nextLine(); 
        
        CuadradoPrototipo puerta = new CuadradoPrototipo(colorPuerta, bordePuerta, ladoPuerta);
        

        CasaPrototipo casa = new CasaPrototipo(); 
        casa.agregarCirculo(ventana);
        casa.agregarRectangulo(pared);
        casa.agregarTriangulo(techo);
        casa.agregarCuadrado(puerta);
        
        System.out.println("\nCasa original: ");
        System.out.println(casa.toString());
        
        CasaPrototipo casaClon = (CasaPrototipo) casa.clonar();
        System.out.println("Casa clonada: ");
        System.out.println(casaClon.toString());
        
        //Modificaciones
        
        int opcion = 0;
        
        do {

            System.out.println("\n --  MENU Modificacion Clon  --");
            System.out.println("1. Modificar Techo (Color y dimencion)");
            System.out.println("2. Modificar Pared (Color y dimencion)");
            System.out.println("3. Modificar Ventana (Color y dimencion)");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                sc.nextLine();
                
                switch (opcion) {
                    case 1:
                        
                        System.out.print("Nuevo color: ");

                        casaClon.getTriangulos().get(0).setColor(sc.nextLine());
                        System.out.print("Nuevo valor de la base: ");
                        casaClon.getTriangulos().get(0).setLado1(sc.nextDouble());
                        sc.nextLine(); 
                        
                        System.out.println("\nCasa original: ");
                        System.out.println(casa.toString());
                        System.out.println("Casa clonada: ");
                        System.out.println(casaClon.toString());

                        break;
                        
                    case 2:

                        System.out.print("Nuevo color: ");
                        casaClon.getRectangulos().get(0).setColor(sc.nextLine());
                        System.out.print("Nueva altura: ");
                        casaClon.getRectangulos().get(0).setAltura(sc.nextDouble());
                        sc.nextLine(); 
                        
                        System.out.println("\nCasa original: ");
                        System.out.println(casa.toString());
                        System.out.println("Casa clonada: ");
                        System.out.println(casaClon.toString());
                        
                        break;
                        
                    case 3:

                        System.out.print("Nuevo color: ");
                        casaClon.getCirculos().get(0).setColor(sc.nextLine());
                        System.out.print("Nuevo radio: ");
                        casaClon.getCirculos().get(0).setRadio(sc.nextDouble());
                        sc.nextLine(); 
                        
                        System.out.println("\nCasa original: ");
                        System.out.println(casa.toString());
                        System.out.println("Casa clonada: ");
                        System.out.println(casaClon.toString());
                        
                        break;
                        
                    case 4:
                        System.out.println("\nSaliendo..");
                        break;
                        
                    default:
                        System.out.println("\nError.");
                }
            } else {
                System.out.println("\n Error, ingrese una opcion valida.");
                sc.next(); 
            }
            
        } while (opcion != 4);
        
       sc.close();
        
    }
}
