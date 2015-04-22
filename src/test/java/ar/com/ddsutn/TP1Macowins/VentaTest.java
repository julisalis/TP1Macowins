package ar.com.ddsutn.TP1Macowins;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class VentaTest {

	private Marca marca;
	private Origen origen;
	private Camisa camisa;
	private Zapato zapato;
	
	private ArrayList<Prenda> prendas;
	private Venta venta1;

	@Before
	public void setup() {
		marca = mock(Marca.class);
		origen = mock(Origen.class);
		
		camisa = new Camisa (origen, marca);
		zapato = new Zapato (origen, marca, 38);
		prendas = new ArrayList<Prenda>();
			
		prendas.add(camisa);
		prendas.add(zapato);
		venta1 = new Venta(LocalDate.of(2015,04,21), prendas);

	}

	@Test
	public void elValorDeUnaVentaEsElCorrecto() {

		when(marca.coeficiente(anyDouble())).thenReturn(1.0);
		when(origen.tasaImp()).thenReturn(1.0);

		assertEquals(990.0, venta1.valorVenta(), 0);

		verify(marca, times(2)).coeficiente(anyDouble());
		verify(origen, times(2)).tasaImp();
	}
	

}
