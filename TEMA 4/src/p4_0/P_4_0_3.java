package p4_0;
import java.util.*;
public class P_4_0_3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		int menor, mayor;
		
		
		menor=array[0];
		mayor=array[0];
		
		for(int i=1;i<array.length; i++) {
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
