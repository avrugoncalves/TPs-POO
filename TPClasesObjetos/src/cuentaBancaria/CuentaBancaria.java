package cuentaBancaria;

public class CuentaBancaria {
	private Double saldo;
	
	public CuentaBancaria(Double saldo) {
		this.saldo = saldo;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
}