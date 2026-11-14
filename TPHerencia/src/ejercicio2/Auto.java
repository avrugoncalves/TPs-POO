package ejercicio2;

public class Auto extends Vehiculo{
	private Integer cant_Puertas;

	public Auto(String marca, String modelo, Integer cant_Puertas) {
		super(marca, modelo);
		this.cant_Puertas = cant_Puertas;
	}

	public Integer getCant_Puertas() {
		return cant_Puertas;
	}
	public void setCant_Puertas(Integer cant_Puertas) {
		this.cant_Puertas = cant_Puertas;
	}

	public void mostrarDatos() {
		System.out.println("El auto es un: " + getMarca() + " " + getModelo() + ". Cuenta con " + cant_Puertas + " puertas.");
	}
}
