/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora.adapter.Calculadora;

/**
 *
 * @author natha
 */
public class Suma implements Operacion{
    
    @Override
    public int calcular(int a , int b){
        return a+b;
    }
    
}
