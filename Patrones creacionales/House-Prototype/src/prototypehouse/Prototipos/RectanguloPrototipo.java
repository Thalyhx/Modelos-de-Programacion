/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototypehouse.Prototipos;

import prototypehouse.Rectangulo;

/**
 *
 * @author natha
 */
public class RectanguloPrototipo extends Rectangulo implements Prototipo{
    
   //Constructor
    
    public RectanguloPrototipo() {
        super();
    }

    public RectanguloPrototipo(String color, String borde, double base, double altura) {
        super(color, borde, base, altura);
    }

    @Override
    public Object clonar() {
        RectanguloPrototipo recClon = new RectanguloPrototipo();
        recClon.setColor(this.getColor());
        recClon.setBorde(this.getBorde());
        recClon.setBase(this.getBase());
        recClon.setAltura(this.getAltura());
        return recClon;
    }
    
    
}
