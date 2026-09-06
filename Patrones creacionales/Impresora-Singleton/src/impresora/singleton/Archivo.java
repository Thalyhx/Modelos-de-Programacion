/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impresora.singleton;

/**
 *
 * @author natha
 */
public class Archivo {
    
    private String nombre;
    private String contenido;
    
    //Constructor 

    public Archivo(String nombre, String contenido) {
        this.nombre = nombre;
        this.contenido = contenido;
    }
    
    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    //Getter

    public String getNombre() {
        return nombre;
    }

    public String getContenido() {
        return contenido;
    }
    
    //ToString

    @Override
    public String toString() {
        return "Archivo{" + "nombre=" + nombre + ", contenido=" + contenido + '}';
    }
           
}
