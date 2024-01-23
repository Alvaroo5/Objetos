package prueba;

public class Serpiente extends Reptil{

	public enum Especies{VIBORA, PITON, COBRA;}
	
	@Override
	public void comunicate() {
		System.out.println("sss, sss");
	}
	
	public void morder(Especies especie) {
		System.out.println("Me ha mordido una serpiente!");
		if(especie==Especies.COBRA) {
			this.muere();
		}
	}
	
	public static void muestraEspecies() {
		for(Especies esp: Especies.values()) {
			System.out.println(esp.name()+" - ");
		}
		System.out.println();
	}
}
