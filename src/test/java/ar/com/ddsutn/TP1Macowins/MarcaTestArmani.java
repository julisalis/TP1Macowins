package ar.com.ddsutn.TP1Macowins;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MarcaTestArmani {
	
	private Armani armani;
	
	@Before
	public void setup(){
		armani= new Armani();
	}
	

	@Test
	public void coeficienteDeMarcaArmaniEsElCorrecto(){	
		//Operaciones
		Double coeficiente = armani.coeficiente(500.0);
		//Postcondicion
		assertEquals((Double)1.65,coeficiente);
	}

}
