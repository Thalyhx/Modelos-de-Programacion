/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora.adapter;

/**
 *
 * @author natha
 */
public class Adaptee {
    
   
    public Cliente cliente;

    public Adaptee(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public String leerString(){
        return cliente.leer();
    }
    
    
}
