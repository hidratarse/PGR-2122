package p4_1;
import java.util.*;
public class P_4_1_7 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int j;
		
	 	System.out.println("Introduce el rango del vector ");
		j=sc.nextInt();	
		
		int TB_NUM[]= new int[j];
		
		for(int i=0; i<TB_NUM.length; i++) {
			System.out.println("Introduce el valor de la posición "+(i+1));
			TB_NUM[i]=sc.nextInt();
		}
		
		System.out.println("Introduce un valor para intercalar en el vector");
		int sus=sc.nextInt();
		
		Arrays.sort(TB_NUM);
		
		boolean sustituido=false;
		
		for(int i=0; i<TB_NUM.length; i++) {
			
			if(TB_NUM[TB_NUM.length-1]<=sus)TB_NUM[TB_NUM.length-1]=sus;
			else
				for(int e=1; e<TB_NUM.length && !sustituido; e++) {
					if(TB_NUM[e]>sus) TB_NUM[e]=sus;
						sustituido=true;
				}
		
		System.out.println(TB_NUM[i]);
		
		}
		
		sc.close();
		
	}
}