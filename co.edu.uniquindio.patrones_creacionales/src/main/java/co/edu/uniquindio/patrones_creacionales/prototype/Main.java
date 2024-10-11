package co.edu.uniquindio.patrones_creacionales.prototype;

import co.edu.uniquindio.patrones_creacionales.prototype.model.PapasMargaritaImpl;

public class Main {

    public static void main(String[] args) {
        ejemplo1();
    }

    private static void ejemplo1() {
        PapasMargaritaImpl papasQueso = new PapasMargaritaImpl("Queso");
        papasQueso.setPrecio(2000);

        PapasMargaritaImpl papasOriginal = new PapasMargaritaImpl();
        papasOriginal.setPrecio(papasQueso.getPrecio());


        PapasMargaritaImpl papasClonadas = (PapasMargaritaImpl) papasOriginal.clonar();

        System.out.println(papasQueso);
        System.out.println(papasOriginal);
        System.out.println(papasClonadas);
    }
}
