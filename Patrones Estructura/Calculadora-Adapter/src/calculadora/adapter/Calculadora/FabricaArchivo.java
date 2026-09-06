/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora.adapter.Calculadora;

import calculadora.adapter.Calculadora.Entrada;
import calculadora.adapter.Calculadora.EntradaArchivo;
import calculadora.adapter.Calculadora.Salida;
import calculadora.adapter.Calculadora.SalidaArchivo;

/**
 *
 * @author 
 */
public class FabricaArchivo implements FabricaEntradaSalida{

    @Override
    public Entrada crearEntrada() {
      return (Entrada) new EntradaArchivo();
    }

    @Override
    public Salida crearSalida() {
        return (Salida) new SalidaArchivo();
    }
        
}


