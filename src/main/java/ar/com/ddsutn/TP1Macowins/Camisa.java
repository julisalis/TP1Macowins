package ar.com.ddsutn.TP1Macowins;

public class Camisa extends Prenda {

	public Camisa(Origen origen, Marca marca) {
		super(origen, marca);
	}

	@Override
	protected double precioBase() {
		return 200;
	}

}
