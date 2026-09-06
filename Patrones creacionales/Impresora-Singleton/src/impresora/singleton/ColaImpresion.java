/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impresora.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author natha
 */
public class ColaImpresion {
    
    private static List<ColaImpresion> instances = new ArrayList<>();
    private static int numCola =0;
    private static final int maxArchivos = 3;
    private static List<Archivo> archivos= new ArrayList<>();
    
    private ColaImpresion(Archivo arch){
        numCola+=1;
        System.out.println("Adregando archivo a la posicion : "+numCola+"de la cola de impresion\n");
    }
    
    public  static ColaImpresion getInstance(Archivo archivo){
        archivos.add(archivo);
        if (instances.size() < maxArchivos){
            ColaImpresion nueva = new ColaImpresion(archivo);
            instances.add(nueva);
            return nueva;
        } else 
        System.out.println("Cola llena, reutilizando la ultima instancia ");
        return  instances.get(maxArchivos-1);
        }
      
}
