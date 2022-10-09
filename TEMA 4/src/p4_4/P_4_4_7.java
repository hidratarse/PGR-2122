package p4_4;

import java.util.*;

public class P_4_4_7 {
	public static void main (String[]args){
		String moneda[]={"dolar", "libra esterlina", "yen", "dirham"};
        double equivEuro[]={0.82, 1.072, 0.0075, 0.084};
        double cant;
        String monedaAct;
        String monedaConv;
        double euros=0;
		boolean encontrado = false;
		
        Scanner sc = new Scanner (System.in);

        System.out.print("Que moneda tienes?");
        monedaAct=sc.nextLine();

        System.out.print("Cuantas monedas tienes?");
        cant=sc.nextDouble();

		sc.nextLine();
        System.out.print("A que divisa quiere convertirlo?");
        monedaConv=sc.nextLine();

        for (int f=0;f<moneda.length&&(!encontrado);f++){
			if(monedaAct.equals(moneda[f])){
				encontrado=true;
				euros=cant*equivEuro[f];
				 System.out.printf("Introdujo %.1f %s son %.2f euros\n", cant, moneda[f], euros);
			}
        }
		if(!encontrado)System.out.print("No hay datos para esa convercion\n");
		
		else{
	
			encontrado = false;
		
			for (int f=0;f<moneda.length&&(!encontrado);f++){
				if(monedaConv.equals(moneda[f])){
					encontrado=true;
					 System.out.printf("Y recibe: %.2f %s",(euros/equivEuro[f]),monedaConv);
				}
			}
			if(!encontrado)System.out.print("No hay datos para esa convercion\n");
		}
		sc.close();
    }
}