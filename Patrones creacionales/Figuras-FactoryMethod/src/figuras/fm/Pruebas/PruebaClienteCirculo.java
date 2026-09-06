/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras.fm.Pruebas;

import figuras.fm.Cliente;
import figuras.fm.Fabricas.FabricaCirculo;
import figuras.fm.Fabricas.FabricaFigura;
import java.util.Scanner;

/**
 *
 * @author natha
 */
public class PruebaClienteCirculo {
    
        public static void main(String[]Args){
        FabricaFigura fabrica = new FabricaCirculo();
        Cliente objCliente = new Cliente(fabrica);
        
        
        double[] parametros=new double[1];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio:");
        parametros[0] = sc.nextDouble();
        
        double resultado = objCliente.calcularArea(parametros);
        System.out.println("El area del Circulo es: "+resultado);
                
        }      
    
}
