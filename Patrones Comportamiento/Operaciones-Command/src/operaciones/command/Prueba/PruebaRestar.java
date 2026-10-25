/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones.command.Prueba;

import operaciones.command.Calculadora;
import operaciones.command.OperacionRestar;

/**
 *
 * @author natha
 */
public class PruebaRestar {
    
    public static void main(String[] args) {
       
        System.out.println("--- Operacion  Restar ---");
        Calculadora calc = new Calculadora();
        calc.setActual(20.0); 
        OperacionRestar restar = new OperacionRestar(calc);

        double resultado = restar.operar(calc.getActual(), 8.0);
        System.out.println("Ejecutar operar(20.0, 8.0) -> Resultado: " + resultado + "\n | Calculadora actual: " + calc.getActual());

        double deshecho = restar.deshacer();
        System.out.println("Ejecutar deshacer() ->\n Estado restaurado en calculadora: " + deshecho);
        
    }
    
}
