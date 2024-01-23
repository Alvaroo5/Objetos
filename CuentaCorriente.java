package Ej1;

public class CuentaCorriente {
	private double saldo;
    private double limiteDescubierto;
    private String nombreTitular;
    private String dniTitular;
    private Banco banco;
    
    public void cambiarBanco(Banco nuevoBanco) {
        this.banco = nuevoBanco;
    }
	
    CuentaCorriente(String nombreTitular, String dniTitular) {
        this.saldo = 0;
        this.limiteDescubierto = -50;
        this.nombreTitular = nombreTitular;
        this.dniTitular = dniTitular;
        this.banco = null;
    }
    
    CuentaCorriente(int saldo) {
        this.saldo = saldo;
        this.limiteDescubierto = 0;
        this.nombreTitular = nombreTitular;
        this.dniTitular = dniTitular;
    }
    
    CuentaCorriente(int limiteDescubierto, String dniTitular, int saldo) {
        this.saldo = saldo;
        this.limiteDescubierto = limiteDescubierto;
        this.nombreTitular = null;
        this.dniTitular = dniTitular;
    }
    
    public CuentaCorriente(String nombreTitular, String dniTitular, Banco banco) {
        this.saldo = 0;
        this.limiteDescubierto = -50;
        this.nombreTitular = nombreTitular;
        this.dniTitular = dniTitular;
        this.banco = banco;
    }
    
    public boolean sacarDinero(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a sacar debe ser mayor que 0.");
            return false;
        }

        if (saldo - cantidad >= limiteDescubierto) {
            saldo -= cantidad;
            System.out.println("Se ha retirado " + cantidad + " de la cuenta.");
            return true;
        } else {
            System.out.println("No se puede realizar la operación. No tienes saldo suficiente.");
            return false;
        }
    }

    public void ingresarDinero(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Se ha ingresado " + cantidad + " en la cuenta.");
        } else {
            System.out.println("La cantidad a ingresar debe ser mayor que 0.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Información de la cuenta:");
        System.out.println("Titular: " + nombreTitular);
        System.out.println("DNI: " + dniTitular);
        System.out.println("Saldo: " + saldo);
        System.out.println("Límite de Descubierto: " + limiteDescubierto);
        System.out.println("Banco: " + this.banco.getNombre());
        if (banco != null) {
            System.out.println("Banco vinculado:");
            banco.mostrarInformacion();
        } else {
            System.out.println("La cuenta no está vinculada a ningún banco.");
        }
    }
}