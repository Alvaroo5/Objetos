package prueba;

public class Pato extends Ave{

	Pato(){
		   super(); //Usamos constructor del padre
	   }
	
	   @Override
	   public void comunicarse() {
		   System.out.println("Cua cua!");
	   }
	   

}
