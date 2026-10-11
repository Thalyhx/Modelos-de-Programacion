/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aordenamiento.estrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author natha
 */
public class FabricaSimpleEstrategia {
    
    public AlgoritmoOrdenamiento crearAlgoritmo(int tam){
        if (tam < 10) {
            return new BubbleSort();     
        } else if (tam < 50) {
            return new SelectionSort(); 
        } else if (tam < 1_000) {
            return new InsertionSort();   
        } else if (tam < 10_000) {
            return new QuickSort();      
        } else if (tam < 50_000) {
            return new HeapSort();        
        } else {
            return new MergeSort();    
        }
    }
    
    public static List<Integer> listaAleatoria(int tam, int min, int max) {
        Random random = new Random();
        List<Integer> lista = new ArrayList<>(tam);

        for (int i = 0; i < tam; i++) {
            lista.add(random.nextInt(max - min) + min);
        }

        return lista;
    }
    
}
