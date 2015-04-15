package ar.com.ddsutn.TP1Macowins;

public class Sombrero extends Prenda{

	private double cMetrosexual;
	
	public Sombrero(double cMetro){
		this.cMetrosexual = cMetro;
	}
	@Override
	protected double precioBase(){
		return 150+cMetrosexual;
	}
	
}
