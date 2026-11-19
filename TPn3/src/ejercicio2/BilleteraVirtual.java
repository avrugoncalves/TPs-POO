package ejercicio2;

public class BilleteraVirtual extends MedioPago{
	private String nombreAplicacion;

	public BilleteraVirtual(String titular, String nombreAplicacion) {
		super(titular);
		this.nombreAplicacion = nombreAplicacion;
	}
	
	@Override
	public void procesarPago(double monto) {
		if (monto <= 0) {
			System.out.println("Debe ingresar un monto valido");
		}
		else {
			System.out.println("El tipo de pago elegido es: Billetera Virtual. Está pagando mediante: " + nombreAplicacion + ". El titular de la cuenta es: " + getTitular() + ". El monto pagado es: $" + monto);			
		}
	}
}