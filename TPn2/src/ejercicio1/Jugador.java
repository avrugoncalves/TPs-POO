package ejercicio1;

public class Jugador {
	private String nombre;
	private Integer nivel;
	private Integer puntos;
	
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		nivel = 1;
		puntos = 0;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getNivel() {
		return nivel;
	}

	public Integer getPuntos() {
		return puntos;
	}

	
	public void ganarPuntos(int cantidad) {
		if (cantidad <= 0) {
			System.out.println("Debe ingresar una cantidad válida de puntos");
		}
		else {
			puntos += cantidad;
			System.out.println("El jugador tiene actualmente: " + puntos + " puntos");
		}
	}
	
	public void subirNivel() {
		nivel += 1;
		System.out.println("El jugador ha subido un nivel. Nivel actual: " + nivel);
	}
}
