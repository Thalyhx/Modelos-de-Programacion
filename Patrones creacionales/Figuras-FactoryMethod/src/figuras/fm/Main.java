/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras.fm;

import figuras.fm.Fabricas.FabricaCirculo;
import figuras.fm.Fabricas.FabricaFigura;
import figuras.fm.Fabricas.FabricaRectangulo;
import figuras.fm.Fabricas.FabricaTriangulo;
import java.util.Scanner;

/**
 *
 * @author natha
 */
public class    Main {
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("------------ Area de Figuras -----------");
        System.out.println("Opciones: \n 1.Rectangulo \n 2.Circulo \n 3.Triangulo");
        System.out.println("ingrese el no de la figura");
        int opcion = sc.nextInt();
        
        FabricaFigura fabrica;
        
        if (opcion==1){
            fabrica = new FabricaRectangulo();
        }else if(opcion ==2){
            fabrica = new FabricaCirculo();
        }else if (opcion ==3){
            fabrica = new FabricaTriangulo();
        }else{
            throw new IllegalArgumentException("Error");
        }
        
        Cliente objCliente = new Cliente(fabrica);
        
        System.out.println("Digite la cantidad de medidas: ");
        int num = sc.nextInt();
        
        double [] parametros = new double[num];
        
        for (int i=0; i<num; i++){
            System.out.println("Digite el valor de la medida  " + (i+1));
            parametros[i] = sc.nextDouble();
        }
        
        double resultado = objCliente.calcularArea(parametros);
        
        System.out.println("El area es: " + resultado);
    }
    
}
