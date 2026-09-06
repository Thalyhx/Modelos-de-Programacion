/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadorasumas.fa.Pruebas;

import calculadorasumas.fa.Cliente;
import calculadorasumas.fa.Factory.FabricaConsola;
import calculadorasumas.fa.Factory.FabricaEntradaSalida;
import calculadorasumas.fa.Model.Operacion;
import calculadorasumas.fa.Model.Suma;

/**
 *
 * @author natha
 */
public class PruebaClienteConsolaSuma {
    
        public static void main(String[] args){
        FabricaEntradaSalida fabrica = new FabricaConsola();
        Operacion suma = new Suma();
        Cliente cliente = new Cliente(fabrica,suma);
        
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
