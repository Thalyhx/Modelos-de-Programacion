/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora.adapter.Calculadora;

import java.io.IOException;
import java.nio.file.Files;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class SalidaArchivo implements Salida{

    @Override
    public void salidaNumero(int resultado) {
       
        JFileChooser buscador = new JFileChooser();
        
        if (buscador.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                Files.writeString(buscador.getSelectedFile().toPath(), String.valueOf(resultado));
            } catch (IOException e) {
                System.out.println("Error " + e.getMessage());
            }
        }
    }

        @Override
        public void salidaTexto(String texto) {
            JOptionPane.showMessageDialog(null, texto);
        }
        
    }

