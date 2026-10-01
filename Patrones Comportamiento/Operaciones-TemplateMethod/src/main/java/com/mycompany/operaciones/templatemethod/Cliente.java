/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operaciones.templatemethod;

import javax.swing.JOptionPane;

/**
 *
 * @author natha
 */
public class Cliente {

    public static void main(String[] args) {
        
        String opcion = JOptionPane.showInputDialog("Ingrese la opcion de la vista: \n 1. Consola \n 2. Swing");
        
        while(!opcion .equals ("1") && !opcion.equals("2")){
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
                    opcion = JOptionPane.showInputDialog("Ingrese la opcion de la vista: \n 1. Consola \n 2. Swing");
         }     
        
        Vista vista = null;
        
        if(opcion.equals("1")){
                    vista = new Consola();
        }else if (opcion.equals("2")){
                    vista = new Swing();
        }
        
        String a = vista.entrada();
        String b = vista.entrada();
        
        Operacion opSuma = new Suma();
        vista.salida("Resultado de "+a+" + "+b);
        double suma = opSuma.templateMethod(a, b);
        vista.salida(String.valueOf(suma));
        
        Operacion opResta = new Resta();
        vista.salida("Resultado de "+a+" - "+b);
        double resta = opResta.templateMethod(a, b);
        vista.salida(String.valueOf(resta));
        
        Operacion opMultiplicacion = new Multiplicacion();
        vista.salida("Resultado de "+a+" * "+b);
        double multiplicacion = opMultiplicacion.templateMethod(a, b);
        vista.salida(String.valueOf(multiplicacion));
        
        Operacion opDivision = new Division();
        vista.salida("Resultado de "+a+" / "+b);
        try{
        double division = opDivision.templateMethod(a, b);
        vista.salida(String.valueOf(division));
        }catch(IllegalArgumentException e){System.out.println("Error en la Validacion de los numeros");}
        
        
        

    }
}
