package p4_2;

public class P_4_2_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int boleto1 []= new int [5];
		int boleto2 []= new int [5];
		int boleto3 []= new int [5];
		int boleto4 []= new int [5];
		
		generarBoleto (boleto1);
		generarBoleto (boleto2);
		generarBoleto (boleto3);
		generarBoleto (boleto4);
				
		System.out.print("boleto 1 es: ");
		imprimirBoleto (boleto1);
		System.out.print("boleto 2 es: ");
		imprimirBoleto (boleto2);
		System.out.print("boleto 3 es: ");
		imprimirBoleto (boleto3);
		System.out.print("boleto 4 es: ");
		imprimirBoleto (boleto4);
			
	}
	public static void generarBoleto(int [] v){
		for (int i = 0; i < v.length; i++) {
			v[i]=(int)(Math.random()*49+1);
			for(int k=0; k<i;k++) {
				if(v[i]==v[k]) {
					i--;
				}
			} 
		}
	}
	public static void imprimirBoleto(int [] v) {
		for (int j=0;j<v.length;j++) {
			System.out.printf("\t%2d",v[j]);
		}
		System.out.print("\n");
	}

}



/*
import java.util.Scanner;

public class P_4_2_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int i, e, o;

		
		int bono [] = new int [6];
		
		for(o=0; o!=4; o++) { 
			
			System.out.println("Introduce los números del boleto "+(o+1));
	
				for(i=0; i<bono.length;i++) {
					
					System.out.println("Introduce el numero "+(i+1));
					bono[i]=sc.nextInt();
					
					for(e=0; e<i; e++) {
						
						if(bono[e]==bono[i]) {
							
						i--;
						System.out.println("ERROR, los numeros no se pueden repetir");
						
						}
					}
				}									
			
			System.out.println("Los numeros del boleto son ");
			
			for(i=0; i<bono.length; i++) {
			
				System.out.println(bono[i]+" ");
				
			}
		}
			
		sc.close();
		
		}
	}
*/