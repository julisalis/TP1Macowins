package ar.com.ddsutn.TP1Macowins;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Negocio {
	private List<Venta> ventas;
	
	public Negocio(){
		setVentas(new ArrayList<Venta>());
	}
	
	public List<Venta> ventasDe(LocalDate fechaVenta){
		List<Venta> ventasDeFecha = getVentas().stream().filter(venta -> venta.sosDe(fechaVenta)).collect(Collectors.toList());
		return ventasDeFecha;
	}
	
	public double gananciaDe(LocalDate fechaVenta){
		List<Venta> listaVentas = this.ventasDe(fechaVenta);
		double gananciaFinal = listaVentas.stream().mapToDouble(venta -> venta.valorVenta()).sum();
		return gananciaFinal;
	}

	public List<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}

}
