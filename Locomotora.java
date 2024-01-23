package Ej19;

public class Locomotora extends Maquinaria {
    private String matricula;
    private double potenciaMotor;
    private int anioFabricacion;
    private Mecanico mecanicoEncargado;

    Locomotora(String matricula, double potenciaMotor, int anioFabricacion, Mecanico mecanicoEncargado) {
        this.matricula = matricula;
        this.potenciaMotor = potenciaMotor;
        this.anioFabricacion = anioFabricacion;
        this.mecanicoEncargado = mecanicoEncargado;
    }
}