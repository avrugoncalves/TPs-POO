package formas;

public class Rectangulo extends Figura {
	@Override
	public Double calcularArea () {
		return getBase() * getAltura();
	}
}
