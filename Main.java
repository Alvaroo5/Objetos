package Ej1;

public class Main {

	  public static void main(String[] args) {
		  
		  	Banco bbva = new Banco("BBVA");
	        CuentaCorriente cuenta = new CuentaCorriente("Juan Perez", "123456789", bbva);
	        cuenta.mostrarInformacion();
	        
	        cuenta.ingresarDinero(1000);
	        cuenta.sacarDinero(200);
	        System.out.println();
	        cuenta.mostrarInformacion();

	    }
}
