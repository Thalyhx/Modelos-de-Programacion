/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototypehouse.Prototipos;

import prototypehouse.Cuadrado;

/**
 *
 * @author natha
 */
public class CuadradoPrototipo extends Cuadrado implements Prototipo{
    
    //Constructores
    
    public CuadradoPrototipo() {
        super();
    }

    public CuadradoPrototipo(String color, String borde, double lado) {
        super(color, borde, lado);
    }

    @Override
    public Object clonar() {
        
        CuadradoPrototipo cuadClon = new CuadradoPrototipo();
        cuadClon.setColor(this.getColor());
        cuadClon.setBorde(this.getBorde());
        cuadClon.setLado(this.getLado());
        return cuadClon;

    }
    
}
