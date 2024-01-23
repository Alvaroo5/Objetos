package Ej19;

public class Mecanico extends Personal {
    private String telefono;
    private String especialidad;
    private  String dni;

    Mecanico(String nombre, String dni, String telefono, String especialidad) {
        super(nombre);
        this.telefono = telefono;
        this.especialidad = especialidad;
        this.dni=dni;
    }
}

