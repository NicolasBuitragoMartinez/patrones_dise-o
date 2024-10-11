package co.edu.uniquindio.patrones_creacionales.prototype.model;

import co.edu.uniquindio.patrones_creacionales.prototype.service.IProducto;

public class PapasMargaritaImpl implements IProducto {
    private String sabor;
    private double precio;
    public PapasMargaritaImpl() {
        sabor = "Original";
    }
    public PapasMargaritaImpl(String sabor) {
        this.sabor = sabor;
    }
    @Override
    public IProducto clonar() {
        PapasMargaritaImpl producto = null;

        try {
            producto = (PapasMargaritaImpl) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return producto;
    }
    @Override
    public String toString() {
        return "PapasMargaritaImpl [sabor=" + sabor + ", precio=" + precio + "]";
    }
    public void setPrecio(double precio) {this.precio = precio;}
    public double getPrecio() {return precio;}
    public void setSabor(String sabor) {this.sabor = sabor;}
    public String getSabor() {return sabor;}
}
