package ar.com.ddsutn.TP1Macowins;

import static org.junit.Assert.*;
import mock.MarcaMock;
import org.junit.Test;

public class PrendaTest {

	@Test
	public void elPrecioFinalDeUnaCamisaEsElCorrecto() {
		MarcaMock marca = new MarcaMock(1.65);
		Camisa camisa = new Camisa(new Importado(), marca);
		assertEquals(643.5, camisa.precioFinal(), 0);

	}

	@Test
	public void elPrecioFinalDeUnSacoEsElCorrecto() {
		MarcaMock marca = new MarcaMock(1.35);
		Saco saco = new Saco(new Nacional(), marca, 5);
		assertEquals(607.5, saco.precioFinal(), 0);

	}

	@Test
	public void elPrecioFinalDeUnPantalonEsElCorrecto() {
		MarcaMock marca = new MarcaMock(1.15);
		Pantalon pantalon = new Pantalon(new Nacional(), marca, 20.5);
		assertEquals(426.075, pantalon.precioFinal(), 0);

	}

}
