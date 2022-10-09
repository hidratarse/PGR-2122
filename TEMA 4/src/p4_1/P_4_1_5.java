package p4_1;
import java.util.*;
public class P_4_1_5 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int j, cont=0;
		double aCUM=0; 
	 
	 	System.out.println("Introduce cuantos alumnos tiene la clase ");
		j=sc.nextInt();	
		
		double [] vector= new double[j];
		
		for(int i=0;i<vector.length;i++) {
			System.out.println("Introduce la estatura del alumno "+(i+1));
			vector[i]=sc.nextDouble();	
			aCUM+=vector[i];
			cont++;
		}
		
		double media=aCUM/cont;
		System.out.println("La media de la clase es "+media);
		
		for(int i=0;i<vector.length;i++) {
			if(vector[i]>media) {
				/* falta acumular cuantos son altos y cuantos bajos*/
				System.out.println("El alumno "+i+" es más alto que la media");
			}
			if(vector[i]<media)
				System.out.println("El alumno "+i+" es más bajo que la media");
		}
		
		sc.close();
		
	}
}
