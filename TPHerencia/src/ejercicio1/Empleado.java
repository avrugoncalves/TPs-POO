package ejercicio1;

public class Empleado extends Persona{
	private Double salario;

	public Empleado(String nombre, Integer edad, Double salario) {
		super(nombre, edad);
		this.salario = salario;
	}

	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double saldo) {
		this.salario = salario;
	}
}
