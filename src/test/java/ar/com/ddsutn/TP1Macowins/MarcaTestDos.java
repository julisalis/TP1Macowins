package ar.com.ddsutn.TP1Macowins;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test; 

public class MarcaTestDos {
	
	private Sarkany sarkany;
	
	@Before
	public void setup(){
		//Escribo los fixture aca
		sarkany = new Sarkany();
	}
	
	
	@Test
	public void coeficienteDeMarcaSarcanyEsElCorrecto(){
		//Operaciones
		Double coeficiente = sarkany.coeficiente(500.0);
		//Postcondicion
		assertEquals((Double)1.1,coeficiente);
	}

	@Test
	public void coeficienteDeMarcaSarkanyEsElCorrecto(){	
		//Operaciones
		Double coeficiente = sarkany.coeficiente(510.0);
		//Postcondicion
		assertEquals((Double)1.35,coeficiente);
	}
	
	
}
