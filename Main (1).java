package Ej5;

public class Main {

	public static void main(String[] arg) {
		/*
		Texto texto1 = new Texto(10);
		
		texto1.caracterAlFinal('H');
        texto1.cadenaAlFinal("ola");
        texto1.caracterAlPrincipio('1');

        System.out.println("Texto actual: " + texto1.obtenerCadena());
        System.out.println("Número de vocales: " + texto1.contarVocales());
		*/
		Texto t1=new Texto("OLA",14);
		Texto t2=new Texto("ELLO",5);

		t1.muestraCadena();		
		t1.addCaracterDelante('M');
		t1.muestraCadena();
		t1.addCaracterDetras('S');
		t1.muestraCadena();
		t1.addCadenaDetras("mucho");
		t1.muestraCadena();
		t1.addCadenaDelante("pues");
		t1.muestraCadena();
		System.out.println();
		t1.cuentaVocales();
		
		System.out.println();
		t2.muestraCadena();		
		t2.addCaracterDelante('H');
		t2.muestraCadena();
	}
}
