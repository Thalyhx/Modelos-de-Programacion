/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora.adapter.Calculadora;

import javax.swing.JOptionPane;


/**
 *
 * @author 
 */
public class EntradaSwing implements Entrada{

    @Override
    public String leer() {
        
        String entrada = JOptionPane.showInputDialog("Digite un numero: "); 
       return entrada;
        }
}