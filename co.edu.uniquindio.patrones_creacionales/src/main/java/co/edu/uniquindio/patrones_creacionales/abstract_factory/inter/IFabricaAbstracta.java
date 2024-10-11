package co.edu.uniquindio.patrones_creacionales.abstract_factory.inter;

public interface IFabricaAbstracta {
    IConexionVehiculo getVehiculo(String tipoVehiculo);
    IConexionServicio getServicio(String tipoServicio);
}
