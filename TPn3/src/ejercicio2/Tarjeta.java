package ejercicio2;

public class Tarjeta extends MedioPago{
	private Integer ultimosCuatroDigitos;
	
	public Tarjeta(String titular, Integer ultimosCuatroDigitos) {
		super(titular);
		this.ultimosCuatroDigitos = ultimosCuatroDigitos;
	}
	
	@Override
	public void procesarPago(double monto) {
		if (monto <= 0) {
			System.out.println("Debe ingresar un monto valido");
		}
		else {
			System.out.println("El tipo de pago elegido es: Tarjeta. El titular de la tarjeta es: " + getTitular() + " y sus digitos finales de tarjeta son: " + ultimosCuatroDigitos + ". El monto pagado es: $" + monto);			
		}
	}
}
