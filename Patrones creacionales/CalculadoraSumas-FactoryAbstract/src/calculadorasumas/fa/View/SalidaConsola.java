/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadorasumas.fa.View;

/**
 *
 * @author
 */
public class SalidaConsola implements Salida{
    
    @Override
    public void salidaNumero(int resultado){
        System.out.println(resultado);
    }
    
    @Override
     public void salidaTexto( String texto){
        System.out.println(texto);
    }


     
}
