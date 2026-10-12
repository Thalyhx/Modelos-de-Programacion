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
public class QuickSort implements AlgoritmoOrdenamiento{

@Override
    public List<Integer> ordenar(List<Integer> lista) {
        
       List<Integer> listacopia = new ArrayList<>(lista);
       
        if (listacopia == null || listacopia.size() <= 1) {
            return listacopia;
        }

        quickSort(listacopia, 0, listacopia.size() - 1);
        
        return listacopia;
    }

    private void quickSort(List<Integer> lista, int inicio, int fin) {
        if (inicio < fin) {
            int pivote = particion(lista, inicio, fin);

            quickSort(lista, inicio, pivote - 1);
            quickSort(lista, pivote + 1, fin);
        }
    }

    public int particion(List<Integer> lista, int primero, int ultimo) {

        int pivote = lista.get(ultimo);
        
        int i = (primero - 1);

        for (int j = primero; j < ultimo; j++) {

            if (lista.get(j) <= pivote) {
                i++;
                int temp = lista.get(i);
                lista.set(i, lista.get(j));
                lista.set(j, temp);
            }
        }

        int temp = lista.get(i + 1);
        lista.set(i + 1, lista.get(ultimo));
        lista.set(ultimo, temp);

        return i + 1;
    }
    
}
