package p_8_1;

public class P_8_1_3 {

	public static void main(String[] args) {
		
		int array[]=new int[10];
		
		generarArray(array);
		
		ordenarVector(array);
		
		int mayor = buscarMayor(array);
		
		int contmayor = contarMayor(array, mayor);
		
		System.out.println("\n-----------------\nEl nº "+mayor+" aparece "+contmayor+" veces.");
	}

	private static int contarMayor(int[] array, int mayor) {
		int contmayor=0;
		
		for (int i = 0; i < array.length; i++) if (array[i]==mayor) contmayor++;
		return contmayor;
	}

	private static int buscarMayor(int[] array) {
		int mayor=0;
		
		for (int i=0;i<array.length; i++) if (array[i]>mayor) mayor=array[i];
		return mayor;
	}
	
	private static void generarArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			array[i]=(int)(Math.random()*10);
			System.out.print(array[i]+" ");
		}
	}
	
	public static void ordenarVector (int [] array) {
		
		int cuentaintercambios = 0 , pasada = 0 ;
		boolean ordenado = false ; 		
		while (!ordenado) {	
			pasada++ ;
			for (int i = 0 ; i < array.length-pasada ; i++) {
				if (array [i] > array [i+1]) {
					int aux = array [i];
					array [i] = array [i+1];
					array [i+1] = aux ;
					cuentaintercambios++;		
				}		
			}
			if (cuentaintercambios == 0) ordenado=true;		
			cuentaintercambios = 0;		
		}	
	}
}
