/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buffered.builder;

import java.io.File;
import javax.swing.JFileChooser;


/**
 *
 * @author natha
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFileChooser selector = new JFileChooser();    
        selector.setDialogTitle("archivo de entrada reader");
        int seleccionLectura = selector.showOpenDialog(null);
        
        if (seleccionLectura == JFileChooser.APPROVE_OPTION) {
            File archivoEntrada = selector.getSelectedFile();
            String rutaEntrada = archivoEntrada.getAbsolutePath();
            
            try {

                BuilderReader objReaderBuilder = new BuilderReader();
                
                Director objDirector = new Director(objReaderBuilder);
                
                objDirector.construir("avanzado", rutaEntrada);
                

                BufferedReader bufferedReader = objReaderBuilder.getBuffered(); 
                
                System.out.println("BufferedReader construido: " + rutaEntrada);
                
                bufferedReader.imprimirContenido();
                
                selector.setDialogTitle("destino de salida Writer");
                int seleccionEscritura = selector.showSaveDialog(null);
                
                if (seleccionEscritura == JFileChooser.APPROVE_OPTION) {
                    File archivoSalida = selector.getSelectedFile();
                    String rutaSalida = archivoSalida.getAbsolutePath();
                    
                    BuilderWriter objWriterBuilder = new BuilderWriter();
                    objDirector.changeBuilder(objWriterBuilder);
                    objDirector.construir("simple", rutaSalida);
                    
                    BufferedWriter bufferedWriter = objWriterBuilder.getBuffered();
                    System.out.println("BufferedWriter construido : " + rutaSalida);
                }
                


                
            } catch (Exception e) {
                System.out.println("error en construcción: " + e.getMessage());
            }
        } else {
            System.out.println("Error");
        }
        
    }
    
}
