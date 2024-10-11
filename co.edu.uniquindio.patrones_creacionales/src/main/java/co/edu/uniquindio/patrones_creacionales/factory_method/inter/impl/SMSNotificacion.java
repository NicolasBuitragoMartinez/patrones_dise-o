package co.edu.uniquindio.patrones_creacionales.factory_method.inter.impl;

import co.edu.uniquindio.patrones_creacionales.factory_method.inter.INotificacion;

import java.time.LocalDateTime;

public class SMSNotificacion implements INotificacion {
    private String usuario;
    private String tipoNotificacion;
    private LocalDateTime fecha;
    public SMSNotificacion(){
        this.usuario = "Cirujano";
        this.tipoNotificacion = "Imagen";
        this.fecha = LocalDateTime.of(2024, 5, 13, 22,18);
    }
    @Override
    public void enviar() {
        System.out.println("Se envío la notificación por SMS");
    }
    @Override
    public void recibido() {
        System.out.println("Se recibio la notificación por SMS");
    }
    @Override
    public String toString() {
        return "SMSNotificación [usuario=" + usuario + ", tipoNotificacion=" + tipoNotificacion + ", fecha=" + fecha + "]";
    }
}
