package varArgs;

import java.util.Arrays;

public class EjemploVarArgs {

	public static void main(String[] args) {
		
		vaTest("Zeke","Primero DAM1",4,5,6,7,6,8,4,3);
		
	}
	public static void vaTest(String nombre, String grupo, int...notas) {
		System.out.println("Nº de valores recibidos como argumento "+notas.length);
		for(int num:notas) {
			System.out.println(num);
		}
		Arrays.sort(notas);
		System.out.println(Arrays.toString(notas));
	}
}
