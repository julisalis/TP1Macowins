package ar.com.ddsutn.TP1Macowins;

public class Saco extends Prenda{
	
	private int cantBotones;
	
	public Saco(Origen origen,Marca marca,int cantBotones){
		this.cantBotones = cantBotones;
		this.setMarca(marca);	
		this.setOrigen(origen);
	}	

	@Override
	protected double precioBase(){
		return 300+10*cantBotones;
	}
}
