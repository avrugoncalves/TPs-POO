package formas;

public class Triangulo extends Figura {
	@Override
	public Double calcularArea () {
		return (getBase() * getAltura()) / 2;
	}
}
