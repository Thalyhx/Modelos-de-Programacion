/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora.adapter;

/**
 *
 * @author natha
 */
public class Adaptador implements Target{
    
    private Adaptee adaptado;

    public Adaptador(Adaptee adaptado) {
        this.adaptado = adaptado;
    }
    
    

    @Override
    public int convertirInt() {
        
        String entrada = adaptado.leerString();
        int entradaInt = Integer.parseInt(entrada);
        return entradaInt;
    }

    
}
