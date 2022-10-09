package p_7_4;
import java.util.*;
public class P_7_4 {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		int tamanio;
		do {
			System.out.println("Indica el tama�o del vector");
			tamanio=sc.nextInt();
		}while(tamanio<0);
		
			int vector[]=new int[tamanio];
		
		OperacionesVector ov=new OperacionesVector();
		
		ov.cargar(vector);
		ov.visualizar(vector);
		System.out.println("El valor m�ximo es "+ov.maximo(vector));
		System.out.println("El valor m�nimo es "+ov.minimo(vector));
		System.out.println("El valor de la mediana es "+ov.obtenerMediana(vector));
	}
}
