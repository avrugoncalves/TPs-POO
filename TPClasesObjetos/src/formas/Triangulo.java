package formas;

public class Triangulo extends Figura {
	public Triangulo(Double base, Double altura) {
		super(base, altura);
	}

	@Override
	public Double calcularArea () {
		return (getBase() * getAltura()) / 2;
	}
}
