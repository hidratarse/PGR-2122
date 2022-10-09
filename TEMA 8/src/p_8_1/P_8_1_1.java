package p_8_1;

import java.util.Scanner;

public class P_8_1_1 {

	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {

		int TB_NUM[]=new int[100];
		
		generarArray(TB_NUM);
		
		mostrarArray(TB_NUM);
		
		ordenarVector(TB_NUM);
		
		System.out.println("\nNúmero a intercalar");
		
		int sus=sc.nextInt();
		
		intercalar(TB_NUM, sus);

		mostrarArray(TB_NUM);
	}

	public static void intercalar(int[] TB, int num) {
		boolean encontrado = false ;
		
		for (int i = 0 ; i < TB.length && !encontrado ; i++) {
			if (num == TB [i]) encontrado=true;	
			else if (num < TB [i]) {
				encontrado = true ;
				TB[i]=num ;
			}
			if (i == TB.length) TB [i-1] = num;
		}
		
	}

	public static void ordenarVector (int [] TB) {
			int cuentaintercambios = 0 , pasada = 0 ;
			boolean ordenado = false ; 		
			
			while (!ordenado) {	
				pasada++ ;
				for (int i = 0 ; i < TB.length-pasada ; i++) {
					if (TB [i] > TB [i+1]) {
						int aux = TB [i];
						TB [i] = TB [i+1];	
						TB [i+1] = aux ;
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

	public static void generarArray(int[] TB_NUM) {
		for (int i = 0; i < TB_NUM.length; i++) {
			TB_NUM[i]=(int)(Math.random()*100);
		}
	}

}
