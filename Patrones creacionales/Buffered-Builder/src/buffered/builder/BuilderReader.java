/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buffered.builder;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author natha
 */
public class BuilderReader extends Builder{
        
    private InputStream inputStream;
    private Reader reader;
    private int bufferSize;

    @Override
    public void reset() {
        this.inputStream = null;
        this.reader = null;
        this.bufferSize = 8192;
    }

    @Override
    public void setPath(String filePath) throws Exception {
        this.inputStream = new FileInputStream(filePath);
    }

    @Override
    public void setCharset(String charsetName) throws Exception {
        if (this.inputStream == null) {
            throw new IllegalStateException("definir el Path primero");
        }
        this.reader = new InputStreamReader(this.inputStream, charsetName);
    }

    @Override
    public void setBufferSize(int size) {
        if (size <= 0) throw new IllegalArgumentException("debe ser mayor a 0");
        this.bufferSize = size;
    }

    public BufferedReader getBuffered() {
        if (this.reader == null && this.inputStream != null) {
            this.reader = new InputStreamReader(this.inputStream);
        }
        return new BufferedReader(this.inputStream, this.reader, this.bufferSize);
    }
    
    
}
