package ejercicio2;

public class MedioPago {
	private String titular;
	
	public MedioPago(String titular) {
		this.titular = titular;
	}
	
	public String getTitular() {
		return titular; 
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void procesarPago(double monto) {
		if (monto <= 0) {
			System.out.println("Debe ingresar un monto valido");
		}
		else{
			System.out.println("Proesando pago por $" + monto);
		}
	}
}
