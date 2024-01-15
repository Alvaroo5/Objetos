package POO;

public class Main {

	  public static void main(String[] args) {
	        // Ejemplo de uso
	        CuentaCorriente cuenta = new CuentaCorriente("Juan Perez", "123456789");
	        cuenta.mostrarInformacion();

	        cuenta.ingresarDinero(1000);
	        cuenta.mostrarInformacion();

	        cuenta.sacarDinero(200);
	        cuenta.mostrarInformacion();

	        cuenta.sacarDinero(800);
	        cuenta.mostrarInformacion();
	    }
}
