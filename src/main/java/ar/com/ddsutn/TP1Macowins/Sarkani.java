package ar.com.ddsutn.TP1Macowins;

public class Sarkani implements Marca{
	
	public double coeficiente(double precioBase){
		if (precioBase>=500){
			return precioBase*1.35;
		} 
		else{
			return precioBase*1.1;
		}
	}

}
