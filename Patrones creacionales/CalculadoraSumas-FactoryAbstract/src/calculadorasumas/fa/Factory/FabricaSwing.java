/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadorasumas.fa.Factory;

import calculadorasumas.fa.View.Entrada;
import calculadorasumas.fa.View.EntradaSwing;
import calculadorasumas.fa.View.Salida;
import calculadorasumas.fa.View.SalidaSwing;

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

