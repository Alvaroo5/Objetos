package POO;

public class CuentaCorriente {
    private double saldo;
    private double limiteDescubierto;
    private String nombreTitular;
    private String dniTitular;

    // Constructor
    public CuentaCorriente(String nombreTitular, String dniTitular) {
        this.saldo = 0;
        this.limiteDescubierto = -50;
        this.nombreTitular = nombreTitular;
        this.dniTitular = dniTitular;
    }

    // Método para sacar dinero
    public boolean sacarDinero(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a sacar debe ser mayor que 0.");
            return false;
        }

        if (saldo - cantidad >= limiteDescubierto) {
            saldo -= cantidad;
            System.out.println("Se ha retirado $" + cantidad + " de la cuenta.");
            return true;
        } else {
            System.out.println("No se puede realizar la operación. Fondos insuficientes.");
            return false;
        }
    }

    // Método para ingresar dinero
    public void ingresarDinero(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Se ha ingresado $" + cantidad + " en la cuenta.");
        } else {
            System.out.println("La cantidad a ingresar debe ser mayor que 0.");
        }
    }

    // Método para mostrar información de la cuenta
    public void mostrarInformacion() {
        System.out.println("Información de la cuenta:");
        System.out.println("Titular: " + nombreTitular);
        System.out.println("DNI: " + dniTitular);
        System.out.println("Saldo: $" + saldo);
        System.out.println("Límite de Descubierto: $" + limiteDescubierto);
    }
}
