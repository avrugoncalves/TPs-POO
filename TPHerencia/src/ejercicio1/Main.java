package ejercicio1;

public class Main {

	public static void main(String[] args) {
		Empleado emp1 = new Empleado("Pedro Sánchez", 33, 250999.50);
		System.out.println("El empleado es: " + emp1.getNombre() + ", de: " + emp1.getEdad() + " años de edad. Posee un salario de: $" + emp1.getSalario());

	}

}
