/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.adapter;

import calculadora.adapter.Calculadora.FabricaSwing;
import calculadora.adapter.Calculadora.FabricaConsola;
import calculadora.adapter.Calculadora.FabricaArchivo;
import calculadora.adapter.Calculadora.FabricaEntradaSalida;
import calculadora.adapter.Calculadora.Multiplicacion;
import calculadora.adapter.Calculadora.Operacion;
import calculadora.adapter.Calculadora.Suma;

import javax.swing.JOptionPane;

/**
 *
 * @author natha
 */
public class Main {
    
    public static void main(String[] args) {
    
        String opcion = JOptionPane.showInputDialog(
            "¿Qué interfaz desea usar digite el n° ?\n1. Consola\n2. Swing \n3. Archivo"
        );
        String calculo = JOptionPane.showInputDialog(
            "¿Qué operacion desea hacer digite el n° ?\n1. Suma\n2. Multiplicacion"
        );
        
        FabricaEntradaSalida fabrica;
        Operacion objOperacion;
        if ("1".equals(opcion)){
            fabrica = new FabricaConsola();
        }
        else if ("2".equals(opcion)) {
            fabrica = new FabricaSwing();
        }
        else{
            fabrica = new FabricaArchivo();
        }
        
         if ("1".equals(calculo)){
            objOperacion = new Suma();
        }
        else  {
            objOperacion = new Multiplicacion();
        }
         
     Cliente cliente = new Cliente(fabrica, objOperacion);
     cliente.enviarTexto(" ----- Calculadora -----");
     int resultado = cliente.calcular();
     cliente.enviarTexto(" Resultado:");
     cliente.enviarNumero(resultado);
    }
}
