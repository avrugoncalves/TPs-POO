package formas;

public class Rectangulo extends Figura {
	public Rectangulo(Double base, Double altura) {
		super(base, altura);
	}

	@Override
	public Double calcularArea () {
		return getBase() * getAltura();
	}
}
