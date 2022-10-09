package pruebaPaquetes;

import vendedores.Vendedor;

import java.util.GregorianCalendar;

import productos.Producto;

public class Practica_9_3 {

	public static void main(String[] args) {
		
		Vendedor vend1= new Vendedor("0","Eren",new GregorianCalendar(13,3,2022),0.1);
		Vendedor vend2= new Vendedor("1","Zeke",new GregorianCalendar(1,9,2020),10.1);
		
		System.out.println(vend1.toString());
		System.out.println(vend2.toString());
		
		Producto prods []=new Producto[5];
		prods [0]=new Producto("0","Patata",1.00,5,3);
		prods [1]=new Producto("1","Carne",4.00,4,2);
		prods [2]=new Producto("2","Pescado",3.00,3,5);
		prods [3]=new Producto("3","Pasta",2.5,2,3);
		prods [4]=new Producto("4","Arroz",1.5,1,2);
		
		System.out.println("PRODUCTOS BAJO MÍNIMO\n------------------------------------");
		System.out.println("Codigo\tDenominacion\tStock Actual\tStockMinimo");
		for (int i = 0; i < prods.length; i++) {
			if(prods[i].getStockActual()<prods[i].getStockMinimo()) {
				System.out.println(prods[i].getCodigo()+"\t"+prods[i].getDenominacion()+"\t"+
						prods[i].getStockActual()+"\t"+prods[i].getStockMinimo());
			}
		}
	}
}
