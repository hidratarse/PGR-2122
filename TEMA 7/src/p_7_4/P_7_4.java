package p_7_4;
import java.util.*;
public class P_7_4 {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		int tamanio;
		do {
			System.out.println("Indica el tamaño del vector");
			tamanio=sc.nextInt();
		}while(tamanio<0);
		
			int vector[]=new int[tamanio];
		
		OperacionesVector ov=new OperacionesVector();
		
		ov.cargar(vector);
		ov.visualizar(vector);
		System.out.println("El valor máximo es "+ov.maximo(vector));
		System.out.println("El valor mínimo es "+ov.minimo(vector));
		System.out.println("El valor de la mediana es "+ov.obtenerMediana(vector));
	}
}
