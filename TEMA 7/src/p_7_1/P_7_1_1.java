package p_7_1;

import java.util.*;

public class P_7_1_1 {

	public static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo rectangulo=new Rectangulo();
		
		System.out.println("Introduce la base del rectangulo");
		rectangulo.base=sc.nextInt();
		
		System.out.println("Introduce la altura del rectangulo");
		rectangulo.altura=sc.nextInt();
		boolean terminar=false;
		do {
			System.out.println("Introduce la opción que deseas ejecutar \n1-Pintar \n2-Pintar con símbolo \n3-Pintar invertido \n4-Centrar horizontalmente "
					+ "\n5-Centrar en pantalla \n6-Calcular el area \n7-Calcular el perímetro \n8-SALIR");
			int opcion = sc.nextInt();
			
			switch (opcion) {
			case 1:
				rectangulo.pintar();
				break;
			case 2:
				System.out.println("Introduce el signo a pintar");
				sc.nextLine();
				rectangulo.signo=sc.next();
				rectangulo.pintarSigno();
				break;
			case 3:
				rectangulo.invertir();
				break;
			case 4:
				rectangulo.centrarHorizontal();
				break;
			case 5:
				rectangulo.centrarPantalla();
				break;
			case 6:
				rectangulo.calcularArea();
				break;
			case 7:
				rectangulo.calcularPerimetro();
				break;
			case 8:
				terminar=true;
				break;
			default:
				break;
			}
		}while(!terminar);
	}
}

