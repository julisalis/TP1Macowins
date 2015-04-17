package ar.com.ddsutn.TP1Macowins;

import java.time.LocalDate;

public class Test {
	public static void main (String[] args){
		
		Saco saco = new Saco(new Importado(),new Armani(),2);
		Pantalon pantalon = new Pantalon(new Nacional(),new Armani(),25);
		
		Venta venta1 = new Venta();
		venta1.getPrendas().add(saco);
		venta1.getPrendas().add(pantalon);
		System.out.println(venta1.valorVenta());
		venta1.setFecha(LocalDate.of(2015,04,01));
		
		Venta venta2 = new Venta();
		venta2.getPrendas().add(pantalon);
		System.out.println(venta2.valorVenta());
		venta2.setFecha(LocalDate.of(2015,04,02));
		
		Negocio negocio = new Negocio();
		negocio.getVentas().add(venta1);
		negocio.getVentas().add(venta2);
		System.out.println(negocio.gananciaDe(LocalDate.of(2015,04,02)));
		
	}
}
