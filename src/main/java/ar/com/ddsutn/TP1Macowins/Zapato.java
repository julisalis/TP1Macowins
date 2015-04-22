package ar.com.ddsutn.TP1Macowins;

public class Zapato extends Prenda {

	private double talle;

	public Zapato(Origen origen, Marca marca, double talle) {
		super(origen, marca);
		this.talle = talle;
	}

	@Override
	protected double precioBase() {
		return 400 + 5 * talle;
	}

}
