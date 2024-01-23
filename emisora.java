package Ej1;

public class emisora {
		private double frecuenciaMax=108.00;
		private double frecuenciaMin=80.00;
		private double saltoFrecuencia=0.50;
		private double frecuenciaActual;

		emisora(){
			this.frecuenciaActual=80.0;
		}
		
		public void display() {
			System.out.println("Se encuentra en: " + this.frecuenciaActual + " MHz");
		}

	    public void subirFrecuencia() {
	        this.frecuenciaActual += this.saltoFrecuencia;
	        ajustarFrecuencia();
	    }

	    public void bajarFrecuencia() {
	        this.frecuenciaActual -= this.saltoFrecuencia;
	        ajustarFrecuencia();
	    }

	    public void ajustarFrecuencia() {
	        if (this.frecuenciaActual < this.frecuenciaMin) {
	            this.frecuenciaActual = this.frecuenciaMax-this.saltoFrecuencia;
	        } else if (this.frecuenciaActual > this.frecuenciaMax) {
	            this.frecuenciaActual = this.frecuenciaMin+this.saltoFrecuencia;
	        }
	    }
}
