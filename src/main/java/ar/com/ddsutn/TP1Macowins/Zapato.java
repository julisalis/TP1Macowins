package ar.com.ddsutn.TP1Macowins;

public class Zapato extends Prenda{

	private int talle;
	
	
	public Zapato(int talle){
		this.talle = talle;
	}
	@Override
	protected double precioBase(){
		return 400+5*talle;
	}
	
}
