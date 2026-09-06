/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora.adapter.Calculadora;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class EntradaConsola implements Entrada{
    
        Scanner scanner = new Scanner(System.in);
    
    @Override
    public String leer(){
        
        String entrada = scanner.nextLine();
        return entrada;
       
    }
    
}

