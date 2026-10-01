/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.operaciones.templatemethod;

import java.util.Scanner;

/**
 *
 * @author natha
 */
public class Consola implements Vista{
    
    Scanner sc = new Scanner(System.in);

    @Override
    public String entrada() {
          System.out.println("Entrada: ");
           return sc.nextLine();
    }

    @Override
    public void salida( String mensaje) {
        System.out.println(mensaje);
   }
    
}
