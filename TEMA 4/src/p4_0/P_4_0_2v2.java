package p4_0;
import java.util.Scanner;

public class P_4_0_2v2 {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int j;
		
		do {
			System.out.println("Introduce cuantas posiciones quieres ");
			j=sc.nextInt();
		}while(j<0);
		
		int [] array = new int[j];
		int menor, mayor;
		
		for (int i=0; i<array.length; i++) {
			System.out.println("Escribe el nº en la posición "+(i+1));
			array[i]=sc.nextInt();	
		}
		
		menor=array[0];
		mayor=array[0];
		
		for(int i=0; i<array.length; i++) {
			if(array[i]<menor) {
				menor=array[i];
			}
			if(array[i]>mayor) {
				mayor=array[i];
			}
		}
		
		System.out.println("Menor "+menor);
		System.out.println("Mayor "+mayor);
		
		sc.close();
		
	}

}