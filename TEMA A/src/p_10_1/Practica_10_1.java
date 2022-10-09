package p_10_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica_10_1 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int array[][]=new int[pedirNum()][pedirNum()];
		
		llenarArray(array);
		
		visualizarArray(array);
		
		ordenarArrayBidimiensional(array);
		
		visualizarArray(array);
	}

	private static void visualizarArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
	}

	public static void ordenarArrayBidimiensional(int[][] b) {
		int aux=0;
		boolean ordenado=false;
			try {
			   	for (int i = 0; i < b.length && !ordenado; i++) {
			   		ordenado=true;
					for (int j = 0; j < b[i].length; j++) {
						if(b[i][j]<b[i][j+1]) {
							ordenado=false;
							aux=b[i][j];
							b[i][j]=b[i][j+1];
							b[i][j+1]=aux;
						}
					}
			   	}
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("FIN DE ORDENACIÓN");
			}
	}
	
	private static void llenarArray(int[][] array) {
		boolean error;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				error=false;
				while(!error){
					try {
						System.out.println("Introduce "+i+","+j);
						array[i][j]=sc.nextInt();
						error=true;
					} catch (InputMismatchException e) {
						System.out.println("ERROR, DEBE INTRODUCIR UN NÚMERO");
						sc.next();
					}
				}
			}
		}
	}
	
	
	public static int pedirNum() {
		boolean error=false;
		int numero = 0;
		while(!error){
			try {
				do {
					System.out.println("Introduce un número entre 2 y 4");
					numero=sc.nextInt();
					if(numero>4 || numero<2)System.out.println("ERROR, TIENE QUE ESTAR ENTRE 2 Y 4");
				}while(numero>4 || numero<2);
				error=true;
			} catch (InputMismatchException e) {
				System.out.println("ERROR, DEBE INTRODUCIR UN NÚMERO ENTERO");
				sc.next();
			} catch (NegativeArraySizeException e) {
				System.out.println("ERROR, DEBE INTRODUCIR UN NÚMERO POSITIVO");
				sc.next();
			}
		}
		return numero;
	}
}
