package ar.com.ddsutn.TP1Macowins;

public class Sombrero extends Prenda{

	private double cMetrosexual;
	
	@Override
	protected double precioBase(){
		return 150+cMetrosexual;
	}
	
}
