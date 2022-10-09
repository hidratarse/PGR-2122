package p_8_1;

import java.util.Scanner;

public class P_8_Extra {
	
	public static Scanner sc=new Scanner(System.in);
	
	public static void main (String[]args) {
		
		int array[]=new int [20];
		
		generarArray(array);
		
		ordenarVector(array);
		
		mostrarArray(array);
		
		System.out.println("\nNumero a insertar");
		
		int sus=sc.nextInt();
		
		susDesplz(array, sus);
		
		mostrarArray(array);
		
	}

	public static void susDesplz(int vector[], int num) {
		int i;
		
	    for(i=vector.length-1;i>0 && vector[i-1]>num;i--) vector[i]=vector[i-1];        	
	    vector[i]=num;
	}

	private static void generarArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			array[i]=(int)(Math.random()*20);
		}
	}
	
	public static void ordenarVector (int [] array) {
		
		int cuentaintercambios = 0 , pasada = 0 ;
		boolean ordenado = false ; 		
		while (!ordenado) {	
			pasada++ ;
			for (int i = 0 ; i < array.length-pasada ; i++) {
				if (array [i] > array [i+1]) {
					int aux = array [i];
					array [i] = array [i+1];
					array [i+1] = aux ;
					cuentaintercambios++;		
				}		
			}
			if (cuentaintercambios == 0) ordenado=true;		
			cuentaintercambios=0;		
		}	
	}
	
	public static void mostrarArray(int[] TB_NUM) {
		for (int i = 0; i < TB_NUM.length; i++) {
			 System.out.print(TB_NUM[i]+"\t");
			if(i%5==0) System.out.print(TB_NUM[i]+"\n");
		
		}
	}
}
