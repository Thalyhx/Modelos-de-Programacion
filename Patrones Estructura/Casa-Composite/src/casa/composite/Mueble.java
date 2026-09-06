/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa.composite;

/**
 *
 * @author natha
 */
public class Mueble extends Estructura{
    
    private String nombre;

    public Mueble(String nombre, int[] coordenadas) {
        super(coordenadas);
        this.nombre = nombre;
    }
    

    @Override
    public void mover(int[] coord) {
        coordenadas[0]=coord[0];
        coordenadas[1]=coord[1];
        System.out.println("  -> Moviendo mueble '" + nombre + "' a nuevas coordenadas (" + coord[0] + ", " + coord[1] + ")");
    }

    @Override
    public void mostrar() {
        System.out.println("  - Mueble: " + nombre + " en (" + coordenadas[0] + ", " + coordenadas[1] + ")");
    }
    
    @Override
    public String getNombre() {
        return nombre;
    }

}
