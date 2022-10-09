package p_8_1;

import java.util.Arrays;
import java.util.Scanner;

public class P_8_1_2 {

	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {

		int TB_NUM[]=new int[100];
		
		generarArray(TB_NUM);
		
		mostrarArray(TB_NUM);
		
		Arrays.sort(TB_NUM);
		
		System.out.println("\nNúmero a intercalar");
		
		int sus=sc.nextInt();
		
		intercalar(TB_NUM, sus);

		mostrarArray(TB_NUM);
		
		System.out.println("\n \nNumero a buscar");
		
		int numeroBuscado=sc.nextInt();
		
		boolean encontrado=busqueda(TB_NUM, numeroBuscado);
		
		if(encontrado)System.out.printf("\nEl valor %d se ha encontrado",numeroBuscado);
		else System.out.printf("\nEl valor %d no se encuentra en el vector", numeroBuscado);
	}
	
	public static boolean busqueda(int TB_NUM[], int numeroBuscado) {
		boolean encontrado=false;
		int inicio=0, fin=TB_NUM.length, centro=0;
		
		while (!encontrado && fin>inicio) {
			centro=(inicio+fin)/2;
			if(numeroBuscado==TB_NUM[centro]) encontrado=true; 
			else 
				if (numeroBuscado<TB_NUM[centro]) fin=centro-1;
				else inicio=centro+1;
		}
		if(!encontrado) return false;
		else return true;
	}

	public static void intercalar(int[] TB_NUM, int sus) {
		boolean sustituido=false;
		
		for(int i=0; i<TB_NUM.length; i++) {
			
			if(TB_NUM[TB_NUM.length-1]<=sus)TB_NUM[TB_NUM.length-1]=sus;
			else
				for(int e=1; e<TB_NUM.length && !sustituido; e++) {
					if(TB_NUM[e]>sus) { 
						TB_NUM[e]=sus;
						sustituido=true;
					}
				}
		}
	}

	public static void mostrarArray(int[] TB_NUM) {
		for (int i = 0; i < TB_NUM.length; i++) {
			 System.out.print(TB_NUM[i]+"\t");
			if(i%5==0) System.out.print(TB_NUM[i]+"\n");
		
		}
	}

	public static void generarArray(int[] TB_NUM) {
		for (int i = 0; i < TB_NUM.length; i++) {
			TB_NUM[i]=(int)(Math.random()*100);
		}
	}

}
