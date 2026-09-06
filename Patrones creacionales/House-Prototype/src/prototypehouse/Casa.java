/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototypehouse;

import java.util.ArrayList;
import java.util.List;
import prototypehouse.Prototipos.CirculoPrototipo;
import prototypehouse.Prototipos.CuadradoPrototipo;
import prototypehouse.Prototipos.RectanguloPrototipo;
import prototypehouse.Prototipos.TrianguloPrototipo;

/**
 *
 * @author natha
 */
public class Casa {
    
    private List<CirculoPrototipo> circulos = new ArrayList<>();
    private List<RectanguloPrototipo> rectangulos = new ArrayList<>();
    private List<TrianguloPrototipo> triangulos = new ArrayList<>();
    private List<CuadradoPrototipo> cuadrados = new ArrayList<>();
    
    //Constructores

    public Casa() {
    }
    
    public void agregarCirculo(CirculoPrototipo c) {
        this.circulos.add(c);
    }

    public void agregarRectangulo(RectanguloPrototipo r) {
        this.rectangulos.add(r);
    }

    public void agregarTriangulo(TrianguloPrototipo t) {
        this.triangulos.add(t);
    }
    
    public void agregarCuadrado(CuadradoPrototipo cdr) {
        this.cuadrados.add(cdr);
    }
    
    //Setters

    public void setCirculos(List<CirculoPrototipo> circulos) {
        this.circulos = circulos;
    }

    public void setRectangulos(List<RectanguloPrototipo> rectangulos) {
        this.rectangulos = rectangulos;
    }

    public void setTriangulos(List<TrianguloPrototipo> triangulos) {
        this.triangulos = triangulos;
    }
    
     public void setCuadrados(List<CuadradoPrototipo> cuadrados) {
        this.cuadrados = cuadrados;
    }

    
    //Getters

    public List<CirculoPrototipo> getCirculos() {
        return circulos;
    }

    public List<RectanguloPrototipo> getRectangulos() {
        return rectangulos;
    }

    public List<TrianguloPrototipo> getTriangulos() {
        return triangulos;
    }
    
    public List<CuadradoPrototipo> getCuadrados() {
        return cuadrados;
    }
    

    //to string

    
    @Override
    public String toString() {

        return "\n" +
               " Techo : " + this.triangulos + "\n" +
               " - Paredes: " + this.rectangulos + "\n" +
               " - Puerta: " + this.cuadrados + "\n" +
               " - Ventanas : " + this.circulos + "\n" ;
    }
    
    
}
