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
public class MergeSort implements AlgoritmoOrdenamiento{

    @Override
    public List<Integer> ordenar(List<Integer> lista) {
        
        List<Integer> listacopia = new ArrayList<>(lista);
        
        if (listacopia.size() <= 1) {
            return listacopia;
        }
        mergeSort(listacopia, 0, listacopia.size() - 1);
        return listacopia;

    }
    
    private void mergeSort(List<Integer> lista, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            mergeSort(lista, izquierda, medio);
            mergeSort(lista, medio + 1, derecha);

            merge(lista, izquierda, medio, derecha);
        }
    }

    private void merge(List<Integer> lista, int izquierda, int medio, int derecha) {
        int n1 = medio - izquierda + 1;
        int n2 = derecha - medio;

        List<Integer> listaIzq = new ArrayList<>(n1);
        List<Integer> listaDer = new ArrayList<>(n2);

        for (int i = 0; i < n1; i++) listaIzq.add(lista.get(izquierda + i));
        for (int j = 0; j < n2; j++) listaDer.add(lista.get(medio + 1 + j));

        int i = 0, j = 0, k = izquierda;
        while (i < n1 && j < n2) {
            if (listaIzq.get(i) <= listaDer.get(j)) {
                lista.set(k++, listaIzq.get(i++));
            } else {
                lista.set(k++, listaDer.get(j++));
            }
        }

        while (i < n1) lista.set(k++, listaIzq.get(i++));
        while (j < n2) lista.set(k++, listaDer.get(j++));
    }
    
}
