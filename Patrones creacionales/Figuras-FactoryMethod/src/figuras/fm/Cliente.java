/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras.fm;

import figuras.fm.Fabricas.FabricaFigura;


/**
 *
 * @author natha
 */
public class Cliente {
    
   private Figura objFigura;

    public Cliente(FabricaFigura fabrica) {
        this.objFigura = fabrica.crearFigura();
    }
    
   public double calcularArea (double ... parametros){
       return objFigura.area(parametros);
   }
      
}
