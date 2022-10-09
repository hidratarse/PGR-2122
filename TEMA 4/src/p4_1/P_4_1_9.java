package p4_1;
import java.util.*;
public class P_4_1_9 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);

		System.out.println("Introduce la secuencia que quieras guardar");

		String num = sc.next();
		
		int vector[]= new int [num.length()];
		
		for(int i=0; i<vector.length; i++) {
			vector[i] = Integer.parseInt(String.valueOf(num.charAt(i)));
			
			System.out.print(vector[i]+" ");
		}
		
		sc.close();
		
	}
}
/*
 * import java.util.*;

public class P8_1_9{
	public static void main (String args[]){

	Scanner entrada=new Scanner(System.in);
	int numero;
	String num_cadena;
	
	
	
	System.out.println("Escribe un numero entero ");
	numero=entrada.nextInt();
	
	
	num_cadena=Integer.toString(numero);
	
	int numeros[]=new int[num_cadena.length()];
	
	for(int i=0;i<numeros.length;i++){
		
            numeros[i]=num_cadena.charAt(i);
			
			
            System.out.print((char)numeros[i]+"  ");
		
		
		
	}
	
	
		
	}
	
}
 */