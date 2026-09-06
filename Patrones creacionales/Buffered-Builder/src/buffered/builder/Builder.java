/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buffered.builder;

/**
 *
 * @author natha
 */
public abstract class Builder {
    
    public abstract void reset();
    public abstract void setPath(String path) throws Exception;
    public abstract void setCharset(String charsetName) throws Exception;
    public abstract void setBufferSize(int size);
    
}
