package p_10_3_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P_10_3_1 {

	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Alumno alum [] = null;
		
		tamañoClase(alum);
	}

	private static void tamañoClase(Alumno[] alum) {
		boolean error=false;
		do {
			try {
				System.out.println("Cuantos alumnos tiene la clase");
				alum=new Alumno[sc.nextInt()];
				error=true;
			}catch (NegativeArraySizeException e) {
				System.out.println("ERROR, DEBE INTRODUCIR UN NÚMERO POSITIVO");
				sc.next();
			}catch(InputMismatchException e) {
				System.out.println("ERROR, DEBE INTRODUCIR UN NÚMERO ENTERO");
				sc.next();
			}
		}while(!error);
	}

}
