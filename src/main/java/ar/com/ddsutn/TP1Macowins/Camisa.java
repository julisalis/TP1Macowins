package ar.com.ddsutn.TP1Macowins;

public class Camisa extends Prenda{
	
	public Camisa(Origen origen,Marca marca){
	this.setMarca(marca);	
	this.setOrigen(origen);
	}
	
	@Override
	protected double precioBase(){
		return 200;
	}

}
