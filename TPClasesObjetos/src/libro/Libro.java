package libro;

public class Libro {
	private String titulo;
	private String autor;
	private Integer año;
	
	
	public Libro(String titulo, String autor, Integer año) {
		this.titulo = titulo;
		this.autor = autor;
		this.año = año;
	}


	@Override
	public String toString() {
		return "El libro es " + titulo + ", autor " + autor + ", año " + año;
	}
	
}
