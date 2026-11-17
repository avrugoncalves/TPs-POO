package ejercicio2;

public class Persona {
	private String nombre;
	private Integer edad;
	
	public Persona(String nombre, Integer edad) {
		if (edad <= 0) {
			System.out.println("La edad no puede ser negativa o 0");
		}
		else {
			this.nombre = nombre;
			this.edad = edad;	
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
}
