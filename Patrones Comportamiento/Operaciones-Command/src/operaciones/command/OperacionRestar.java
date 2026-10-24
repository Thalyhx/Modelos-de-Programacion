/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones.command;

/**
 *
 * @author natha
 */
public class OperacionRestar implements Operacion{
    
    private Calculadora calculadora;
    private double a;
    private double b;
    private double estadoAnterior;
    
    //Constructor

    public OperacionRestar(Calculadora calculadora) {
            this.calculadora = calculadora;
     }
    

@Override
    public double operar(double a, double b) {
        this.a = a;
        this.b = b;
        this.estadoAnterior = calculadora.getActual();
        return calculadora.restar(a, b);
    }

@Override
    public double deshacer() {
        calculadora.setActual(estadoAnterior);
        return calculadora.getActual();
    }
    
    
}
