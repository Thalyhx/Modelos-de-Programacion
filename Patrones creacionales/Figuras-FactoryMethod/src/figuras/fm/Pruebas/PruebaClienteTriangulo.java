/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras.fm.Pruebas;

import figuras.fm.Cliente;
import figuras.fm.Fabricas.FabricaFigura;
import figuras.fm.Fabricas.FabricaTriangulo;
import java.util.Scanner;

/**
 *
 * @author natha
 */
public class PruebaClienteTriangulo {
    
        public static void main(String[]Args){
        FabricaFigura fabrica = new FabricaTriangulo();
        Cliente objCliente = new Cliente(fabrica);
        
        
        System.out.println("Digite la cantidad de medidas: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double [] parametros = new double[num];
        
        for (int i=0; i<num; i++){
            System.out.println("Digite el valor de la medida  " + (i+1));
            parametros[i] = sc.nextDouble();
        }
        
        
        double resultado = objCliente.calcularArea(parametros);
        System.out.println("El area del Triangulo es: "+resultado);
                
        }      
    
}
