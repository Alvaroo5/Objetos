package Ej19;

public class Tren extends Maquinaria {
    private Locomotora locomotora;
    private Vagon[] vagones;
    private Maquinista maquinistaResponsable;

    Tren(Locomotora locomotora, Vagon[] vagones, Maquinista maquinistaResponsable) {
        this.locomotora = locomotora;
        this.vagones = vagones;
        this.maquinistaResponsable = maquinistaResponsable;
    }
}