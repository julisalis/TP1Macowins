package ar.com.ddsutn.TP1Macowins;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class PrendaTestMock {

	private Marca marca;
	private Nacional nacional;

	private Camisa camisaNacional;
	private Pantalon pantalonNacional;
	private Zapato zapatoNacional;
	private Saco sacoNacional;
	private Sombrero sombreroNacional;

	@Before
	public void setup() {
		marca = mock(Marca.class);
		nacional = new Nacional();

		camisaNacional = new Camisa(nacional, marca);
		pantalonNacional = new Pantalon(nacional, marca, 100);
		zapatoNacional = new Zapato(nacional, marca, 40);
		sacoNacional = new Saco(nacional, marca, 5);
		sombreroNacional = new Sombrero(nacional, marca, 5);

	}

	@Test
	public void precioFinalDeUnaCamisaDaValorCorrecto() {

		when(marca.coeficiente(anyDouble())).thenReturn(1.0);

		assertEquals(300.0, camisaNacional.precioFinal(), 0);

		verify(marca, times(1)).coeficiente(anyDouble());

	}

	@Test
	public void precioFinalDeUnPantalonDaValorCorrecto() {

		when(marca.coeficiente(anyDouble())).thenReturn(1.0);

		assertEquals(450.0, pantalonNacional.precioFinal(), 0);

		verify(marca, times(1)).coeficiente(anyDouble());
	}

	@Test
	public void precioFinalDeUnZapatoDaValorCorrecto() {

		when(marca.coeficiente(anyDouble())).thenReturn(1.0);

		assertEquals(700.0, zapatoNacional.precioFinal(), 0);

		verify(marca, times(1)).coeficiente(anyDouble());
	}

	@Test
	public void precioFinalDeUnSacoDaValorCorrecto() {

		when(marca.coeficiente(anyDouble())).thenReturn(1.0);

		assertEquals(450.0, sacoNacional.precioFinal(), 0);

		verify(marca, times(1)).coeficiente(anyDouble());
	}

	@Test
	public void precioFinalDeUnSombreroDaValorCorrecto() {

		when(marca.coeficiente(anyDouble())).thenReturn(1.0);

		assertEquals(255.0, sombreroNacional.precioFinal(), 0);

		verify(marca, times(1)).coeficiente(anyDouble());
	}

}
