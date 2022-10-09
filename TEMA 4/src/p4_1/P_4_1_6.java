package p4_1;
import java.util.*;
public class P_4_1_6 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int j, cont=0, aprob=0, contap=0;
		double aCUM=0; 
	 
	 	System.out.println("Introduce cuantos alumnos tiene la clase ");
		j=sc.nextInt();	
		
		double [] vector= new double[j];
		
		for(int i=0; i<vector.length; i++) {
			System.out.println("Introduce la nota del alumno "+(i+1));
			do {
				vector[i]=sc.nextDouble();
				if (vector[i]<0 || vector[i]>10) System.out.println("ERROR. La nota introducida tiene que estar entre 0 y 10. Prueba otra vez.");
			}while (vector[i]<0 || vector[i]>10);
			
			aCUM+=vector[i];
			
			cont++;
			
			if(vector[i]>5.0)
				aprob++;
		}
		
		double media=aCUM/cont;
		System.out.println("La media de la clase es "+media);
		
		for(int i=0; i<vector.length; i++) {
			if(vector[i]<media)
				contap++;
		}
		
		System.out.println(contap+" alumnos están por encima de la media");
		
		int sus=j-aprob;
		
		
		System.out.println("Han aprobado "+aprob+" alumnos");
		System.out.println("Han suspendido "+sus+" alumnos");
		
			
		sc.close();
		
	}
}
