package p4_3;

import java.util.Scanner;

public class P_4_3_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int matriz[][]=new int [4][4];
		
		llenarMatriz(sc, matriz);
		
		System.out.println("Matriz introducida:");
		
		enseñarMatriz(matriz);
		
		
		boolean diagonal = true, ceros=true;
		
		ceros = saberCeros(matriz, ceros);
		
		diagonal = saberDiagonal(matriz, diagonal);
		
		if(diagonal && ceros) {
			System.out.println("Es una matriz identidad");
		}else
			System.out.println("No es una matriz identidad");
	}

	public static boolean saberDiagonal(int[][] matriz, boolean diagonal) {
		for(int f=0; f<matriz.length; f++) {
			for(int c=0; c<matriz[f].length; c++) {
				
				if(f==c && matriz[f][c]!=1) {
					diagonal=false;
				}
			}
		}
		return diagonal;
	}

	public static boolean saberCeros(int[][] matriz, boolean ceros) {
		for(int f=0; f<matriz.length; f++) {
			for(int c=0; c<matriz[f].length; c++) {
				
				if(f!=c && matriz[f][c]!=0) {
					ceros=false;
				}
				
			}
		}
		return ceros;
	}

	public static void enseñarMatriz(int[][] matriz) {
		for(int f=0; f<matriz.length; f++) {
			for(int c=0; c<matriz[f].length; c++) {
				
				System.out.print(matriz[f][c]+"\t");
			}
			System.out.println();
		}
	}

	public static void llenarMatriz(Scanner sc, int[][] matriz) {
		for(int f=0; f<matriz.length; f++) {
			for(int c=0; c<matriz[f].length; c++) {
				
			System.out.println("Introduzca el valor de la posicion "+(f+1)+","+(c+1));
			
			matriz[f][c]=sc.nextInt();
			}
		}
	}
}