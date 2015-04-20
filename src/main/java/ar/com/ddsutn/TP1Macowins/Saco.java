package ar.com.ddsutn.TP1Macowins;

public class Saco extends Prenda {

	private int cantBotones;

	public Saco(Origen origen, Marca marca, int cantBotones) {
		super(origen, marca);
		this.cantBotones = cantBotones;
	}

	@Override
	protected double precioBase() {
		return 300 + 10 * cantBotones;
	}
}
