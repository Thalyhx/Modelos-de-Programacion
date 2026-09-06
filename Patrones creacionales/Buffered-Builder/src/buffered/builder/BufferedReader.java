/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buffered.builder;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/**
 *
 * @author natha
 */
public class BufferedReader {
    
    private InputStream input;
    private Reader reader;
    private char[] buffer;

    public BufferedReader(InputStream input, Reader reader, int bufferSize) {
        this.input = input;
        this.reader = reader;
        this.buffer = new char[bufferSize];
    }
    
    public void imprimirContenido() throws IOException {
        int caracter;
        System.out.println("Iniciando lectura");
        while ((caracter = this.reader.read()) != -1) {
            System.out.print((char) caracter);
        }
        System.out.println("\nlectura completa");
    }
    
    
}
