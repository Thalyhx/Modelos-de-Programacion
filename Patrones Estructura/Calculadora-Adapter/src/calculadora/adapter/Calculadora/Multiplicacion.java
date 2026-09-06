/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora.adapter.Calculadora;

/**
 *
 * @author natha
 */
public class Multiplicacion implements Operacion{
    
    @Override
    public int calcular (int a, int b){
        int multiplicacion=0;
        int bPositivo=Math.abs(b);
        
        Operacion objSuma =new Suma();
         
            for (int i=0; i<bPositivo; i++){
                multiplicacion= objSuma.calcular(multiplicacion, a);
            }
            if(b>=0){
                 return multiplicacion;
            }else{
                return multiplicacion*(-1);
            }
    }
    
}
