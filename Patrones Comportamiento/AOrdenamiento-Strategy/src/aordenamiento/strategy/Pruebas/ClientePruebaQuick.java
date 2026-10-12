/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aordenamiento.strategy.Pruebas;

import aordenamiento.strategy.AlgoritmoOrdenamiento;
import aordenamiento.strategy.Contexto;
import aordenamiento.strategy.FabricaSimpleEstrategia;
import aordenamiento.strategy.QuickSort;
import java.util.List;

/**
 *
 * @author natha
 */
public class ClientePruebaQuick {
    
     
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE ALGORITMO DE ORDENAMIENTO ===");
        
        int tam = 12;
     
        FabricaSimpleEstrategia fabrica = new FabricaSimpleEstrategia();
        List<Integer> lista = fabrica.listaAleatoria(tam, 1, 500);

        AlgoritmoOrdenamiento algoritmo = new QuickSort(); 

        Contexto contexto = new Contexto(algoritmo);
        List<Integer> listaOrdenada = contexto.OrdenarLista(lista);
        

        System.out.println("Algoritmo evaluado : " + algoritmo.getClass().getSimpleName());
        System.out.println("Lista Original     : " + lista);
        System.out.println("Lista Ordenada     : " + listaOrdenada);
        
    }
    
}
