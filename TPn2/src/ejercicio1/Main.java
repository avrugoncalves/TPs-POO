package ejercicio1;

public class Main {
	public static void main(String[] args) {
		Jugador j1 = new Jugador("Marco");
		Jugador j2 = new Jugador("Laura");

		System.out.println("Nuevo jugador creado --> Nombre: "+ j1.getNombre() + " | Nivel: " + j1.getNivel() + " | Puntos obtenidos: " + j1.getPuntos() + " puntos");
		System.out.println("Nuevo jugador creado --> Nombre: "+ j2.getNombre() + " | Nivel: " + j2.getNivel() + " | Puntos obtenidos: " + j2.getPuntos() + " puntos");
	
		j1.ganarPuntos(500);
		j1.ganarPuntos(-500);
		
		j2.ganarPuntos(1200);
		
		j2.subirNivel();
	}

}
