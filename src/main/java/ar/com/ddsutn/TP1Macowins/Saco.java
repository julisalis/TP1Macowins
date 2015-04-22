package ar.com.ddsutn.TP1Macowins;

public class Saco extends Prenda {

	private double cantBotones;

	public Saco(Origen origen, Marca marca, double cantBotones) {
		super(origen, marca);
		this.cantBotones = cantBotones;
	}

	@Override
	protected double precioBase() {
		return 300 + 10 * cantBotones;
	}
}
