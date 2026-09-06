/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casa.composite;

/**
 *
 * @author natha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Estructura sofa = new Mueble("Sofa de Cuero", new int[]{0,0});
        Estructura tv = new Mueble("Televisor 55", new int[]{2,0});
        Estructura cama = new Mueble("Cama Doble", new int[]{0,5});
        Estructura armario = new Mueble("Armario Ropa", new int[]{3,5});

        Compuesto piso1 = new Compuesto("Piso 1", new int[]{0,0});
        piso1.agregar(sofa);
        piso1.agregar(tv);

        Compuesto piso2 = new Compuesto("Piso 2", new int[] {0, 0});
        piso2.agregar(cama);
        piso2.agregar(armario);

        Compuesto casaCompleta = new Compuesto("Casa Prefabricada", new int[]{10, 10});
        casaCompleta.agregar(piso1);
        casaCompleta.agregar(piso2);

        System.out.println("--- ESTRUCTURA INICIAL ---");
        casaCompleta.mostrar();

        System.out.println("\n--- INICIANDO TRASLADO DE LA CASA ---");
        casaCompleta.mover(new int[]{50, 20});
        
        System.out.println("\n--- ESTRUCTURA FINAL ---");
        casaCompleta.mostrar();
    }
    
}
