package Ej22;

public class main {
	 public static void main(String[] args) {
	        PilaTabla miPila = new PilaTabla(3);

	        miPila.apilar(5);
	        miPila.apilar(10);
	        miPila.apilar(15);

	        System.out.println("Cima de la pila: " + miPila.cima());

	        System.out.println("Desapilando elementos:");
	        while (miPila.tamano > 0) {
	            System.out.println(miPila.desapilar());
	        }
	    }
}
