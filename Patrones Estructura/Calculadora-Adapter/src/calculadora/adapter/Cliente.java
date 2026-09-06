package calculadora.adapter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */


import  calculadora.adapter.Calculadora.FabricaEntradaSalida;
import  calculadora.adapter.Calculadora.Operacion;
import  calculadora.adapter.Calculadora.Entrada;
import  calculadora.adapter.Calculadora.Salida;

/**
 *
 * @author 
 */
public class Cliente {
    
    public Entrada objEntrada;
    public Salida objSalida;
    public  Operacion objOperacion;
    private Target target;

    public Cliente(FabricaEntradaSalida fabrica, Operacion operacion) {
        this.objEntrada = (Entrada) fabrica.crearEntrada();
        this.objSalida = (Salida) fabrica.crearSalida();
        this.objOperacion = operacion;
        
        Adaptee adaptee = new Adaptee(this); 
        this.target = new Adaptador(adaptee);
    }
    
    public String leer(){
        enviarTexto(" Digite un numero");
        return objEntrada.leer();
    }
    
    public void enviarTexto(String texto){
        objSalida.salidaTexto(texto);
    }
    public void enviarNumero(int resultado){
        objSalida.salidaNumero(resultado);
    }
    
    public int calcular (){
        int a = target.convertirInt();
        int b = target.convertirInt();
        return objOperacion.calcular(a, b);
    }
    
}
