package ejercicio2;

public class Main {
	public static void main(String[] args) {
		Docente d1 = new Docente("Laura", 32, "Inglés");
		Preceptor p1 = new Preceptor("Mirko", 28, "5to 3ra");
		
		d1.mostrarInformacion();
		p1.mostrarInformacion();
		
		d1.setEdad(29);
		p1.setEdad(33);
		
		d1.mostrarInformacion();
		p1.mostrarInformacion();
	}

}
