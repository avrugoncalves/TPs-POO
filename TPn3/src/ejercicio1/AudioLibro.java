package ejercicio1;

public class AudioLibro extends MaterialDigital{
	public AudioLibro(String titulo) {
		super(titulo);
	}
	
	@Override
	public void mostrarDescripcion(){
		System.out.println(getTitulo() + " se puede escuchar");
	}
}
