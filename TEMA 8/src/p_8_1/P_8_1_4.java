package p_8_1;

import java.util.Arrays;

public class P_8_1_4 {

	public static void main(String[] args) {
		
		int[] vector = new int[200];
		
		generarVector(vector);
		
		System.out.println("VECTOR GENERADO ALEATORIAMENTE");
		visualizarVector(vector);
		
		Arrays.sort(vector);
		
		System.out.println("VECTOR GENERADO ALEATORIAMENTE ORDENADO");
		visualizarVector(vector);
		
		//Declaración y preparación de la tabla de conteo de repeticiones
		int[][] arrayConteo = new int[2][50]; 
		
		contarRepeticiones(vector,arrayConteo);
		
		System.out.println("ARRAY BIDIMENSIONAL VECES QUE SE REPITE CADA NÚMERO");
		visualizarArrayBidimensional(arrayConteo);
		
		// Ordenación de la tabla de conteo
		ordenarArrayBidimiensional(arrayConteo);
		
		System.out.println("ARRAY BIDIMENSIONAL ORDENADO VECES QUE SE REPITE CADA NÚMERO");
		visualizarArrayBidimensional(arrayConteo);
		
		System.out.println("5 ELEMENTOS MÁS REPETIDOS EN EL VECTOR");
		for (int i = 0; i < 5; i++) {
			System.out.printf(" %2d : %3d\n" ,arrayConteo[0][i],arrayConteo[1][i]);
			
		}
		
	
	}
		
		
	public static void generarVector(int [] vector) {
		for (int i = 0; i < vector.length; i++) {
			vector[i]=(int)(Math.random()*49+1);			
		}
	}
	     
	public static void visualizarVector(int[] v) {
		int cont=1;
		for (int i : v) {
		    System.out.printf("%3d ",i);
			if (cont==20) {
				System.out.println();
				cont=0;
			} else cont++;
		}	
		System.out.println();
	}
	
	public static void contarRepeticiones(int[] v,int[][] arrayConteo) {
		
		for (int i = 0; i < arrayConteo[0].length; i++) arrayConteo[0][i]=i;
						
		int indice=0, num=0, contador=0;
		while(indice<v.length) {
			num=v[indice];
			contador=0;
			while(indice<v.length && v[indice]==num  ) {
				contador++;
				indice++;
			}
			arrayConteo[1][num]=contador;	
		}		
	}
	
    public static void visualizarArrayBidimensional(int[][] b){
    	for (int c = 0; c < b[0].length; c++) {
    		System.out.printf("%3d   %3d \n", b[0][c],b[1][c]);		
		}		
	}
	
    public static void ordenarArrayBidimiensional(int[][] b) {
	    int aux,aux1;
		boolean ordenado=false;
		for (int i = 1; i < b[0].length &&!ordenado; i++) {
			ordenado=true;
			for (int j = 0; j < b[0].length-i; j++) {
				if(b[1][j]<b[1][j+1]) {
					ordenado=false;
					aux=b[1][j];
					aux1=b[0][j];
					b[1][j]=b[1][j+1];
					b[0][j]=b[0][j+1];
					b[1][j+1]=aux;	
					b[0][j+1]=aux1;	
				}			
			}			
		}
    }
	}

