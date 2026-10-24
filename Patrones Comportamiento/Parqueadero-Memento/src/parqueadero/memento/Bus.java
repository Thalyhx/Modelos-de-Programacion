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
public class Bus extends Vehiculo{
    
    private static final double tarifa = 8000;
    
    //Constructor

    public Bus() {
    }

    public Bus(String id, LocalDateTime entrada, LocalDateTime salida) {
        super(id, "BUS", entrada, salida);
    }
    
    @Override
    public double cobrar() {
        if (horaEntrada != null && horaSalida != null) {
            long minutos = Duration.between(horaEntrada, horaSalida).toMinutes();
            this.pago = Math.max(0, minutos) * tarifa;
        }
        return this.pago;
    }
    
}
