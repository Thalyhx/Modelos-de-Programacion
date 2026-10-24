/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parqueadero.memento;

import java.time.LocalDateTime;

/**
 *
 * @author natha
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Caretaker caretaker = new Caretaker();
        
        Vehiculo objCarro = new Carro("ABC-123", LocalDateTime.of(2026, 10, 23, 14, 30), LocalDateTime.of(2026, 10, 23, 15, 0));
        System.out.println(objCarro);
        
        System.out.println("Guardando memento 1");
        Memento memento1 =objCarro.crearMemento();
        caretaker.addMemento(memento1);
        
        System.out.println("Cambianfo hora salida y cobrando");
        objCarro.setHoraSalida(LocalDateTime.of(2026, 10, 23, 16, 0));
        objCarro.cobrar(); 
        System.out.println(objCarro);
        
        System.out.println("Guardando memento 2");
        Memento memento2 =objCarro.crearMemento();
        caretaker.addMemento(memento2);
        System.out.println(memento2.toString());
        
        System.out.println("Restaurando memento 1:");
        objCarro.restoreFromMemento(memento1);
        System.out.println(objCarro.toString());
        

        
         
    }
    
}
