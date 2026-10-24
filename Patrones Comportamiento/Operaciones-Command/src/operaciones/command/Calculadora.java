/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones.command;

/**
 *
 * @author natha
 */

public class Calculadora {
    
    private double actual = 0;
    private final double googol = Math.pow(10, 100);
    
    public double sumar(double a, double b) {
        this.actual = a + b;
        return this.actual;
    }
    
    public double restar(double a, double b) {
        this.actual = a - b;
        return this.actual;
    }
    
    public double multiplicar(double a, double b) {
        this.actual = a * b;
        return this.actual;
    }
    
    public double dividir(double a, double b) {
        if (b != 0) {
            this.actual = a / b;
            return this.actual;
        }
        throw new IllegalArgumentException("El divisor no puede ser 0");
    }

    public double aplicarGoogol(double a) {
        this.actual = a * googol;
        return this.actual;
    }

    public double getActual() {
        return actual;
    }

    public void setActual(double actual) {
        this.actual = actual;
    }

    public double getGoogol() {
        return googol;
    }
}
