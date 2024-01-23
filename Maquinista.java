package Ej19;

public class Maquinista extends Personal {
    private double sueldoMensual;
    private String rango;
    private String dni;
    
    Maquinista(String nombre, String dni, double sueldoMensual, String rango) {
        super(nombre);
        this.sueldoMensual = sueldoMensual;
        this.rango = rango;
        this.dni=dni;
    }
}

