package p4_0;
import java.util.*;
public class P_4_0_5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String paises[] = new String[5];
		
		for(int i=0; i<paises.length; i++) {
		System.out.println("Introduce el nombre del pais ");
		paises[i]=sc.next();
		}
		
		for(String var:paises) {
			System.out.println(var);
		}
		/*System.out.println("Usted ha introducido los siguiente paises ");
		for(int e=0;e<paises.length;e++){
		System.out.println(paises[e]);
		}*/
		
		sc.close();
	}

}
