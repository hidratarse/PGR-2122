package p_7_4;

import java.util.Arrays;

public class OperacionesVector {
	//Métodos
	public void cargar(int v[]) {
		for (int i = 0; i < v.length; i++) {
			v[i]=(int)(Math.random()*100);
		}
	}
	
	public void visualizar(int v[]) {
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i]+"\t");
		}
		System.out.println();
	}
	
	public int maximo(int v[]) {
		int maximo=v[0];
		for (int i = 0; i < v.length; i++) {
			if (v[i]>maximo) maximo=v[i];
		}
		return maximo;
	}
	
	public int minimo(int v[]) {
		int minimo=v[0];
		for (int i = 0; i < v.length; i++) {
			if (v[i]<minimo) minimo=v[i];
		}
		return minimo;
	}
	
	public int obtenerMediana(int v[]) {
		int mediana=0;
		int mitad=v.length/2;
		Arrays.sort(v);
		
		visualizar(v);
		
		if((v.length)%2==0) { 
			mediana=(v[mitad-1]+v[mitad])/2;
			return mediana;
		}else {
			mediana=v[mitad];
			return mediana;
		}
	}
}
