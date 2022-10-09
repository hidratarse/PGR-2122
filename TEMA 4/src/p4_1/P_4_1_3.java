package p4_1;
public class P_4_1_3 {

	public static void main(String[] args) {
		
		int [] vector= new int[10];
		
		for(int i=0;i<vector.length;i++) {
			vector[i]=(int)((Math.random()*101));
			System.out.println(vector[i]);
			
			if(vector[i]%2==0){
				System.out.println(vector[i]+" en la posición "+(i+1)+ " es par");
				
			}	
		}
	}
}
