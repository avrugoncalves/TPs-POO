package formas;

public class Main {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		r1.setBase(180.50);
		r1.setAltura(50.00);
		
		System.out.println("El área es: " + r1.calcularArea());
		
		
		
		Triangulo tr1 = new Triangulo();
		tr1.setBase(149.50);
		tr1.setAltura(55.40);
		
		System.out.println("El área es: " + tr1.calcularArea());
		
	}

}
