package co.edu.uniquindio.patrones_creacionales.factory_method;

import co.edu.uniquindio.patrones_creacionales.factory_method.inter.INotificacion;

public class Main {

    public static void main(String[] args) {
        NotificacionFabrica fabrica = new NotificacionFabrica();

        INotificacion notificacion1 = fabrica.getNotificacion("EMAIL");
        notificacion1.enviar();
        notificacion1.recibido();
        System.out.println(notificacion1);

        INotificacion notificacion2 = fabrica.getNotificacion("SMS");
        notificacion2.enviar();
        notificacion2.recibido();
        System.out.println(notificacion2);

        INotificacion notificacion3 = fabrica.getNotificacion("TEAMS");
        notificacion3.enviar();
        notificacion3.recibido();
        System.out.println(notificacion3);

        INotificacion notificacion4 = fabrica.getNotificacion("WHATSAPP");
        notificacion4.enviar();
        notificacion4.recibido();
        System.out.println(notificacion4);

        INotificacion notificacion5 = fabrica.getNotificacion("VACIA");
        notificacion5.enviar();
        notificacion5.recibido();
        System.out.println(notificacion5);
    }
}
