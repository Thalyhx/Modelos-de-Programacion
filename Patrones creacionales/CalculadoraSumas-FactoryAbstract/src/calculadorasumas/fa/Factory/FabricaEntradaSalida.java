/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package calculadorasumas.fa.Factory;

import calculadorasumas.fa.View.Entrada;
import calculadorasumas.fa.View.Salida;

/**
 *
 * @author Nath
 */
public interface FabricaEntradaSalida {
    
    public Entrada crearEntrada();
    public Salida crearSalida();
    
}


