package cuentaBancaria;

public class Main {

	public static void main(String[] args) {
		CuentaBancaria cb1 = new CuentaBancaria(500.50);
		cb1.setSaldo(5000.00);
		System.out.println(cb1.getSaldo());

	}

}
