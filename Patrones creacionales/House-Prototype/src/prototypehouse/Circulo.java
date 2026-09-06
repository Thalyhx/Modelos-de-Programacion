/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototypehouse;

/**
 *
 * @author natha
 */
public class Circulo {
    
    private String color;
    private String borde;
    private double radio;

    public Circulo(String color, String borde, double radio) {
        this.color = color;
        this.borde = borde;
        this.radio = radio;
    }
        public Circulo() {

    }

     //Setters
        
    public void setColor(String color) {
        this.color = color;
    }

    public void setBorde(String borde) {
        this.borde = borde;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    //Getters 

    public String getColor() {
        return color;
    }

    public String getBorde() {
        return borde;
    }

    public double getRadio() {
        return radio;
    }
    
    //to String
    @Override
    public String toString() {
        return "Circulo{" + "color=" + color + ", borde=" + borde + ", radio=" + radio + '}';
    }
    
    
    
    
    
}
