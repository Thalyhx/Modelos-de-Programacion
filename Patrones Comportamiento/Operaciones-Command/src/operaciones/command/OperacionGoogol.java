/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones.command;

/**
 *
 * @author natha
 */
public class OperacionGoogol implements Operacion{
    
private Calculadora calculadora;
    private double estadoAnterior;

    public OperacionGoogol(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    @Override
    public double operar(double a, double b) {

        this.estadoAnterior = calculadora.getActual();
        return calculadora.aplicarGoogol(a);
    }

    @Override
    public double deshacer() {
        calculadora.setActual(estadoAnterior);
        return calculadora.getActual();
    }
    
}
