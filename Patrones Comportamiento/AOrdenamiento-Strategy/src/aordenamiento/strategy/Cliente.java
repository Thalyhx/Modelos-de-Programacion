/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aordenamiento.strategy;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author natha
 */
public class Cliente {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Ordenamiento de listas ---");
        
        int tam=0;
        while(tam==0){
           System.out.println("Ingrese el tamano: ");
            try{
            tam=sc.nextInt();

            }catch(InputMismatchException e){
                System.out.println("Error: el tamano debe ser un numero entero");
                sc.next();
            }
            

        }
        sc.close();
        
        FabricaSimpleEstrategia  objFabrica = new FabricaSimpleEstrategia();
        List<Integer> lista = objFabrica.listaAleatoria(tam,0,1000);
        
        AlgoritmoOrdenamiento objAlgoritmo = objFabrica.crearAlgoritmo(tam);
        Contexto objContexto = new Contexto(objAlgoritmo);
        List<Integer> listaOrdenada =objContexto.OrdenarLista(lista);
        
        System.out.println("\nAlgoritmo de Ordenamiento usado: "+objAlgoritmo.getClass().getSimpleName());
                
        System.out.println("\nLista Aleatoria Generada: \n"+lista);

        System.out.println("\n\nLista Ordenada:\n"+listaOrdenada);
    }
    
}
