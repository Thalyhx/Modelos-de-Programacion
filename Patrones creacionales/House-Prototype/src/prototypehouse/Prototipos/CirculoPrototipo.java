/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototypehouse.Prototipos;

import prototypehouse.Circulo;

/**
 *
 * @author natha
 */
public class CirculoPrototipo extends Circulo implements Prototipo{

    //Constructores
    
    public CirculoPrototipo(String color, String borde, double radio) {
        super(color, borde, radio);
    }

    public CirculoPrototipo() {
        super();
    }
    

    @Override
    public Object clonar() {
        CirculoPrototipo circuloClon = new CirculoPrototipo();
        circuloClon.setColor(this.getColor());
        circuloClon.setBorde(this.getBorde());
        circuloClon.setRadio(this.getRadio());
        return circuloClon;
    }
    
}
