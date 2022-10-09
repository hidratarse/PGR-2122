package p4_3;

public class P_4_3_8 {
	public static void main(String[] args) {
		
		int [][]array = new int[10][15];
		
		int []CUMmatriz = new int[10];
		
		int CUM=0;
		
		llenarArray(array);
		
		generarCUM(array, CUMmatriz, CUM);
		
		imprimirArray(array);
		
		mostrarCUM(CUMmatriz);
		
}
	private static void mostrarCUM(int[] CUMmatriz) {
		for(int i=0; i<CUMmatriz.length; i++) {
			System.out.print(CUMmatriz[i]+" ");
		}
	}
	private static void imprimirArray(int[][] array) {
		for( int f=0; f<array.length; f++){
			for ( int c=0; c<array[f].length; c++){
				System.out.print(array[f][c]+"\t");
			}
			System.out.println();
		}
	}
	private static void generarCUM(int[][] array, int[] CUMmatriz, int CUM) {
		for( int f=0; f<array.length; f++){
			for ( int c=0; c<array[f].length; c++){
				
				CUM+=array[f][c];
				
				if(c==array[f].length-1) {
					CUMmatriz[f]=CUM;
			
					CUM=0;
				}
			}
		}
	}
		public static void llenarArray(int[][] array) {
			for( int f=0; f<array.length; f++){
				for ( int c=0; c<array[f].length; c++){

						array[f][c]=(int)(Math.random()*11);
			}
		}
	}
}
