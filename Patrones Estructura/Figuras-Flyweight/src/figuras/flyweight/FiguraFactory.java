/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras.flyweight;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author natha
 */
public class FiguraFactory {
    
    private static List<FiguraConcreta> listaFiguras = new ArrayList<>();
    
    public static FiguraFlyweight obtenerFigura(String tipo, String orientacion, String colorBorde, String colorRelleno) {
        
        for (FiguraConcreta fig : listaFiguras) {
            if (fig.getTipoFigura().equals(tipo) && 
                fig.getOrientacion().equals(orientacion) && 
                fig.getColorBorde().equals(colorBorde) && 
                fig.getColorRelleno().equals(colorRelleno)) {
                
                return fig;
            }
        }
        FiguraConcreta nuevaFigura = new FiguraConcreta(tipo, orientacion, colorBorde, colorRelleno);
        
        listaFiguras.add(nuevaFigura);
        return nuevaFigura;
    }
    
    public static int getCantidadFiguras() {
        return listaFiguras.size();
    }
        
}
