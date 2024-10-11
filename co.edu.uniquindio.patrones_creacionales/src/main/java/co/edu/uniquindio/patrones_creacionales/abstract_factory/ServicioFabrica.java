package co.edu.uniquindio.patrones_creacionales.abstract_factory;

import co.edu.uniquindio.patrones_creacionales.abstract_factory.inter.IConexionServicio;
import co.edu.uniquindio.patrones_creacionales.abstract_factory.inter.IConexionVehiculo;
import co.edu.uniquindio.patrones_creacionales.abstract_factory.inter.IFabricaAbstracta;
import co.edu.uniquindio.patrones_creacionales.abstract_factory.inter.impl.*;

public class ServicioFabrica implements IFabricaAbstracta {
    @Override
    public IConexionVehiculo getVehiculo(String tipoVehiculo) {
        return null;
    }
    @Override
    public IConexionServicio getServicio(String tipoServicio) {
        if (tipoServicio == null) {
            return null;
        }
        if (tipoServicio.equalsIgnoreCase("INSPECCION")) {
            return new ConexionInspeccion();
        } else if (tipoServicio.equalsIgnoreCase("REPARACION")) {
            return new ConexionReparacion();
        } else if (tipoServicio.equalsIgnoreCase("MANTENIMIENTO")) {
            return new ConexionMantenimiento();
        }
        return null;
    }
}