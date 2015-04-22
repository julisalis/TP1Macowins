package ar.com.ddsutn.TP1Macowins;

public class Sarkany implements Marca{

	@Override
	public double coeficiente(double precioBase) {
		
		return (precioBase>500) ? 1.35 : 1.1;
	}

	
}

