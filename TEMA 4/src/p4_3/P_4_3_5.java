package p4_3;

import java.util.Scanner;

public class P_4_3_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int matriz[][]=new int [5][5];
		
		llenarMatriz(sc, matriz);
		
		System.out.println("Matriz introducida:");
		
		enseñarMatriz(matriz);
		
		sumaFilas(matriz);
		
		sumaColumnas(matriz);
	}

	public static void sumaColumnas(int[][] matriz) {
		int sumacolumnas=0;
		
		for(int c=0; c<matriz.length; c++) {
			for(int f=0; f<matriz.length; f++) {
				
				sumacolumnas+=matriz[f][c];
				
				if(f==matriz.length-1) {
					System.out.println("La suma de la columna "+(c+1)+" es "+sumacolumnas);
					System.out.println();
					sumacolumnas=0;
				}
			}
		}
	}

	public static void sumaFilas(int[][] matriz) {
		int sumafilas=0;
		
		for(int f=0; f<matriz.length; f++) {
			for(int c=0; c<matriz[f].length; c++) {
				
				sumafilas+=matriz[f][c];
				
				if(c==matriz[f].length-1) {
					System.out.println("La suma de la fila "+(f+1)+" es "+sumafilas);
					System.out.println();
					sumafilas=0;
				}
			}
		}
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