/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorasumas.fa;

import calculadorasumas.fa.Factory.FabricaSwing;
import calculadorasumas.fa.Factory.FabricaConsola;
import calculadorasumas.fa.Factory.FabricaArchivo;
import calculadorasumas.fa.Factory.FabricaEntradaSalida;
import calculadorasumas.fa.Model.Multiplicacion;
import calculadorasumas.fa.Model.Operacion;
import calculadorasumas.fa.Model.Suma;

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
     cliente.enviarTexto(" Digite un numero");
     int a = Integer.parseInt(cliente.leer());
     cliente.enviarTexto(" Digite otro numero");
     int b = Integer.parseInt(cliente.leer());
     int resultado= cliente.calcular(a, b);
     cliente.enviarTexto(" Resultado:");
     cliente.enviarNumero(resultado);
    }
}
