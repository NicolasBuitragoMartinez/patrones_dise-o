package co.edu.uniquindio.patrones_creacionales.abstract_factory.inter.impl;

import co.edu.uniquindio.patrones_creacionales.abstract_factory.inter.IConexionVehiculo;

public class ConexionCamion implements IConexionVehiculo {
    private String capacidadCarga;
    private String tipo;
    public ConexionCamion() {
        this.capacidadCarga = "10 toneladas";
        this.tipo = "Camión de carga pesada";
    }
    @Override
    public void conectar() {
        System.out.println("Conectando con el sistema del Camión - Tipo: " + tipo + ", Capacidad: " + capacidadCarga);
    }
    @Override
    public void desconectar() {
        System.out.println("Desconectando el Camión - Tipo: " + tipo + ", Capacidad: " + capacidadCarga);
    }
    @Override
    public String toString() {
        return "ConexionCamion [tipo=" + tipo + ", capacidadCarga=" + capacidadCarga + "]";
    }
}
