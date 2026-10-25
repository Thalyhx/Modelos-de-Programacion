/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueadero.memento;
import java.time.LocalDateTime;

/**
 *
 * @author natha
 */
public abstract class Vehiculo {
    
    //Estados
    
    protected String id;
    protected String tipoVehiculo;
    protected LocalDateTime horaEntrada;
    protected LocalDateTime horaSalida;
    protected double pago;
    
    //Constructores

    public Vehiculo() {
            this.pago = 0;
    }

    public Vehiculo(String id, String tipoVehiculo, LocalDateTime horaEntrada, LocalDateTime horaSalida) {
        this.id = id;
        this.tipoVehiculo = tipoVehiculo;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.pago = 0;
    }
    
    //Metodo calcular pago
    public abstract double cobrar();
    
    //metodo guardar estados
    public Memento crearMemento(){
        
        Memento mementoGuardado = new Memento (this.horaEntrada, this.horaSalida, this.pago);
        return mementoGuardado;
    }
    
    //Metodo restaurar estados
    public void restoreFromMemento(Memento memento){
        
        if (memento != null) {
            this.horaEntrada = memento.getHoraEntradaGuardada();
            this.horaSalida = memento.getHoraSalidaGuardada();
            this.pago = memento.getPagoGuardado();
        }
        
    }
    
    //Getters

    public String getId() {
        return id;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }
    
    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }

    public double getPago() {
        return pago;
    }    

    //Seters
    
    public void setId(String id) {
        this.id = id;
    }
        
    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public void setHoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }
            
    //toString

@Override
    public String toString() {
        return "\n========================================\n" +
               "          TICKET DE PARQUEADERO         \n" +
               "========================================\n" +
               " Tipo de Vehiculo : " + tipoVehiculo + "\n" +
               " Placa : " + id + "\n" +
               " Hora de Entrada  : " + (horaEntrada != null ? horaEntrada : "No registrada") + "\n" +
               " Hora de Salida   : " + (horaSalida != null ? horaSalida : "En curso...") + "\n" +
               " ---------------------------------------\n" +
               " TOTAL A PAGAR    : $" + String.format("%.2f", pago) + "\n" +
               "========================================\n";
    }
}
