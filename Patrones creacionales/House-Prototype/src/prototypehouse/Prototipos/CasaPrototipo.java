/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototypehouse.Prototipos;

import prototypehouse.Casa;

/**
 *
 * @author natha
 */
public class CasaPrototipo extends Casa implements Prototipo{

        
    //Constructor

    
    public CasaPrototipo() {
        super();
    }
    
    @Override
    public Object clonar() {
        
        CasaPrototipo casaClon = new CasaPrototipo();
        
        for (CirculoPrototipo c : this.getCirculos()) {
            casaClon.agregarCirculo((CirculoPrototipo) c.clonar());
        }
        
        for (RectanguloPrototipo r : this.getRectangulos()) {
            casaClon.agregarRectangulo((RectanguloPrototipo) r.clonar());
        }
        
        for (TrianguloPrototipo t : this.getTriangulos()) {
            casaClon.agregarTriangulo((TrianguloPrototipo) t.clonar());
        }
        
        return casaClon;
    }
    
}
