package Ej1;

import java.util.Scanner;

public class mainEmisora {

	 public static void main(String[] args) {
	        emisora sintonizador = new emisora();
	        
	        Scanner sc = new Scanner(System.in);
	        String respuesta;
	        
	        System.out.print("Introduce 1 para subir o 2 para bajar: ");
	        respuesta=sc.next();
	        
	        switch(respuesta) {
	        case "1":
	        	for (int i = 0; i < 58; i++) {
		            sintonizador.subirFrecuencia();
		            sintonizador.display();
		        }break;
	        case "2":
	        	for (int i = 0; i < 58; i++) {
		            sintonizador.bajarFrecuencia();
		            sintonizador.display();
		        }break;
	        }
	        
	    }

}
