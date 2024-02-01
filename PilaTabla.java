package Ej22;

public class PilaTabla {

	    private Integer[] tabla;
	    private int capacidad;
	    protected int tamano;

	    public PilaTabla(int capacidad) {
	        this.capacidad = capacidad;
	        this.tabla = new Integer[capacidad];
	        this.tamano = 0;
	    }

	    public void apilar(Integer elemento) {
	        if (tamano < capacidad) {
	            tabla[tamano++] = elemento;
	        } else {
	            System.out.println("La pila está llena. No se puede apilar más.");
	        }
	    }

	    public Integer desapilar() {
	        if (tamano > 0) {
	            return tabla[--tamano];
	        } else {
	            System.out.println("La pila está vacía.");
	            return null;
	        }
	    }

	    public Integer cima() {
	        if (tamano > 0) {
	            return tabla[tamano - 1];
	        } else {
	            System.out.println("La pila está vacía.");
	            return null;
	        }
	    }
}
