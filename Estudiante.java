package prueba;

public class Estudiante {
	/*
	static int numero_estudiantes = 0;
	
	String nombre;
	int edad;
	String direccion;
	
	Estudiante(){
		numero_estudiantes++;
	}
	*/
	String nombre;
	// private int edad;
	protected int edad; // tiene visivilidad la clase y su hijo
	
	int dame_edad() {
		return edad;
	}
	
	String dame_nombre() {
		return nombre;
	}
}
