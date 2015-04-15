package ar.com.ddsutn.TP1Macowins;

public class Saco extends Prenda{
	
	private int cantBotones;
	
	public Saco(int cantBotones){
		this.cantBotones = cantBotones;
	}
	@Override
	protected double precioBase(){
		return 300+10*cantBotones;
	}
}
