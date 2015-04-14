package ar.com.ddsutn.TP1Macowins;

public class Saco extends Prenda{
	
	private int cantBotones;
	
	@Override
	protected double precioBase(){
		return 300+10*cantBotones;
	}
}
