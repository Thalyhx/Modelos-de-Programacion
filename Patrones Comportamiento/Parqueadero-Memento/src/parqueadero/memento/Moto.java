/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueadero.memento;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 *
 * @author natha
 */
public class Moto extends Vehiculo{
    
    private static final double tarifa= 3000;
    
    //Constructor

    public Moto() {
    }

    public Moto(String id, LocalDateTime horaEntrada, LocalDateTime horaSalida) {
        super(id, "MOTO", horaEntrada, horaSalida);
    }
    
    @Override
    public double cobrar() {
        if (horaEntrada != null && horaSalida != null) {
            long minutos = Duration.between(horaEntrada, horaSalida).toMinutes();
            this.pago = (minutos) * tarifa;
        }
        return this.pago;
    }
    
}
