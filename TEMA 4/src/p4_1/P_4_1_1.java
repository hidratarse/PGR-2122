package p4_1;
import java.util.*;
public class P_4_1_1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int [] array = new int[10];
		int mayor, cont=0;
		
		for (int i=0; i<array.length; i++) {
			System.out.println("Escribe el nº en la posición "+(i));
			array[i]=sc.nextInt();	
		}
		
		mayor=array[0];
		
		for(int i=0;i<array.length; i++) {
			if(array[i]>mayor) {
				mayor=array[i];
			}
		}
		
		for(int i=0;i<array.length; i++) {
			if(array[i]>mayor) {
				mayor=array[i];
				cont=1;
			}
			else
				if(array[i]==mayor)
				cont++;
		}
		System.out.println(mayor+" aparece "+cont+" veces");
		
		sc.close();
		
	}
}
