/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aordenamiento.estrategy.Pruebas;

import aordenamiento.estrategy.AlgoritmoOrdenamiento;
import aordenamiento.estrategy.Contexto;
import aordenamiento.estrategy.FabricaSimpleEstrategia;
import aordenamiento.estrategy.HeapSort;
import java.util.List;

/**
 *
 * @author natha
 */
public class ClientePruebaHeap {
    
     
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE ALGORITMO DE ORDENAMIENTO ===");
        
        int tam = 12;
     
        FabricaSimpleEstrategia fabrica = new FabricaSimpleEstrategia();
        List<Integer> lista = fabrica.listaAleatoria(tam, 1, 500);

        AlgoritmoOrdenamiento algoritmo = new HeapSort(); 

        Contexto contexto = new Contexto(algoritmo);
        List<Integer> listaOrdenada = contexto.OrdenarLista(lista);
        

        System.out.println("Algoritmo evaluado : " + algoritmo.getClass().getSimpleName());
        System.out.println("Lista Original     : " + lista);
        System.out.println("Lista Ordenada     : " + listaOrdenada);
        
    }
}
