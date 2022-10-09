package p11_4;

import java.util.GregorianCalendar;

public class Test_Herencia {

	public static void main(String[] args) {
		
		GregorianCalendar fechaCaducidad=new GregorianCalendar(21,9,2022);
		GregorianCalendar fechaEnvasado=null;
	
		Congelado congelados[]=new Congelado[4];
		
		congelados[0]=new Congelado(fechaCaducidad,"111",fechaEnvasado,"España", 20 );
		
		congelados [1]=new porAgua(fechaCaducidad,"234", fechaEnvasado, "India",3,4);
		
		congelados [2]=new porAire(fechaCaducidad,"23",fechaEnvasado,"Camerun",5,3,4,5,6);
		
		congelados[3]=new porNitrogeno(fechaCaducidad,"23",fechaEnvasado,"Catalunya",5,"por Nitrogeno",5);
		
		for (Congelado c:congelados) {
			System.out.println(c.descripcion());
		}
	}

}
