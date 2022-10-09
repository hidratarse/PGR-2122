package p4_1;
public class P_4_1_4 {

	public static void main(String[] args) {
		
		int [] vector= new int[10];
		int contpar=0, contimp=0, acupar=0, acuimpar=0;
		double mediapar, mediaimpar;
		
		for(int i=0;i<vector.length;i++) {
			vector[i]=(int)((Math.random()*100));
			System.out.println(vector[i]);
			
			if(vector[i]%2==0) {
				System.out.println("es par");
				contpar++;
				acupar+=vector[i];
			}
			else
				contimp++;
				acuimpar+=vector[i];
		}
		
		mediapar=(double)acupar/contpar;
		System.out.println("Media de los pares "+mediapar);
		
		mediaimpar=(double)acuimpar/contimp;
		System.out.println("Media de los impares "+mediaimpar);
		
	}
}
