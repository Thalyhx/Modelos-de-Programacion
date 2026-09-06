/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author natha
 */
public class Compuesto extends Estructura{
    
    private String nombre;
    private List<Estructura> componentes = new ArrayList<>();

    public Compuesto(String nombre, int[] coordnedas) {
        super(coordnedas);
        this.nombre = nombre;
    }

        
    public void agregar(Estructura componente) {
        componentes.add(componente);
        System.out.println("Agregando  el : " + componente.getNombre() + "' a "+this.nombre +" en (" + coordenadas[0] + ", " + coordenadas[1] + ")");
        componente.mover(this.coordenadas);
    }

    public void retirar(Estructura componente) {
        componentes.remove(componente);
    }

    @Override
    public void mover(int[] coordenadas) {
        System.out.println("\nMoviendo el : " + nombre + "' a (" + coordenadas[0] + ", " + coordenadas[1] + ")");
        this.coordenadas[0]=coordenadas[0];
        this.coordenadas[1]=coordenadas[1];
        for (Estructura componente :componentes){
            componente.mover(coordenadas);
        }
    }

    @Override
    public void mostrar() {
            System.out.println("\n la estructura: " + nombre+ " esta en (" + coordenadas[0] + ", " + coordenadas[1] + ")");
        for (Estructura componente : componentes) {
            componente.mostrar();
        }
    }
    
       @Override
        public String getNombre() {
        return nombre;
        
    }

}
