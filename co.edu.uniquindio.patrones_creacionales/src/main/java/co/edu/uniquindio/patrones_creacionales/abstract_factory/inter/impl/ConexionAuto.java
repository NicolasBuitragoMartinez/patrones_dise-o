package co.edu.uniquindio.patrones_creacionales.abstract_factory.inter.impl;

import co.edu.uniquindio.patrones_creacionales.abstract_factory.inter.IConexionVehiculo;

public class ConexionAuto implements IConexionVehiculo {
    private String modelo;
    private String marca;
    public ConexionAuto() {
        this.modelo = "Sedán";
        this.marca = "Toyota";
    }
    @Override
    public void conectar() {
        System.out.println("Conectando con el sistema del Auto - Marca: " + marca + ", Modelo: " + modelo);
    }
    @Override
    public void desconectar() {
        System.out.println("Desconectando el Auto - Marca: " + marca + ", Modelo: " + modelo);
    }
    @Override
    public String toString() {
        return "ConexionAuto [marca=" + marca + ", modelo=" + modelo + "]";
    }
}
