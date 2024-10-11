package co.edu.uniquindio.patrones_creacionales.factory_method.inter.impl;

import co.edu.uniquindio.patrones_creacionales.factory_method.inter.INotificacion;

import java.time.LocalDateTime;

public class TeamsNotificacion implements INotificacion {
    private String usuario;
    private String tipoNotificacion;
    private LocalDateTime fecha;
    public TeamsNotificacion(){
        this.usuario = "Ingeniero";
        this.tipoNotificacion = "Cotización";
        this.fecha = LocalDateTime.of(2024, 10, 5, 13,45);
    }
    @Override
    public void enviar() {
        System.out.println("Se envío la notificación por teams");
    }
    @Override
    public void recibido() {
        System.out.println("Se recibio la notificación por teams");
    }
    @Override
    public String toString() {
        return "TeamsNotificación [usuario=" + usuario + ", tipoNotificacion=" + tipoNotificacion + ", fecha=" + fecha + "]";
    }
}
