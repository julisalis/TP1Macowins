package ar.com.ddsutn.TP1Macowins;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class Venta {
	private LocalDate fecha;
	private Collection<Prenda> prendas;

	public Venta(LocalDate fecha, ArrayList<Prenda> prendasVenta) {
		this.fecha = fecha;
		this.prendas = prendasVenta;
	}

	public double valorVenta() {
		double valorFinal = prendas.stream()
				.mapToDouble(prenda -> prenda.precioFinal()).sum();
		return valorFinal;
	}

	public boolean sosDe(LocalDate fechaVenta) {
		return this.fecha == fechaVenta;
	}

}
