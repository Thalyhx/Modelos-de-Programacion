/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones.command;

/**
 *
 * @author natha
 */
public class Invoker {
    
    private Operacion operacion;
    
    //Constructores

    public Invoker() {
    }

    public Invoker(Operacion operacion) {
        this.operacion = operacion;
    }
    
    public void ejecutarOperacion(double a, double b){
        operacion.operar(a,b);
    }    
    
    public double deshacer() {
        if (operacion != null) {
            double resultado = operacion.deshacer();
            operacion = null; 
            return resultado;
        }
        System.out.println("No hay ninguna operacion para deshacer.");
        return 0;
    }
    
    //Setter

    public void setOperacion(Operacion operacion) {
        this.operacion = operacion;
    }
    
    //Getter

    public Operacion getOperacion() {
        return operacion;
    }
    
    
}
