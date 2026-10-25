/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones.command.Prueba;

import operaciones.command.Calculadora;
import operaciones.command.OperacionGoogol;

/**
 *
 * @author natha
 */
public class PruebaGoogol {
    
    public static void main(String[] args) {
        
        System.out.println("---  Operacion Googol ---");
        Calculadora calc = new Calculadora();
        calc.setActual(7.0);
        OperacionGoogol googol = new OperacionGoogol(calc);

        double resultado = googol.operar(calc.getActual(), 0.0);
        System.out.println("Ejecutar operar(7.0, 0.0) con Googol -> Resultado: " + resultado);

        double deshecho = googol.deshacer();
        System.out.println("\nEjecutar deshacer() -> Estado restaurado en calculadora: " + deshecho);
        
    }
    
}
