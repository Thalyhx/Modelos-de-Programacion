/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras.flyweight;

/**
 *
 * @author natha
 */
public class FiguraUnshared implements FiguraFlyweight{
    
    private String detalle;
    private int grosorBorde ;
    
    public FiguraUnshared(String detalleUnico, int grosorBordeEspecial) {
        this.detalle = detalleUnico;
        this.grosorBorde = grosorBordeEspecial;
    }

    @Override
    public void crearFigura(int x, int y, int ancho, int alto) {
               System.out.println("Dibujando figura NO compartida en (" + x + ", " + y + ")");
    }
    
}
