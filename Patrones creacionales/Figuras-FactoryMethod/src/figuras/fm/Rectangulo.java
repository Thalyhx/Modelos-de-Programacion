/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras.fm;

/**
 *
 * @author natha
 */
public class Rectangulo implements Figura{
    
    @Override
    public double area(double ... parametro) {
        return parametro[0]*parametro[1];
    }   
    
}
