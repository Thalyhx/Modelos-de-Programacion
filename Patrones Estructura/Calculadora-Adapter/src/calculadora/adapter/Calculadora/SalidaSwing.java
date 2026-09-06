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
public class SalidaSwing implements Salida{

    @Override
    public void salidaNumero(int resultado) {
        
        JOptionPane.showMessageDialog(null, resultado);

    }

    @Override
    public void salidaTexto(String texto) {
        
        JOptionPane.showMessageDialog(null, texto);

    }
    
}
