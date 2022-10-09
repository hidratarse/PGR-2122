package p4_0;
import java.util.*;
public class P_4_0_4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int j;
		
		do {
			System.out.println("Introduce cuantas posiciones quieres ");
			j=sc.nextInt();
		}while(j>0);
		
		int [] array = new int[j];
		
		for (int i=0; i<array.length; i++) {
			System.out.println("Escribe el nº en la posición "+(i+1));
			array[i]=sc.nextInt();	
		}
		
		Arrays.sort(array);
		System.out.println("Menor "+array[0]);
		System.out.println("Mayor "+array[(array.length)-1]);
		
		sc.close();
		
	}

}
