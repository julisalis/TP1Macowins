package ar.com.ddsutn.TP1Macowins;

public class Pantalon extends Prenda{
	
	private double telaUsada;
	
	public Pantalon(Origen origen,Marca marca,double telaUsada){
		this.telaUsada= telaUsada;
		this.setMarca(marca);	
		this.setOrigen(origen);
	}

	@Override
	protected double precioBase(){
		return 250+telaUsada;
	}

}
