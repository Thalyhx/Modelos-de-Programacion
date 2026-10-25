/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones.command.Prueba;

import operaciones.command.Calculadora;
import operaciones.command.OperacionMultiplicar;

/**
 *
 * @author natha
 */
public class PruebaMultiplicar {
    
    public static void main(String[] args) {
        
        System.out.println("--- Operacion Multiplicar ---");
        Calculadora calc = new Calculadora();
        calc.setActual(5.0);
        OperacionMultiplicar multiplicar = new OperacionMultiplicar(calc);

        double resultado = multiplicar.operar(calc.getActual(), 4.0);
        System.out.println("Ejecutar operar(5.0, 4.0) -> Resultado: " + resultado + " \n| Calculadora actual: " + calc.getActual());

        double deshecho = multiplicar.deshacer();
        System.out.println("\nEjecutar deshacer() -> Estado restaurado en calculadora: " + deshecho);
        
    }
    
}
