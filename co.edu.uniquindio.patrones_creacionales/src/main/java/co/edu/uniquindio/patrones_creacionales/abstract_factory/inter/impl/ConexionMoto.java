package co.edu.uniquindio.patrones_creacionales.abstract_factory.inter.impl;

import co.edu.uniquindio.patrones_creacionales.abstract_factory.inter.IConexionVehiculo;

public class ConexionMoto implements IConexionVehiculo {
    private String marca;
    private String tipo;
    public ConexionMoto() {
        this.marca = "Honda";
        this.tipo = "Deportiva";
    }
    @Override
    public void conectar() {
        System.out.println("Conectando con el sistema de la Moto - Marca: " + marca + ", Tipo: " + tipo);
    }
    @Override
    public void desconectar() {
        System.out.println("Desconectando la Moto - Marca: " + marca + ", Tipo: " + tipo);
    }
    @Override
    public String toString() {
        return "ConexionMoto [marca=" + marca + ", tipo=" + tipo + "]";
    }
}
