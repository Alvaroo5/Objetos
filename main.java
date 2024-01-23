package Ej110;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);

		int hora;
		int minuto;
		int segundo;
        int segundosSuma;
 
        System.out.print("Introduce la hora: ");
        hora = scanner.nextInt();
        System.out.print("Introduce los minutos: ");
        minuto = scanner.nextInt();
        System.out.print("Introduce los segundos: ");
        segundo = scanner.nextInt();

        Hora horaActual = new Hora(hora, minuto, segundo);

        System.out.print("Introduce la cantidad de segundos a sumar: ");
        segundosSuma = scanner.nextInt();

        horaActual.sumarSegundos(segundosSuma);

        System.out.println("Hora resultante después de sumar " + segundosSuma + " segundos: ");
        horaActual.imprimirHora();
    }
}
