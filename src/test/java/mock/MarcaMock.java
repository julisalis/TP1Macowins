package mock;

import ar.com.ddsutn.TP1Macowins.Marca;

public class MarcaMock implements Marca{

	double coeficiente; 
	
	public MarcaMock(double coeficiente){
		this.coeficiente= coeficiente;
	}
	
	@Override
	public double coeficiente(double precioBase) {
		return coeficiente;
	}

}
