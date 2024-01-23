package Ej1;

public class Banco {
    private String nombre;
	private double capital;
    private String direccionCentral;

    Banco(String nombre) {
        this.nombre = nombre;
        this.capital = 5.2; 
        this.direccionCentral = "Sin dirección";
    }
    
    Banco(String nombre, double capital) {
        this.nombre = nombre;
        this.capital = capital; 
        this.direccionCentral = "Sin dirección";
    }
    
    private void setNombre(String nombre) {
		this.nombre = nombre;
	}
    
    public String getNombre() {
		return nombre;
	}

	public void setCapital(double capital) {
        this.capital = capital;
    }

    public void setDireccionCentral(String direccionCentral) {
        this.direccionCentral = direccionCentral;
    }

    public void mostrarInformacion() {
        System.out.println("Información del Banco:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Capital: " + capital + " millones de euros");
        System.out.println("Dirección Central: " + direccionCentral);
    }
}
