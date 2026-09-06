/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buffered.builder;

import java.io.OutputStream;
import java.io.Writer;

/**
 *
 * @author natha
 */
public class BufferedWriter {
    
    private OutputStream ouput;
    private Writer writer;
    private char[] buffer;

    public BufferedWriter(OutputStream ouput, Writer writer, int bufferSize) {
        this.ouput = ouput;
        this.writer = writer;
        this.buffer = new char[bufferSize];
    }
    
    
    
    
}
