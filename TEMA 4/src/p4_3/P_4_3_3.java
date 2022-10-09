package p4_3;

import java.util.Scanner;

public class P_4_3_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int fil = filas(sc);
		
		int col = columnas(sc);
		
		sc.close();
		
		int matriz [][]= new int[fil][col];
		
		int matrizv2 [][]= new int[col][fil];
		
		System.out.println("Matriz original");
		
		llenarMatriz(matriz);
		
		System.out.println("Matriz transpuesta");
		
		transposicion(matriz, matrizv2);
		
		if(col==fil) {
			System.out.println("La diagonal principal es:");
			diagonal(matriz, matrizv2);
		}
	}

	public static void diagonal(int[][] m, int[][] mv2) {
		for(int f=0; f<m.length; f++) {
			for(int c=0; c<m[f].length; c++) {
				if(f==c) {
					System.out.print(mv2[f][c]+" ");
				}
			}
		}
	}

	public static int filas(Scanner sc) {
		System.out.println("Introduce las filas de la matriz");
		
		int fil = sc.nextInt();
		return fil;
	}

	public static int columnas(Scanner sc) {
		System.out.println("Introduce las columnas");
		
		int col = sc.nextInt();
		return col;
	}

	public static void transposicion(int[][] m, int[][] mv2) {
		for(int f=0; f<mv2.length; f++) {
			for(int c=0; c<mv2[f].length; c++) {
				
				mv2[f][c]=m[c][f];
				System.out.print(mv2[f][c]+"\t");
				
			}
			System.out.println();
		}
	}

	public static void llenarMatriz(int[][] m) {
		for(int f=0; f<m.length; f++) {
			for(int c=0; c<m[f].length; c++) {
				
				m[f][c]=(int)(Math.random()*10+1);
				System.out.print(m[f][c]+"\t");
			}
			System.out.println();
		}
	}
}