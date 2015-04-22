package ar.com.ddsutn.TP1Macowins;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MarcaTest {

	private Sarkany sarkany;
	private Armani armani;

	@Before
	public void setUp() {
		sarkany = new Sarkany();
		armani = new Armani();
	}

	@Test
	public void coeficienteDeMarcaSarkanyEsElCorrecto() {

		Double coeficiente = sarkany.coeficiente(500.0);
		assertEquals((Double) 1.1, coeficiente);
	}

	@Test
	public void coeficienteDeMarcaSarkanyEsElCorrecto2() {

		Double coeficiente = sarkany.coeficiente(510.0);
		assertEquals((Double) 1.35, coeficiente);
	}

	@Test
	public void coeficienteDeMarcaArmaniEsElCorrecto() {

		Double coeficiente = armani.coeficiente(500.0);
		assertEquals(1.65, coeficiente, 0);
	}

	@Test
	public void coeficienteDeMarcaArmaniEsElCorrecto2() {

		Double coeficiente = armani.coeficiente(1000.0);
		assertEquals(1.65, coeficiente, 0);
	}

}
