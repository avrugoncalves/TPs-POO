package ejercicio2;

public class Docente extends Persona{
	private String materia;

	public Docente(String nombre, Integer edad, String materia) {
		super(nombre, edad);
		this.materia = materia;
	}

	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	public void mostrarInformacion() {
		System.out.println("El nombre del docente es " + getNombre() + ", su edad es de " + getEdad() + " años, y da la materia " + materia);
	}
}
