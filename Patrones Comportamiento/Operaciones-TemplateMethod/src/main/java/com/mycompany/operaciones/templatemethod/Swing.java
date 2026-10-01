/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.operaciones.templatemethod;

import javax.swing.JOptionPane;

/**
 *
 * @author natha
 */
public class Swing implements Vista{

    @Override
    public String entrada() {
        String entrada= JOptionPane.showInputDialog("Entrada: ");
        return entrada;
    }

    @Override
    public void salida(String mensaje) {
        JOptionPane.showMessageDialog(null,mensaje);
    }
    
}
