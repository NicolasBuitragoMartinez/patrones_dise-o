package co.edu.uniquindio.patrones_creacionales.factory_method.inter.impl;

import co.edu.uniquindio.patrones_creacionales.factory_method.inter.INotificacion;

import java.time.LocalDateTime;

public class WhatsAppNotificacion implements INotificacion {
    private String usuario;
    private String tipoNotificacion;
    private LocalDateTime fecha;
    public WhatsAppNotificacion(){
        this.usuario = "Administrador";
        this.tipoNotificacion = "Mensaje";
        this.fecha = LocalDateTime.of(2023, 9, 30, 9,13);
    }
    @Override
    public void enviar() {
        System.out.println("Se envío la notificación por WhatsApp");
    }
    @Override
    public void recibido() {
        System.out.println("Se recibio la notificación por WhatsApp");
    }
    @Override
    public String toString() {
        return "WhatsAppNotificacion [usuario=" + usuario + ", tipoNotificacion=" + tipoNotificacion + ", fecha=" + fecha + "]";
    }
}
