/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototypehouse;

/**
 *
 * @author natha
 */
public class Triangulo {
    
    private String color;
    private String borde;
    private double lado1;
    private double lado2;
    private double lado3;

    //Constructores

    public Triangulo() {
    }
    
    
    
    public Triangulo(String color, String borde, double lado1, double lado2, double lado3) {
        this.color = color;
        this.borde = borde;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public Triangulo(String color, String borde, double lado1, double lado2) {
        this.color = color;
        this.borde = borde;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = Math.sqrt((lado1*lado1)+(lado2*lado2));
    }
    
    
    
    
    //Setters

    public void setColor(String color) {
        this.color = color;
    }

    public void setBorde(String borde) {
        this.borde = borde;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    
    //Getters

    public String getColor() {
        return color;
    }

    public String getBorde() {
        return borde;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }
    
    //to String

    @Override
    public String toString() {
        return "Triangulo{" + "color=" + color + ", borde=" + borde + ", lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + '}';
    }
    
}
