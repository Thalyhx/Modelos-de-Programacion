/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototypehouse;

/**
 *
 * @author natha
 */
public class Rectangulo {
    
    private String color;
    private String borde;
    private double base;
    private double altura;

    //Constructores

    public Rectangulo() {
    }
    
        
    public Rectangulo(String color, String borde, double base, double altura) {
        this.color = color;
        this.borde = borde;
        this.base = base;
        this.altura = altura;
    }
    
    //Setters
    
    public void setColor(String color) {
        this.color = color;
    }

    public void setBorde(String borde) {
        this.borde = borde;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    //Getters

    public String getColor() {
        return color;
    }

    public String getBorde() {
        return borde;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    
    //to String

    @Override
    public String toString() {
        return "Rectangulo{" + "color=" + color + ", borde=" + borde + ", base=" + base + ", altura=" + altura + '}';
    }
    
}
