package ejercicio2;

public class Main {
	public static void main(String[] args) {
		Tarjeta t1 = new Tarjeta("Avril Goncalves", 1234);
		BilleteraVirtual bv1 = new BilleteraVirtual("Ramiro Lopez", "Mercado Pago");
		
		t1.procesarPago(1000000);
		bv1.procesarPago(5000);
		
		t1.procesarPago(-5000);
		bv1.procesarPago(-200);
	}

}
