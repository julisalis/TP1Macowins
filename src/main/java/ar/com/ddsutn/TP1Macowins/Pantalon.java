package ar.com.ddsutn.TP1Macowins;

public class Pantalon extends Prenda{
	
	private double telaUsada;
	@Override
	protected double precioBase(){
		return 250+telaUsada;
	}

}
