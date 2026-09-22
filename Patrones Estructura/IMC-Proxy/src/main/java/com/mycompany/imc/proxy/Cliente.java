/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imc.proxy;

import java.util.Scanner;

/**
 *
 * @author natha
 */
public class Cliente {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el peso en Kg");
        double peso=sc.nextDouble();
        System.out.println("Ingrese la estatura en m");
        double estatura=sc.nextDouble();
        
        Imc calcImc = new Proxy();
        double imc = calcImc.calcularImc(peso, estatura);
               System.out.println("El imc es: "+imc);
    }
}
