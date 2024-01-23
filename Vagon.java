package Ej19;

class Vagon extends Maquinaria {
    private double capacidadMaxima;
    private double capacidadActual;
    private String tipoMercancia;

    Vagon(double capacidadMaxima, double capacidadActual, String tipoMercancia) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
        this.tipoMercancia = tipoMercancia;
    }
}
