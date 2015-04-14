package ar.com.ddsutn.TP1Macowins;

public abstract class Prenda {
	private static int valorFijo = 100;
	private Origen origen;
	private Marca marca;
	
	public Prenda(){
	}
	
	public double precioFinal(){
		return ((double)valorFijo + (double)this.precioBase()) * (getOrigen().tasaImp() * marca.coeficiente(this.precioBase()));
	}
	
	protected abstract double precioBase();

	public Origen getOrigen() {
		return origen;
	}

	public void setOrigen(Origen origen) {
		this.origen = origen;
	}

}
