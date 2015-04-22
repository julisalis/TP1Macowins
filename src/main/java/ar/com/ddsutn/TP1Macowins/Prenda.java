package ar.com.ddsutn.TP1Macowins;

public abstract class Prenda {
	private static double valorFijo = 100;
	private Origen origen;
	private Marca marca;
	
	public Prenda(Origen origen, Marca marca){
		this.origen = origen;
		this.marca = marca;
	}
	
	public double precioFinal(){
		return ((valorFijo + (this.precioBase())) * (this.origen.tasaImp() * this.marca.coeficiente(this.precioBase())));
	}
	
	protected abstract double precioBase();


}
