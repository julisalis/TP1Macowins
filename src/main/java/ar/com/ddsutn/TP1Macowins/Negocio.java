package ar.com.ddsutn.TP1Macowins;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Negocio {
	private List<Venta> ventas;
	
	public Negocio(){
		setVentas(new ArrayList<Venta>());
	}
	
	public List<Venta> ventasDe(int fechaVenta){
		List<Venta> ventasDeFecha = getVentas().stream().filter(v -> v.sosDe(fechaVenta)).collect(Collectors.toList());
		return ventasDeFecha;
	}
	
	public double gananciaDe(int fechaVenta){
		List<Venta> listaVentas = this.ventasDe(fechaVenta);
		double gananciaFinal = 0.0;
		for (Venta venta : listaVentas){
			gananciaFinal += venta.valorVenta();
		}
		return gananciaFinal;
	}

	public List<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}

}
