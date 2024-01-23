package prueba;

public class principal {

	public static void main(String[] args) {
		/*
	    Estudiante e1 = new Estudiante();
		Estudiante e2 = new Estudiante();
		Estudiante e3 = new Estudiante();
		
		System.out.println("# de estud.: "+e1.numero_estudiantes);
		System.out.println("# de estud.: "+e2.numero_estudiantes);
		System.out.println("# de estud.: "+e3.numero_estudiantes);
		System.out.println("# de estud.: "+ Estudiante.numero_estudiantes);
		*/
		Estudiante e1 = new Estudiante();
		
		System.out.println(e1.nombre);
		// System.out.println(e1.edad); da error porque es privada
		System.out.println(e1.dame_edad());
	}
}
