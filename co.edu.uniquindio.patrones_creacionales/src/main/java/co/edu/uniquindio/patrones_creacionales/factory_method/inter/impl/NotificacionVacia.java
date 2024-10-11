package co.edu.uniquindio.patrones_creacionales.factory_method.inter.impl;

import co.edu.uniquindio.patrones_creacionales.factory_method.inter.INotificacion;

public class NotificacionVacia implements INotificacion {
    @Override
    public void enviar() {
        System.out.println("La notificación se elimino, por ende esta vacía");
    }

    @Override
    public void recibido() {
        System.out.println("La notificación no se envío y tampoco se recibio");
    }
}
