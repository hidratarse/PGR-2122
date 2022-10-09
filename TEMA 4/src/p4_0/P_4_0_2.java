package p4_0;
import java.util.*;
public class P_4_0_2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int [] array = new int[10];
		
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
