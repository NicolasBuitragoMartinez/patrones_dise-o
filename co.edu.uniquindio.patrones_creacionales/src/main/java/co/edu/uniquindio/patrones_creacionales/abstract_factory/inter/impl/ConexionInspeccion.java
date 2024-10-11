package co.edu.uniquindio.patrones_creacionales.abstract_factory.inter.impl;

import co.edu.uniquindio.patrones_creacionales.abstract_factory.inter.IConexionServicio;

public class ConexionInspeccion implements IConexionServicio {
    @Override
    public void ejecutarServicio() {
        System.out.println("Ejecutando servicio de inspección del vehículo...");
    }
}
