/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras.fm.Fabricas;

import figuras.fm.Rectangulo;



/**
 *
 * @author natha
 */
public class FabricaRectangulo implements FabricaFigura{
    
    @Override
    public Rectangulo crearFigura() {
        return new Rectangulo();
    }
    
}
