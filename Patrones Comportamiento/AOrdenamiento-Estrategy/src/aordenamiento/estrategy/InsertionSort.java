/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aordenamiento.estrategy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author natha
 */
public class InsertionSort implements AlgoritmoOrdenamiento{

    @Override
    public List<Integer> ordenar(List<Integer> lista) {
        
       List<Integer> listacopia = new ArrayList<>(lista);
        
        int tam = listacopia.size();

        for (int i = 1; i < tam; i++) {
            int num = listacopia.get(i);
            int j = i - 1;

            while (j >= 0 && listacopia.get(j) > num) {
                listacopia.set(j + 1, listacopia.get(j));
                j--;
            }
            listacopia.set(j + 1, num);
        }

        return listacopia;
    }
    
}
