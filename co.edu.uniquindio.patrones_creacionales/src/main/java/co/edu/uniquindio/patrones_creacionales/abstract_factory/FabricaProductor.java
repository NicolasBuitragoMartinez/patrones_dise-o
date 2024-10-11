package co.edu.uniquindio.patrones_creacionales.abstract_factory;

import co.edu.uniquindio.patrones_creacionales.abstract_factory.inter.IFabricaAbstracta;

public class FabricaProductor {
    public static IFabricaAbstracta getFactory(String tipoFabrica) {
        if (tipoFabrica.equalsIgnoreCase("VEHICULO")) {
            return new VehiculoFabrica();
        } else if (tipoFabrica.equalsIgnoreCase("SERVICIO")) {
            return new ServicioFabrica();
        }
        return null;
    }
}
