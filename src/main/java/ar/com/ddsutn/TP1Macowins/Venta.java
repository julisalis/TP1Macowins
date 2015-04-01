package ar.com.ddsutn.TP1Macowins;

import java.util.ArrayList;
import java.util.Collection;

public class Venta {
	private int fecha;
	private Collection<Prenda> prendas;
	
	public Venta(){
		setPrendas(new ArrayList<Prenda>());
	}
	
	public double valorVenta(){
		double valorFinal = 0.0;
		for (Prenda prenda : getPrendas()){
			valorFinal += prenda.precioFinal();
		}
		return valorFinal;
	}
	
	public boolean sosDe(int fechaVenta){
		return getFecha() == fechaVenta;
	}

	public Collection<Prenda> getPrendas() {
		return prendas;
	}

	public void setPrendas(Collection<Prenda> prendas) {
		this.prendas = prendas;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

}
