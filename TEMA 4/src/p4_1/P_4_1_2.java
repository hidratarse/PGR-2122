package p4_1;
public class P_4_1_2 {

	public static void main(String[] args) {
		
		int [] vector1= new int[15];
		int [] vector2= new int[15];
		int [] vector3= new int[15];
		
		for(int i=0; i<vector1.length; i++) {
			
			System.out.println("Ronda "+(i+1));
			vector1[i]=(int)((Math.random()*101));
			System.out.println("Vector 1 "+vector1[i]);
			
			vector2[i]=(int)((Math.random()*101));
			System.out.println("Vector 2 "+vector2[i]);
			
			vector3[i]=vector1[i]+vector2[i];
			System.out.println("Vector 3 "+vector3[i]);
			System.out.println("\n");
			
		}
	}
}
