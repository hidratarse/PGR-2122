package p_8_1;

import java.util.Scanner;

public class P_8_1_5 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
			
		int numAlumnos=0;
		while(numAlumnos<=0 || numAlumnos>35) {
			System.out.print("Cuántos alumnos tiene la clase:");
			numAlumnos= sc.nextInt();
		}
		sc.nextLine();		
		String [][] alumnos = new String[numAlumnos][2];
		
		//Cargar el array
		cargarDatosAlumnos(alumnos);
		
		//Visualizar el array 
		System.out.println("ARRAY ANTES DE LA ORDENACIÓN ");
		visualizarArray(alumnos);
		
		//Ordenar alfabéticamente atendiendo a la 1ª columna (índice 0)
		ordenarDatosAlumnos(alumnos);
		
		System.out.println("ARRAY DESPUÉS DE LA ORDENACIÓN ");
		visualizarArray(alumnos);
	
	}


	public static void cargarDatosAlumnos(String[][] alumnos) {
		int edad;
		String nombre;
		for (int i = 0; i < alumnos.length; i++) {
			nombre="AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
			while(nombre.length()>25) {
				System.out.printf("Nombre alumno número %2d (\"maximo 25 caracteres):",i+1);
				nombre=sc.nextLine();
				System.out.println();
			}
			alumnos[i][0]=nombre;
			edad=0;
			while(edad<12 || edad>65) {
				System.out.printf("Edad alumno número %2d(\\\"valor entre 12 y 65 años):",i+1);
				edad=sc.nextInt();
				System.out.println();
			}
			sc.nextLine();
			alumnos[i][1]=Integer.toString(edad);
		}
	}
	
	public static void ordenarDatosAlumnos(String [][] alumnos) {
		int pasada;
		String aux;
		boolean ordenado=false;
		for (pasada = 1; pasada < alumnos.length &&!ordenado; pasada++) {
			ordenado=true;
			for (int f = 0; f < alumnos.length-pasada; f++) {
				if(alumnos[f][0].compareTo(alumnos[f+1][0])>0) {
					ordenado=false;
					aux=alumnos[f][0];
					alumnos[f][0]=alumnos[f+1][0];
					alumnos[f+1][0]=aux;
					
					aux=alumnos[f][1];
					alumnos[f][1]=alumnos[f+1][1];
					alumnos[f+1][1]=aux;	
				}			
			}			
		}
	}
		
	public static void visualizarArray(String [][] b){
    	for (int fila = 0; fila < b.length; fila++) {
    		System.out.printf("%25s   %2s \n", b[fila][0],b[fila][1]);		
		}		
	}
}
