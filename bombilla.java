package Ej18;

public class bombilla {

	private boolean encendida;
	private boolean interruptor;
	
	public void estado() {
		encendida=false;
		interruptor=true;
	}
	
	public void encender() {
		if(interruptor) {
			encendida=true;
			System.out.println("Bombilla encendida");
		}else {
			encendida=false;
			System.out.println("No se puede encender la bombilla ya que el interruptor esta apagado");
		}
	}
	
	public void apagar() {
		encendida=false;
		System.out.println("Bombilla apagada");
	}
	
	public void encenderInterruptor() {    
		interruptor=true;
		System.out.println("Interruptor encendido");
	}
	
	public void apagarInterruptor() {
		interruptor=false;
		System.out.println("Interruptor apagado");
	}
	
	
	
}
