package casa.composite;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author natha
 */
public abstract class Estructura {
    protected int[] coordenadas  = new int [2];

    public Estructura(int[] coordenadas) {
        this.coordenadas[0]=coordenadas[0];
        this.coordenadas[1]=coordenadas[1];
        
    }
    
    public abstract void mover(int[] coordenadas);
    public abstract void mostrar();
    public abstract String getNombre();
    
    //Getters

    public int[] getCoordenadas() {
        return coordenadas;
    }
    
    
            
}
