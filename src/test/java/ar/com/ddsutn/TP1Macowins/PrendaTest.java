package ar.com.ddsutn.TP1Macowins;

import static org.junit.Assert.*;
import mock.MarcaMock;
import org.junit.Test;

public class PrendaTest {

	
	@Test
	public void elPrecioFinalDeUnaPrendaEsElCorrecto(){	
	MarcaMock marca = new MarcaMock(1.65);	
	Camisa camisa= new Camisa(new Importado(),marca);
	assertEquals(536.25, camisa.precioFinal(),0);
	
	}

}
