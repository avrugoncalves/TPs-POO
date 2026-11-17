package ejercicio2;

public class Preceptor extends Persona{
	private String cursoAsignado;

	public Preceptor(String nombre, Integer edad, String cursoAsignado) {
		super(nombre, edad);
		this.cursoAsignado = cursoAsignado;
	}

	public String getCursoAsignado() {
		return cursoAsignado;
	}
	public void setCursoAsignado(String cursoAsignado) {
		this.cursoAsignado = cursoAsignado;
	}

	public void mostrarInformacion() {
		System.out.println("El nombre del preceptor es " + getNombre() + ", su edad es de " + getEdad() + " años, y su curso asignado es " + cursoAsignado);
	}
}
