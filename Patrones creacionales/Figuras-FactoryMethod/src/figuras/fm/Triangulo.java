/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras.fm;

/**
 *
 * @author natha
 */
public class Triangulo implements Figura{ 

    @Override
    public double area(double... parametro) {
        
        if (parametro.length == 2){
            return (parametro[0]*parametro[1])/2;
        }
        else if(parametro.length == 3){
            double semiper = (parametro[0]+parametro[1]+parametro[2])/2; 
            return Math.sqrt(semiper*(semiper-parametro[0])*(semiper-parametro[1])*(semiper-parametro[2]));
        }
        throw new IllegalArgumentException("");
    }    
}
