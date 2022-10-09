package p4_3;

public class P_4_3_2 {

	public static void main(String[] args) {
		
		int diagonal [][]= new int[5][5];
		
		for(int f=0; f<diagonal.length; f++) {
			
			for(int c=0; c<diagonal.length; c++) {
				
				if(f==c) {
					diagonal[f][c]=1;
				}else {
					diagonal[f][c]=0;
				}
				
				
				System.out.print(diagonal[f][c]+"\t");
			}
			
			System.out.println();
			
		}			
	}
}




