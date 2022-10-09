package p_10_4;

import java.util.GregorianCalendar;

public class Test_Herencia {

	public static void main(String[] args) {
		
		GregorianCalendar fechaCaducidad=new GregorianCalendar(21,9,2022);
		GregorianCalendar fechaEnvasado=null;
	
		porAgua Pescado=new porAgua(fechaCaducidad,"234", fechaEnvasado, "India",3,4);
		System.out.println(Pescado.descripcion());
		
		porAire Pizza=new porAire(fechaCaducidad,"23",fechaEnvasado,"Camerun",5,3,4,5,6);
		System.out.println(Pizza.descripcion());
		
		porNitrogeno Higado=new porNitrogeno(fechaCaducidad,"23",fechaEnvasado,"Catalunya",5,"por Nitrogeno",5);
		System.out.println(Higado.descripcion());
	}

}
