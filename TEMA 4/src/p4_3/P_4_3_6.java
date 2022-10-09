package p4_3;

import java.util.Scanner;

public class P_4_3_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double matriz[][]=new double [3][5];
		
		llenarMatriz(sc, matriz);
		
		System.out.println("Notas introducidas:");
		
		enseñarMatriz(matriz);
		
		mediaAsignatura(matriz);
		
		mediaNotas(matriz);
		
		mediaClase(matriz);
	}

	public static void mediaClase(double[][] matriz) {
		double sumaclase=0;
		double mediaclase=0;
		int CUM=0;
		
		for(int f=0; f<matriz.length; f++) {
			for(int c=0; c<matriz[f].length; c++) {
				
				sumaclase+=matriz[f][c];
				CUM++;
			}
		}
		
		mediaclase=(double)sumaclase/CUM;
		
		System.out.println("La media de la clase es "+mediaclase);
	}

	public static void mediaNotas(double[][] matriz) {
		double sumanota=0;
		int CUM=0;
		double medianota;
		for(int c=0; c<matriz.length; c++) {
			for(int f=0; f<matriz.length; f++) {
				
				sumanota+=matriz[f][c];
				CUM++;
				
				if(f==matriz.length-1) {
					medianota=(double)sumanota/CUM;	
				
				System.out.println("La media del alumno"+(c+1)+" es "+medianota);
				}
			}
		}
	}

	public static void mediaAsignatura(double[][] matriz) {
		double sumaasig=0;
		int CUM=0;
		double mediaasig;
		for(int f=0; f<matriz.length; f++) {
			for(int c=0; c<matriz[f].length; c++) {
				
				sumaasig+=matriz[f][c];
				CUM++;
				
				if(c==matriz[f].length-1) {
					mediaasig=(double)sumaasig/CUM;	
				
				System.out.println("La media de la asignatura "+(f+1)+" es "+mediaasig);
				}
			}
		}
	}
	
	public static void enseñarMatriz(double[][] matriz) {
		for(int f=0; f<matriz.length; f++) {
			for(int c=0; c<matriz[f].length; c++) {
				
				System.out.print(matriz[f][c]+"\t");
			}
			System.out.println();
		}
	}

	public static void llenarMatriz(Scanner sc, double[][] matriz) {
		for(int f=0; f<matriz.length; f++) {
			for(int c=0; c<matriz[f].length; c++) {
				
			System.out.println("Introduzce la nota del alumno "+(c+1)+" en la asignatura "+(f+1));
			
			matriz[f][c]=sc.nextDouble();
			}
		}
	}
}