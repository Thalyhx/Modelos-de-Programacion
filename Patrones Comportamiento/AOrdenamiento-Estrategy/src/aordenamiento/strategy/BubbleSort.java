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
public class BubbleSort implements AlgoritmoOrdenamiento{

    @Override
    public List<Integer> ordenar(List<Integer> lista) {
        
        List<Integer> listacopia = new ArrayList<>(lista);
        
        boolean intercambio;
        int tam=listacopia.size();
        
        for (int j=0; j<tam-1;j++){
            intercambio=false;
            
            for (int i=0; i<tam-1-j;i++){
                
                if (listacopia.get(i)>listacopia.get(i+1)){
                    
                    int temp=listacopia.get(i);
                    listacopia.set(i, listacopia.get(i+1));
                    listacopia.set(i+1, temp);
                    intercambio=true;
                }
            }
            
            if (!intercambio) break;    
            
        }
        return listacopia;
    }
    
}
