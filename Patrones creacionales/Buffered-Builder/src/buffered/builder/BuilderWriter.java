/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buffered.builder;


import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 *
 * @author natha
 */
public class BuilderWriter extends Builder{
    
    private OutputStream outputStream;
    private Writer writer;
    private int bufferSize;

    @Override
    public void reset() {
        this.outputStream = null;
        this.writer = null;
        this.bufferSize = 8192;
    }

    @Override
    public void setPath(String filePath) throws Exception {
        this.outputStream = new FileOutputStream(filePath);
    }

    @Override
    public void setCharset(String charsetName) throws Exception {
        if (this.outputStream == null) {
            throw new IllegalStateException("definir el Path primero");
        }
        this.writer = new OutputStreamWriter(this.outputStream, charsetName);
    }

    @Override
    public void setBufferSize(int size) {
        if (size <= 0) throw new IllegalArgumentException("debe ser mayor a 0");
        this.bufferSize = size;
    }

    public BufferedWriter getBuffered() {
        if (this.writer == null && this.outputStream != null) {
            this.writer = new OutputStreamWriter(this.outputStream);
        }
        return new BufferedWriter(this.outputStream, this.writer, this.bufferSize);
    }
    
}
