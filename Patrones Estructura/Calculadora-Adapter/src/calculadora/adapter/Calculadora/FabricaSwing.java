/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora.adapter.Calculadora;

/**
 *
 * @author 
 */
public class FabricaSwing implements FabricaEntradaSalida{

    @Override
    public Entrada crearEntrada() {
        return (Entrada) new EntradaSwing();
    }
    @Override
    public Salida crearSalida() {
        return (Salida) new SalidaSwing();
    }
        
}

