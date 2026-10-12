/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco.chainresponsability;

/**
 *
 * @author natha
 */
public class Prestamo {
    
    //Atributos
    private String nombre;
    private int cedula;
    private int edad;
    private String ocupacion;
    private double monto;
    
    
    //Constructor
    public Prestamo() {
    }

    public Prestamo(String nombre, int cedula, int edad, String ocupacion, double monto) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.monto = monto;
    }
    
    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    //Getters

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public double getMonto() {
        return monto;
    }
                
}
