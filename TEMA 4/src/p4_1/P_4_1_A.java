package p4_1;
import java.util.*;
public class P_4_1_A {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);

		System.out.println("Introduce la secuencia que quieras guardar");

		String num = sc.next();
		
		int vector[]= new int [num.length()];
		int vector2[]= new int [num.length()];
		
		for(int i=0; i<vector.length; i++) {
			vector[i] = Integer.parseInt(String.valueOf(num.charAt(i)));
			
		}
		
		for(int i=0; i<vector.length; i++) {
			
			vector2[i]=vector[vector.length-1-i];
		}
		
		boolean comp=true;
		
		for(int i=0; i<vector.length;i++) {
			
			if(vector[i]!=vector2[i]) {
				comp=false;
			}
		}
		
		if(comp)
			System.out.println("El numero "+num+" es capicua");
		else
			System.out.println("El numero "+num+" no es capicua");
		
		sc.close();
		
	}
}