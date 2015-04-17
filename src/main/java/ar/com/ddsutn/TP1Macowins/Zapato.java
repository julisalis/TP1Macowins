package ar.com.ddsutn.TP1Macowins;

public class Zapato extends Prenda{

	private int talle;
	
	
	public Zapato(Origen origen,Marca marca,int talle){
		this.talle = talle;
		this.setMarca(marca);
		this.setOrigen(origen);
	}
	@Override
	protected double precioBase(){
		return 400+5*talle;
	}
	
}
