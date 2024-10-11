package co.edu.uniquindio.patrones_creacionales.abstract_factory;

import co.edu.uniquindio.patrones_creacionales.abstract_factory.inter.IConexionServicio;
import co.edu.uniquindio.patrones_creacionales.abstract_factory.inter.IConexionVehiculo;
import co.edu.uniquindio.patrones_creacionales.abstract_factory.inter.IFabricaAbstracta;
import co.edu.uniquindio.patrones_creacionales.abstract_factory.inter.impl.*;

public class VehiculoFabrica implements IFabricaAbstracta {
    @Override
    public IConexionVehiculo getVehiculo(String tipoVehiculo) {
        if (tipoVehiculo == null) {
            return null;
        }
        if (tipoVehiculo.equalsIgnoreCase("AUTO")) {
            return new ConexionAuto();
        } else if (tipoVehiculo.equalsIgnoreCase("MOTO")) {
            return new ConexionMoto();
        } else if (tipoVehiculo.equalsIgnoreCase("CAMION")) {
            return new ConexionCamion();
        }

        return null;
    }
    @Override
    public IConexionServicio getServicio(String tipoServicio) {
        return null;
    }
}
