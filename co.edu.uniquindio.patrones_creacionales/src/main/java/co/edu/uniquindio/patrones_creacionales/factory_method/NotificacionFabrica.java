package co.edu.uniquindio.patrones_creacionales.factory_method;

import co.edu.uniquindio.patrones_creacionales.factory_method.inter.INotificacion;
import co.edu.uniquindio.patrones_creacionales.factory_method.inter.impl.*;

public class NotificacionFabrica {
    public INotificacion getNotificacion(String tipo) {
        if (tipo == null) {
            return new NotificacionVacia();
        }
        if (tipo.equalsIgnoreCase("EMAIL")) {
            return new EmailNotificacion();
        } else if (tipo.equalsIgnoreCase("SMS")) {
            return new SMSNotificacion();
        } else if (tipo.equalsIgnoreCase("TEAMS")) {
            return new TeamsNotificacion();
        } else if (tipo.equalsIgnoreCase("WHATSAPP")) {
            return new WhatsAppNotificacion();
        }
        return new NotificacionVacia();
    }
}
