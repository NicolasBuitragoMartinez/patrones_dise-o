package co.edu.uniquindio.patrones_creacionales.abstract_factory;

import co.edu.uniquindio.patrones_creacionales.abstract_factory.inter.IConexionServicio;
import co.edu.uniquindio.patrones_creacionales.abstract_factory.inter.IConexionVehiculo;
import co.edu.uniquindio.patrones_creacionales.abstract_factory.inter.IFabricaAbstracta;

public class App {
    public static void main(String[] args) {
        IFabricaAbstracta fabricaVehiculo = FabricaProductor.getFactory("VEHICULO");

        IConexionVehiculo auto = fabricaVehiculo.getVehiculo("AUTO");
        auto.conectar();
        auto.desconectar();

        IConexionVehiculo moto = fabricaVehiculo.getVehiculo("MOTO");
        moto.conectar();
        moto.desconectar();

        IConexionVehiculo camion = fabricaVehiculo.getVehiculo("CAMION");
        camion.conectar();
        camion.desconectar();

        IFabricaAbstracta fabricaServicio = FabricaProductor.getFactory("SERVICIO");
        
        IConexionServicio inspeccion = fabricaServicio.getServicio("INSPECCION");
        inspeccion.ejecutarServicio();

        IConexionServicio reparacion = fabricaServicio.getServicio("REPARACION");
        reparacion.ejecutarServicio();

        IConexionServicio mantenimiento = fabricaServicio.getServicio("MANTENIMIENTO");
        mantenimiento.ejecutarServicio();
    }
}
