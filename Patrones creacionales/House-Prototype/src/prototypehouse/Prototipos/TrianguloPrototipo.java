/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototypehouse.Prototipos;

import prototypehouse.Triangulo;

/**
 *
 * @author natha
 */
public class TrianguloPrototipo extends Triangulo implements Prototipo{

    

    public TrianguloPrototipo() {
        super();
    }

    public TrianguloPrototipo(String color, String borde, double lado1, double lado2, double lado3) {    
        super(color, borde, lado1, lado2, lado3);
    }

    //Constructor
    public TrianguloPrototipo(String color, String borde, double lado1, double lado2) {
        super(color, borde, lado1, lado2);
    }

    @Override
    public Object clonar() {
        TrianguloPrototipo triangClon = new TrianguloPrototipo();
        triangClon.setColor(this.getColor());
        triangClon.setBorde(this.getBorde());
        triangClon.setLado1(this.getLado1());
        triangClon.setLado2(this.getLado2());
        triangClon.setLado3(this.getLado3());
        return triangClon;
    }
    
    
    
}
