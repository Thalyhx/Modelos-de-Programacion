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
public class SelectionSort implements AlgoritmoOrdenamiento{

    @Override
    public List<Integer> ordenar(List<Integer> lista) {
       
        List<Integer> listacopia = new ArrayList<>(lista);
        
        int tam= listacopia.size();

       for (int i=0;i<tam-1;i++){
           int min=i;
           
           for(int j=i+1; j<tam;j++){
               if (listacopia.get(j)<listacopia.get(min)) min=j;
           }
       
       if(min !=i){
       int temp=listacopia.get(i);
       listacopia.set(i, listacopia.get(min));
       listacopia.set(min, temp);
       }
       }
        
       return listacopia;
    }
    
}
