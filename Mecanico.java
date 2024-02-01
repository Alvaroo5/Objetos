package Ej19;

public class Mecanico extends Personal {
    private String telefono;
    private String especialidad;

    Mecanico(String nombre, String telefono, String especialidad) {
        super(nombre);
        this.telefono = telefono;
        this.especialidad = especialidad;
    }
}

