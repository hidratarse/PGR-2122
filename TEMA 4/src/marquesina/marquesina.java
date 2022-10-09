package marquesina;

import java.util.*;

public class marquesina {
	
	public static final int LIMITE = 80;
	
	public static void main (String [] args) {
			
		Scanner dato = new Scanner (System.in);
		
		String frase;
		
		char [] caracteres = new char [LIMITE];
		
		System.out.println("Introduce la frase que va en la marquesina");
		
		frase = dato.nextLine();
		
		for (int i = 0 ; i < frase.length() ; i++) {
			
			caracteres [i] = frase.charAt(i);
			
		}
		
		for (int j = 0 ; j < 200 ; j++) {
			
			try {
				
				Thread.sleep(500);
			
			} catch (Exception e) {
				
				System.out.println(e);
			
			} 
	
			visualizarFrase(caracteres);
		
			desplazarLetras(caracteres);
			
		}
		dato.close();
	}
	
	public static void visualizarFrase (char [] c) {
		
		for (int i = 0 ; i < c.length ; i++) {
			
			System.out.print(c[i]);
			
		}
		
		System.out.print("\r");
		
	}
	
	public static void desplazarLetras (char [] c) {
		
		char letraPrimera = c[0] ;
		
		for (int i = 0 ; i <= c.length-2; i++) {
			
			c [i] = c [i+1] ;
			
		}
		
		c [c.length - 1] = letraPrimera ;
		
	}
	
}