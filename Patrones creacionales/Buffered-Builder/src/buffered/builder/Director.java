/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buffered.builder;

/**
 *
 * @author natha
 */
public class Director {
    
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void changeBuilder(Builder builder) {
        this.builder = builder;
    }

    public void construir(String type, String path) throws Exception {
        builder.reset();
        
        if (type.equalsIgnoreCase("simple")) {
            builder.setPath(path);
        } else {
            builder.setPath(path);
            builder.setBufferSize(16384);
        }
    }
    
}
