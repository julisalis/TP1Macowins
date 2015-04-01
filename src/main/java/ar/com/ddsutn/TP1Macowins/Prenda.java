package ar.com.ddsutn.TP1Macowins;

public abstract class Prenda {
	private static int valorFijo;
	private Origen origen;
	
	public Prenda(){
		valorFijo = 100;
	}
	
	public double precioFinal(){
		return ((double)valorFijo + (double)this.precioBase()) * (getOrigen().tasaImp());
	}
	
	protected abstract int precioBase();

	public Origen getOrigen() {
		return origen;
	}

	public void setOrigen(Origen origen) {
		this.origen = origen;
	}

}
