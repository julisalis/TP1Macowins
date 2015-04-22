package ar.com.ddsutn.TP1Macowins;

import java.time.LocalDate;
import java.util.ArrayList;


public class Test {
	public static void main (String[] args){
		
		Saco saco = new Saco(new Nacional(),new Armani(),1);
		Pantalon pantalon = new Pantalon(new Nacional(),new Armani(),1);
		
		ArrayList<Prenda> prendas = new ArrayList<Prenda>();
		prendas.add(saco);
		prendas.add(pantalon);
		
		Venta venta1 = new Venta(LocalDate.of(2015,04,22), prendas);
		System.out.println(venta1.valorVenta());
		
		
		/*Venta venta2 = new Venta();
		venta2.getPrendas().add(pantalon);
		System.out.println(venta2.valorVenta());
		venta2.setFecha(LocalDate.of(2015,04,02));*/
		
		ArrayList<Venta> ventas = new ArrayList<Venta>();
		ventas.add(venta1);
		
		Negocio negocio = new Negocio(ventas);
		System.out.println(negocio.ventasDe(LocalDate.of(2015,04,22)));
		
	}
}
