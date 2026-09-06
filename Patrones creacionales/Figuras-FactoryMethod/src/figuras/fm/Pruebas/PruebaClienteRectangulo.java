/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras.fm.Pruebas;

import figuras.fm.Cliente;
import figuras.fm.Fabricas.FabricaFigura;
import figuras.fm.Fabricas.FabricaRectangulo;
import java.util.Scanner;


/**
 *
 * @author natha
 */
public class PruebaClienteRectangulo {
    
    
    public static void main(String[]Args){
        FabricaFigura fabrica = new FabricaRectangulo();
        Cliente objCliente = new Cliente(fabrica);
        
        
        double[] parametros=new double[2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base:");
        parametros[0] = sc.nextDouble();
        System.out.println("Ingrese la altura:");
        parametros[1] = sc.nextDouble();
        
        double resultado = objCliente.calcularArea(parametros);
        System.out.println("El area del Rectangulo es: "+resultado);
                
        }      
    
}
