package p4_3;

public class P_4_3_1 {

	public static void main(String[] args) {
		
		int matriz [][]= new int[10][10];
	
		for(int f=0; f<matriz.length; f++) {
			for(int c=0; c<matriz[f].length;c++) {
				if(f%2==0) {
					matriz[f][c]=1;
				}else
					matriz[f][c]=2;
					System.out.print(matriz[f][c]+"\t");

				
			}
			System.out.println();
			
		}
	}
}


