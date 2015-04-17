package ar.com.ddsutn.TP1Macowins;

public class Sombrero extends Prenda{

	private double cMetrosexual;
	
	public Sombrero(Origen origen,Marca marca,double cMetro){
		this.cMetrosexual = cMetro;
		this.setMarca(marca);	
		this.setOrigen(origen);
	}
	
	@Override
	protected double precioBase(){
		return 150+cMetrosexual;
	}
	
}
