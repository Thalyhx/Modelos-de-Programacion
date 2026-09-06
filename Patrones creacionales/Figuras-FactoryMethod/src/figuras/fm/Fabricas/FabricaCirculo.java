/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras.fm.Fabricas;

import figuras.fm.Circulo;
import figuras.fm.Figura;

/**
 *
 * @author natha
 */
public class FabricaCirculo implements FabricaFigura{

    @Override
    public Figura crearFigura() {
        return new Circulo();
    }
    
}
