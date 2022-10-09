package p4_4;

import java.util.Scanner;

public class P_4_4_4 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int matriz1 [][]=new int[3][3];
		int matriz2 [][]=new int[3][3];
		int matriz3 [][]=new int[3][3];
		
		System.out.println("Matriz 1");
		llenarMatriz(matriz1);
		System.out.println("Matriz 2");
		llenarMatriz(matriz2);
		
		multiplicarMatrices(matriz1, matriz2, matriz3);
		
		System.out.println("Resultado de la multiplicación");
		imprimirMatriz(matriz3);
	}
	public static void imprimirMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void multiplicarMatrices(int[][] matriz1, int[][] matriz2, int[][] matriz3) {
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz2[i].length; j++) {
				for (int k = 0; k < matriz1[0].length; k++) {
					matriz3[i][j]+=matriz1[i][k]*matriz2[k][j];
				}
			}
		}
	}
	public static void llenarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]=(int)(Math.random()*5);
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
