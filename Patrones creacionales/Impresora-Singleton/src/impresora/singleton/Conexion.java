/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impresora.singleton;

/**
 *
 * @author natha
 */
public class Conexion {
    
        private static Conexion instance;
        private Impresora impr;
        
        //Constgructor Privado
        private Conexion(Impresora impr) {
            System.out.println("Se conecto la impresora  "+impr.getNombre());
            this.impr= impr;
        }

        public static Conexion getInstance(Impresora impr){
            
            if (instance== null){
                instance = new Conexion(impr);
            }else{
            instance.impr = impr;
            System.out.println("Inicializando la impresora  " + impr.getNombre());
            }
            return instance;
        }
        
        
}
