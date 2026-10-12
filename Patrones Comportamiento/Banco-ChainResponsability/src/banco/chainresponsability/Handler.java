/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package banco.chainresponsability;

/**
 *
 * @author natha
 */
public abstract class Handler {
    
    protected Handler sucesor;
    
    //Setter
    public void setSucesor(Handler sucesor) {
        this.sucesor= sucesor;
    }
    
    //Getter
    public Handler getSucesor() {
        return sucesor;
    }
            
    public abstract void ProcesarPrestamo(Prestamo prestamo);
    
}
