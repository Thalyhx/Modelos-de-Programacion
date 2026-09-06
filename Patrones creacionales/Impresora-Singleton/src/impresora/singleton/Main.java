/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package impresora.singleton;

/**
 *
 * @author natha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        
        Impresora impr1 = new Impresora("Epson", "L3150"); 
        Impresora impr2 = new Impresora("Canon", "G3110"); 
        Conexion.getInstance(impr1);
        Conexion.getInstance(impr2);
        Conexion.getInstance(impr1);
        
        System.out.println("-----------------------------------");
        
        Archivo a1 = new Archivo("Doc1.pdf", "Texto1");
        Archivo a2 = new Archivo("Doc2.pdf", "Texto2");
        Archivo a3 = new Archivo("Doc3.pdf", "Texto3");
        Archivo a4 = new Archivo("Doc4.pdf", "Texto4");
       
        ColaImpresion.getInstance(a1);
        ColaImpresion.getInstance(a2);
       ColaImpresion.getInstance(a3);
       ColaImpresion.getInstance(a4); 
    }
    
}
