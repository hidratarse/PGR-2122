package p4_4;

public class P_4_4_3 {
	
	/*public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		int matriz[][] = new int[4][4];
		int columnas[]=new int[4];
		int filas[]=new int[4];
		int diagonal1=0, diagona2=0;
		
		System.out.println("Rellene la matriz");
		
		rellenarMatriz(matriz);
		
		imprimirMatriz(matriz);
		
		sumarColumnas(matriz, columnas);
		
		sumarFilas(matriz, filas);
		
		diagonal1=sumarDiagonal(matriz);
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				
			}
		}
	}
	private static int sumarDiagonal(int[][] matriz) {
		int sumaDiagonal=0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(i==j) {
					sumaDiagonal+=matriz[i][j];
				}
			}
		}
		return sumaDiagonal;
	}
	private static void sumarFilas(int[][] matriz, int[] filas) {
		int sumaFilas=0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				sumaFilas+=matriz[i][j];
			}
			filas[i]=sumaFilas;
			sumaFilas=0;
		}
	}
	private static void sumarColumnas(int[][] matriz, int[] columnas) {
		int sumaColumnas=0;
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < matriz.length; j++) {
				
				sumaColumnas+=matriz[j][i];
			}
			columnas[i]=sumaColumnas;
			sumaColumnas=0;
		}
	}
	public static void imprimirMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
	public static void rellenarMatriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Posición "+(i+1)+","+(j+1));
				
				matriz[i][j]=sc.nextInt();
			}
		}
	}
	public class P_4_4_3_MatrizMagica {
	public static void main (String[]args) {
		int [][] arraMagic = {{5,15,16,2},{10,8,7,13},{6,12,11,9},{17,3,4,14}};
		int diaggSum=impriMagic(arraMagic);
		if (esMagic(arraMagic,diaggSum)) System.out.println("Es mágica");
			else System.out.println("No es mágica"); 
	}
	
	
	public static int impriMagic (int arraMagic [][]) {
		int diagSum=0;
		for (int i=0;i<arraMagic.length;i++) {
			for (int h=0;h<arraMagic[i].length;h++) {
				if (i==h) {diagSum+=arraMagic[i][h];};
				
				System.out.printf("%3d ",arraMagic[i][h]);
			 		
			}
			System.out.println();
		}
		return diagSum;
	}
	
	
	public static boolean esMagic (int arraMagic[][],int diaggSum) {
		int sumaFila=0,sumaColumna=0,sumaDiag2=0;
	
		//Se calcula suma de datos de cada fila, cada columna y diagonal secundaria
		for (int i=0;i<arraMagic.length;i++) {
			sumaFila=0;
			sumaColumna=0;
			sumaDiag2+=arraMagic[i][arraMagic.length-1-i];
			for (int h=0;h<arraMagic[i].length;h++) {
				sumaFila+=arraMagic[i][h];
				sumaColumna+=arraMagic[h][i];				
			}
			System.out.printf("Suma de la fila %2d : %4d\tSuma de la columna %2d : %4d\n",i,sumaFila,i,sumaColumna);
			if (sumaFila!=diaggSum || sumaColumna!=diaggSum ) return false;
		}
		System.out.printf("Suma de la diagonal principal : %4d\n",diaggSum);
		System.out.printf("Suma de la diagonal secundaria: %4d\n",sumaDiag2);
		if (sumaDiag2!=diaggSum) return false;
		else return true;
	}
}
*/
}
