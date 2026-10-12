/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aordenamiento.strategy;

import java.util.List;

/**
 *
 * @author natha
 */
public class Contexto {
    
    private AlgoritmoOrdenamiento algoritmo;
    
    //Constructor 
    
    public Contexto(AlgoritmoOrdenamiento algoritmo) {
        this.algoritmo = algoritmo;
    }   
    
    /**
     *
     * @return
     */
    public List<Integer> OrdenarLista(List<Integer> lista){
        return algoritmo.ordenar(lista);
    }
    
    //Setter

    public void setAlgoritmo(AlgoritmoOrdenamiento algoritmo) {
        this.algoritmo = algoritmo;
    }
    
    
}
