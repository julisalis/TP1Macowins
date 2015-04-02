package ar.com.ddsutn.TP1Macowins;

public class Test {
	public static void main (String[] args){
		Saco saco = new Saco();
		Importado importado = new Importado();
		saco.setOrigen(importado);
		Pantalon pantalon = new Pantalon();
		Nacional nacional = new Nacional();
		pantalon.setOrigen(nacional);
		
		Venta venta1 = new Venta();
		venta1.getPrendas().add(saco);
		venta1.getPrendas().add(pantalon);
		System.out.println(venta1.valorVenta());
		venta1.setFecha(01042015);
		
		Venta venta2 = new Venta();
		venta2.getPrendas().add(pantalon);
		System.out.println(venta2.valorVenta());
		venta2.setFecha(02042015);
		
		Negocio negocio = new Negocio();
		negocio.getVentas().add(venta1);
		negocio.getVentas().add(venta2);
		System.out.println(negocio.gananciaDe(01042015));
		
	}
}
