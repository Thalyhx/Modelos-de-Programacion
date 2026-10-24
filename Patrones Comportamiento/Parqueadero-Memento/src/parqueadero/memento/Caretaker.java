/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueadero.memento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author natha
 */
public class Caretaker {
    
    private List<Memento> listaMementos;
    
    //Constructor

    public Caretaker() {
        this.listaMementos = new ArrayList<Memento>();
    }
    
    //Añade Mementos
    public void addMemento(Memento memento){
        listaMementos.add(memento);
    }
    
    //Retorna un Memento especifico
    public Memento getMemento(int index){
        return listaMementos.get(index);
    }
    
    //Retorna el historial de mementos
    public List<Memento> getListaMementos() {
        return listaMementos;
    }
    
}