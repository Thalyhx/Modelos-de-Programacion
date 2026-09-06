/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototypehouse;

/**
 *
 * @author natha
 */
public class Cuadrado {
    
    private String color;
    private String borde;
    private double lado;
    
    //Constructores
    
    public Cuadrado() {
    }
    
    public Cuadrado(String color, String borde, double lado) {
        this.color = color;
        this.borde = borde;
        this.lado = lado;
    }
    
   
    //Setters
         
    public void setColor(String color) {
        this.color = color;
    }

    public void setBorde(String borde) {
        this.borde = borde;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
     //Getters

    public String getColor() {
        return color;
    }

    public String getBorde() {
        return borde;
    }

    public double getLado() {
        return lado;
    }

    //to String

    @Override
    public String toString() {
        return "Cuadrado{" + "color=" + color + ", borde=" + borde + ", lado=" + lado + '}';
    }
    
}
