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

public class NegocioTest {

	private Marca marca;
	private Origen origen;
	private Camisa camisa;
	private Zapato zapato;
	private Saco saco;
	private Pantalon pantalon;
	private Sombrero sombrero;

	private ArrayList<Prenda> prendasVenta1;
	private ArrayList<Prenda> prendasVenta2;
	private ArrayList<Venta> ventas;
	private Venta venta1;
	private Venta venta2;

	private Negocio macowins;

	@Before
	public void setup() {
		marca = mock(Marca.class);
		origen = mock(Origen.class);

		camisa = new Camisa(origen, marca);
		zapato = new Zapato(origen, marca, 38);
		saco = new Saco(origen, marca, 5);
		pantalon = new Pantalon(origen, marca, 20);
		sombrero = new Sombrero(origen, marca, 2);

		prendasVenta1 = new ArrayList<Prenda>();
		prendasVenta1.add(camisa);
		prendasVenta1.add(zapato);
		prendasVenta1.add(saco);

		prendasVenta2 = new ArrayList<Prenda>();
		prendasVenta2.add(pantalon);
		prendasVenta2.add(sombrero);

		venta1 = new Venta(LocalDate.of(2015, 04, 22), prendasVenta1);
		venta2 = new Venta(LocalDate.of(2015, 04, 22), prendasVenta2);

		ventas = new ArrayList<Venta>();
		ventas.add(venta1);
		ventas.add(venta2);

		macowins = new Negocio(ventas);

	}

	@Test
	public void elValorDeLaRecaudacionDeUnNegocioEsElCorrecto() {

		when(marca.coeficiente(anyDouble())).thenReturn(1.0);
		when(origen.tasaImp()).thenReturn(1.0);

		assertEquals(1633.5, macowins.gananciaDe(LocalDate.of(2015, 04, 22)), 0);

		verify(marca, times(7)).coeficiente(anyDouble());
		verify(origen, times(7)).tasaImp();
	}

}
