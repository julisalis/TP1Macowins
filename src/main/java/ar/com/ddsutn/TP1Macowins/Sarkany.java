package ar.com.ddsutn.TP1Macowins;

public class Sarkany implements Marca{

	@Override
	public double coeficiente(double precioBase) {
		if (precioBase>500){
			return 1.35;
		}
		else{
			return 1.1;
		}
	}

	
}
