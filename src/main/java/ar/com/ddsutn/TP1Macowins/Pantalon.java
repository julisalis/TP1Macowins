package ar.com.ddsutn.TP1Macowins;

public class Pantalon extends Prenda {

	private double telaUsada;

	public Pantalon(Origen origen, Marca marca, double telaUsada) {
		super(origen, marca);
		this.telaUsada = telaUsada;
	}

	@Override
	protected double precioBase() {
		return 250 + telaUsada;
	}

}
