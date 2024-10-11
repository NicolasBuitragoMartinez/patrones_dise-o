package co.edu.uniquindio.patrones_creacionales.factory_method.inter.impl;

import co.edu.uniquindio.patrones_creacionales.factory_method.inter.INotificacion;

import java.time.LocalDateTime;

public class EmailNotificacion implements INotificacion {
    private String usuario;
    private String tipoNotificacion;
    private LocalDateTime fecha;
    public EmailNotificacion(){
        this.usuario = "Jefe";
        this.tipoNotificacion = "archivo";
        this.fecha = LocalDateTime.of(2024, 12, 24, 22, 0);
    }
    @Override
    public void enviar() {
        System.out.println("Se envío la notificación por email");
    }
    @Override
    public void recibido() {
        System.out.println("Se recibio la notificación por email");
    }
    @Override
    public String toString() {
        return "EmailNotificación [usuario=" + usuario + ", tipoNotificacion=" + tipoNotificacion + ", fecha=" + fecha + "]";
    }
}
