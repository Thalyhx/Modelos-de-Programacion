/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueadero.memento;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author natha
 */
public class Memento {
    
    // Estados Guardados

    private final LocalDateTime horaEntradaGuardada;
    private final LocalDateTime horaSalidaGuardada;
    private LocalDate fechaGuardada;
    private final double pagoGuardado;
    
    //Constructor

    public Memento(LocalDateTime horaEntradaGuardada, LocalDateTime horaSalidaGuardada,double pagoGuardado) {
        this.horaEntradaGuardada = horaEntradaGuardada;
        this.horaSalidaGuardada = horaSalidaGuardada;
        this.pagoGuardado = pagoGuardado;
    }   
       
    //Getters

    public LocalDateTime getHoraEntradaGuardada() {
        return horaEntradaGuardada;
    }

    public LocalDateTime getHoraSalidaGuardada() {
        return horaSalidaGuardada;
    }

    public double getPagoGuardado() {
        return pagoGuardado;
    }
       
    //toString

    @Override
    public String toString() {
        return 
               "\n========================================\n" +
               "            TICKET MEMENTO                 \n" +
               "========================================\n" +
               " Entrada Guardada : " + horaEntradaGuardada + "\n" +
               " Salida Guardada  : " + horaSalidaGuardada + "\n" +
               " Pago Acumulado   : $" + String.format("%.2f", pagoGuardado) + "\n" +
               "========================================";
    }

}
