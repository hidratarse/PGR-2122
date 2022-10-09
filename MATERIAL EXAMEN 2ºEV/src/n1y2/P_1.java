package n1y2;

public class P_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array [][]=new int[4][5];
		
		cargarArrayV1(array);
		
		visualizarArray(array);
		
		susConsecutivos(array);
		
		visualizarArray(array);
	}

	public static void susConsecutivos(int[][] array) {
		int aCUM2=2;
		int tamaño=array[0].length;
		int aux=1;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(i%2==0) array[i][j]=aux+j;
				else {
					array[i][j]=(aCUM2*tamaño)-j;
					if (j==0) aux=array[i][j]+1;
					if (j==array[0].length-1) aCUM2=aCUM2+2;
				}
			}
		}
	}

	public static void visualizarArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+"\t");
			}	
			System.out.println();
		}
	}

	public static void cargarArrayV1(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j]=(int)(Math.random()*20);
			}	
		}
	}
}
