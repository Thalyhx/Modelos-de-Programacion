/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones.command.Prueba;

import operaciones.command.Calculadora;
import operaciones.command.OperacionDividir;

/**
 *
 * @author natha
 */
public class PruebaDividir {
    
    public static void main(String[]Args) {
        System.out.println("--- PRUEBA  Operacion Dividir ---");
        Calculadora calc = new Calculadora();
        calc.setActual(50.0);
        OperacionDividir dividir = new OperacionDividir(calc);

        double resultado = dividir.operar(calc.getActual(), 2.0);
        System.out.println("Ejecutar operar(50.0, 2.0) -> Resultado: " + resultado + "\n| Calculadora actual: " + calc.getActual());

        double deshecho = dividir.deshacer();
        System.out.println("\nEjecutar deshacer() -> Estado restaurado en calculadora: " + deshecho);
        

    }
    
}
