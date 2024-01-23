package Ej110;
public class Hora {
		private int hora;
		private int minuto;
		private int segundo;
		
		//Constructor
		 Hora(int hora, int minuto, int segundo) {
		        this.hora = hora;
		        this.minuto = minuto;
		        this.segundo = segundo;
		 }
		 
		 //Recibir y poner hora
		 public int getHora() {
			 return hora;
		 }
		 
		 public void setHora(int hora) {
			 this.hora=hora;
		 }
		 
		 //Recibir y poner minutos
		 public int getMinuto() {
			 return minuto;
		 }
		 
		 public void setMinuto(int minuto) {
			 this.minuto=minuto;
		 }
		 
		 //Recibir y poner segundo
		 public int getSegundo() {
			 return segundo;
		 }
		 
		 public void setSegundo(int segundo) {
			 this.segundo=segundo;
		 }
		 
		 public void sumarSegundos(int segundos) {
		        int totalSegundos = this.hora * 3600 + this.minuto * 60 + this.segundo + segundos;

		        this.hora = totalSegundos / 3600;
		        this.minuto = (totalSegundos % 3600) / 60;
		        this.segundo = totalSegundos % 60;
		 }
		 
		 public void imprimirHora() {
		        System.out.printf("%02d:%02d:%02d\n", this.hora, this.minuto, this.segundo);
		 }
}

