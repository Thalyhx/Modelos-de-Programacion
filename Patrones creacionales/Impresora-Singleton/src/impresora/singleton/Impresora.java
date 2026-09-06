/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impresora.singleton;

/**
 *
 * @author natha
 */
public class Impresora {
    
    private String nombre;
    private String modelo;
    private ColaImpresion imprimir;
    
    //Constructor
    
    public Impresora(String nombre, String modelo) {
        this.nombre = nombre;
        this.modelo = modelo;

        
    }
    
    
    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    //Getters

    public String getNombre() {
        return nombre;
    }

    public String getModelo() {
        return modelo;
    }
    
           
}
