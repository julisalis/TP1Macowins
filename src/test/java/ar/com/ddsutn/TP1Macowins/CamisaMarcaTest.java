package ar.com.ddsutn.TP1Macowins;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class CamisaMarcaTest {

	private Marca marca;
	private Camisa camisaNacional;

	@Before
	public void setup() {
		marca = mock(Marca.class);
		camisaNacional = new Camisa(new Nacional(), marca);
	}

	@Test
	public void precioFinalDeUnaCamisaDaValorCorrecto() {

		when(marca.coeficiente(anyDouble())).thenReturn(1.0);

		assertEquals(300.0, camisaNacional.precioFinal(), 0);

		verify(marca, times(1)).coeficiente(anyDouble());
	}

}
