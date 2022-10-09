package ejemplos;

import java.util.Arrays;

public class BusquedaBinaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vector[]=new int[100];
		
		for (int i = 0; i < vector.length; i++) {
			vector[i]=(int)(Math.random()*100);
		}
		
		Arrays.sort(vector);
		
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+"\t");
			if(i%2==0)System.out.print(vector[i]+"\n");
		}
		
		int numeroBuscado=81;
		boolean encontrado=false;
		int inicio=0, fin=vector.length, centro=0;
		
		while (!encontrado && fin>inicio) {
			centro=(inicio+fin)/2;
			if(numeroBuscado==vector[centro]) encontrado=true;
			else
				if (numeroBuscado<vector[centro]) fin=centro-1;
				else inicio=centro+1;
		}
		
		if(encontrado)System.out.printf("\nEl valor %d se ha encontrado en la posición %d",numeroBuscado, centro+1);
		else System.out.printf("\nEl valor %d no se encuentra en el vector", numeroBuscado);
	}
}
