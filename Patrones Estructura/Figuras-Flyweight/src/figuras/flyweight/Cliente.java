/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras.flyweight;

/**
 *
 * @author natha
 */

public class Cliente  {
public static void main(String[] args) {
        int ancho = 5; // Estado extrínseco
        int alto = 10;


        FiguraFlyweight f1 = FiguraFactory.obtenerFigura("Circulo", "Vertical", "Morado","Amarillo");
        f1.crearFigura(0, 0, ancho,alto); 

        FiguraFlyweight f2 = FiguraFactory.obtenerFigura("Circulo", "Vertical", "Morado","Morado");
        f2.crearFigura(50, 0, ancho,alto); 

        FiguraFlyweight f3 = FiguraFactory.obtenerFigura("Rombo", "Horizontal", "Amarillo","Morado");
        f3.crearFigura(0, 50, ancho,alto); 

        FiguraFlyweight f4 = FiguraFactory.obtenerFigura("Rombo", "Horizontal", "Amarillo","Morado");
        f4.crearFigura(50, 50, ancho, alto); 

        FiguraFlyweight f5 = FiguraFactory.obtenerFigura("Circulo", "Horizontal", "Morado", "Amarillo");
        f5.crearFigura(100, 0, ancho, alto);  

        FiguraFlyweight f6 = FiguraFactory.obtenerFigura("Circulo", "Horizontal", "Morado", "Amarillo");
        f6.crearFigura(150, 0, ancho, alto); 

        FiguraFlyweight f7 = FiguraFactory.obtenerFigura("Rombo", "Vertical", "Morado", "Morado");
        f7.crearFigura(100, 50, ancho, alto);  

        FiguraFlyweight f8 = FiguraFactory.obtenerFigura("Rombo", "Vertical", "Morado", "Morado");
        f8.crearFigura(150, 50, ancho, alto); 
        
        FiguraFlyweight figuraEspecial = new FiguraUnshared("Borde con diseño único", 4);
        figuraEspecial.crearFigura(100, 100, ancho, alto);

        System.out.println("\n----------------------------------------");
        System.out.println("Objetos unicos: 1");
        System.out.println("Objetos compartidos concretos: 8");
        System.out.println("Objetos reales concretos creados en memoria: " + FiguraFactory.getCantidadFiguras());
        System.out.println("----------------------------------------");
    }
}
