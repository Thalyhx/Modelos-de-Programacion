/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aordenamiento.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author natha
 */
public class HeapSort implements AlgoritmoOrdenamiento{
    
    @Override
    public List<Integer> ordenar(List<Integer> lista) {
        
         List<Integer> listacopia = new ArrayList<>(lista);

        int tam = listacopia.size();

        for (int i = tam / 2 - 1; i >= 0; i--) {
            heapify(listacopia, tam, i);
        }

        for (int i = tam - 1; i > 0; i--) {

            int temp = listacopia.get(0);
            listacopia.set(0, listacopia.get(i));
            listacopia.set(i, temp);
            
            heapify(listacopia, i, 0);
        }

        return listacopia;
    }

    private void heapify(List<Integer> lista, int tam, int i) {
        int mayor = i; 
        int izquierda = 2 * i + 1; 
        int derecha = 2 * i + 2;   

        if (izquierda < tam && lista.get(izquierda) > lista.get(mayor)) {
            mayor = izquierda;
        }

        if (derecha < tam && lista.get(derecha) > lista.get(mayor)) {
            mayor = derecha;
        }

        if (mayor != i) {
            int temp = lista.get(i);
            lista.set(i, lista.get(mayor));
            lista.set(mayor, temp);

            heapify(lista, tam, mayor);
        }
    }
    
}
