/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras.flyweight;


/**
 *
 * @author natha
 */
public class FiguraConcreta implements FiguraFlyweight{
    
    private String tipoFigura;       
    private String orientacion;
    private String colorBorde;
    private String colorRelleno;
    
    //Constructor

    public FiguraConcreta(String tipoFigura, String orientacion, String colorBorde, String colorRelleno) {
        this.tipoFigura = tipoFigura;
        this.orientacion = orientacion;
        this.colorBorde = colorBorde;
        this.colorRelleno = colorRelleno;
    }
    
    @Override
    public void crearFigura(int x, int y, int ancho, int alto) {
        
        System.out.println("Pintando figura [" + tipoFigura + ", " + orientacion + ", " + colorRelleno + 
                           "] en la celda con coordenadas X:" + x + ", Y:" + y + " ancho: " + ancho+ " alto: "+alto );
        }
    
    //Getters

    public String getTipoFigura() {
        return tipoFigura;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public String getColorBorde() {
        return colorBorde;
    }

    public String getColorRelleno() {
        return colorRelleno;
    }
   
    //Setters

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }

    public void setColorBorde(String colorBorde) {
        this.colorBorde = colorBorde;
    }

    public void setColorRelleno(String colorRelleno) {
        this.colorRelleno = colorRelleno;
    }
        
}
