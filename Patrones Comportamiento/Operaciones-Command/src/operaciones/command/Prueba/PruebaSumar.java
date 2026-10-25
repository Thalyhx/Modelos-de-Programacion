/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones.command.Prueba;

import operaciones.command.Calculadora;
import operaciones.command.OperacionSumar;

/**
 *
 * @author natha
 */
public class PruebaSumar {
    
    public static void main(String[] args) {
        
        System.out.println("--- Operacion Sumar ---");
        Calculadora calc = new Calculadora();
        OperacionSumar sumar = new OperacionSumar(calc);
        calc.setActual(10.0);

        double resultado = sumar.operar(calc.getActual(), 5.0);
        System.out.println("Ejecutar operar(10.0, 5.0) -> Resultado: " + resultado + " \n| Calculadora actual: " + calc.getActual());

        double deshecho = sumar.deshacer();
        System.out.println("\nEjecutar deshacer() -> Estado restaurado en calculadora: " + deshecho);
        
    }
    
}
