/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras.fm.Fabricas;

import figuras.fm.Figura;
import figuras.fm.Triangulo;

/**
 *
 * @author natha
 */
public class FabricaTriangulo implements FabricaFigura{

    @Override
    public Figura crearFigura() {
        return new Triangulo();
    }
    
}
