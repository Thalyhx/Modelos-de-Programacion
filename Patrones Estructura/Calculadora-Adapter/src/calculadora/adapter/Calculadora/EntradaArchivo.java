/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora.adapter.Calculadora;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import javax.swing.JFileChooser;

/**
 *
 * @author 
 */
public class EntradaArchivo implements Entrada{
    
    private  JFileChooser buscador = new JFileChooser();


    
    @Override
    public String leer() {
        
        
        int resultado = buscador.showOpenDialog(null);
        if (resultado == JFileChooser.APPROVE_OPTION) {
            File archivo = buscador.getSelectedFile();
            try {
                return Files.readString(archivo.toPath());
            } catch (IOException e) {
                return "Error " + e.getMessage();
            }
        }

        return "Error";
    }
    
}
        
