package ar.com.ddsutn.TP1Macowins;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CamisaMarcaTest {
	
	private Marca marca;
	private Camisa camisaNacional;
	
	@Before
	public void setup(){	
		 marca = mock(marca.class);
		 camisaNacional= new Camisa(new Nacional(), marca);
	}

	@Test
	public void precioFinalDeUnaCamisaDaValorCorrecto() {
		
		when(marca.coeficiente(anyDouble()).thenReturn(1.0);
		
		assertEquals(250.0,camisaNacional.coeficiente(500.0));
		
		verify(marca,times(1)).coeficiente(anyDouble());	
	}

}
