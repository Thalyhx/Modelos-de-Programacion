/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package calculadorasumas.fa;

import calculadorasumas.fa.Factory.FabricaEntradaSalida;
import calculadorasumas.fa.Model.Operacion;
import calculadorasumas.fa.View.Entrada;
import calculadorasumas.fa.View.Salida;

/**
 *
 * @author 
 */
public class Cliente {
    
    public Entrada objEntrada;
    public Salida objSalida;
    public  Operacion objOperacion;

    public Cliente(FabricaEntradaSalida fabrica, Operacion operacion) {
        this.objEntrada = fabrica.crearEntrada();
        this.objSalida = fabrica.crearSalida();
        this.objOperacion = operacion;
    }
    
    public String leer(){
        return objEntrada.leer();
    }
    
    public void enviarTexto(String texto){
        objSalida.salidaTexto(texto);
    }
    public void enviarNumero(int resultado){
        objSalida.salidaNumero(resultado);
    }
    
    public int calcular (int a,int b){
        return objOperacion.calcular(a, b);
    }
    
}
