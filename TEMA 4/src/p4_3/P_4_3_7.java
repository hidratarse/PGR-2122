package p4_3;

public class P_4_3_7 {

	public static void main(String[] args) {
		
		String [] grupo = {"DAM", "DAW", "ASIR"};
		
		int []alumnos = new int[30];
		
		int[][] clase=new int [3][0];
		clase[0]=new int [30];
		clase[1]=new int [15];
		clase[2]=new int [20];
		
		int max=clase[0][1], min=clase[0][1];
		int alumnomax=alumnos[0], alumnomin=alumnos[0];
		String clasemax=grupo[0], clasemin=grupo[0];
		
		boolean igualmax=false, igualmin=false;
		
		llenarClase(clase); //metodo para llenar el array de notas aleatorias
		
		llenarAlumnos(alumnos); //metodo para generar una lista numerada que indicará un alumno
		
		imprimirArray(grupo, alumnos, clase); //enseña el array con el grupo, notas y num de alumno
		
		System.out.println();
		System.out.println("Lista de alumnos con la nota maxima y su grupo correspondiente: ");
		
		for(int f=0; f<clase.length; f++) {
			for(int c=0; c<clase[f].length; c++) {
				
				if(clase[f][c]>max) {
					max=clase[f][c];     //Busca el maximo y minimo para buscar el igual en el siguinte metodo
					alumnomax=alumnos[c];
					clasemax=grupo[f];
					igualmax = buscarIgual(clase, max, igualmax); //metodo para buscar los iguales en los max y min
				}
				if(clase[f][c]<=min) {
					min=clase[f][c];
					alumnomin=alumnos[c];
					clasemin=grupo[f];
					igualmin = buscarIgual(clase, min, igualmin);
				}
			}
		} //si encuentra numeros iguales el boolean se activa, en el caso de que no haya(casi imposible) nos dará otro mensaje
		if(igualmax) {
			System.out.println("Notas maximas");
			imprimirIguales(grupo, clase, max); //metodo para imprimir todos los alumnos con notas minimas o maximas
		}else {
		System.out.println();
		System.out.print("La nota maxima la tiene el alumno "+alumnomax+" que pertenece al grupo "+clasemax+ " con la nota de "+max);
		}
		
		if(igualmin) {
			System.out.println("Notas minimas");
			imprimirIguales(grupo, clase, min);
		}else {
		
		System.out.println();
		System.out.print("La nota minima la tiene el alumno "+alumnomin+" que pertenece al grupo "+clasemin+ " con la nota de "+min);
		}
	}


	public static void imprimirIguales(String[] grupo, int[][] clase, int num) {
		for(int f=0; f<clase.length; f++) {
			for(int c=0; c<clase[f].length; c++) {
				if(clase[f][c]==num)
					System.out.println("Alumno "+(c+1)+", "+num+" "+grupo[f]);
			}
		}
	}


	public static boolean buscarIgual(int[][] clase, int num, boolean igual) {
		for(int f=0; f<clase.length; f++) {
			for(int c=0; c<clase[f].length; c++) {
		
				if(num==clase[f][c]) igual=true;		
			}	
		}
		return igual;
	}

	public static void imprimirArray(String[] grupo, int[] alumnos, int[][] clase) {
		for(int f=0; f<alumnos.length; f++){
			if(f==0) System.out.print("\t");
				System.out.print(alumnos[f]+"\t");
			}
			System.out.println();
		
		for( int f=0; f<clase.length; f++){
			for ( int c=0; c<clase[f].length; c++){
				if(c==0)System.out.print(grupo[f]+"\t");
				System.out.print(clase[f][c]+"\t");
			}
			System.out.println();
		}
	}

	public static void llenarAlumnos(int[] alumnos) {
		int cont=1;
		
		for( int i=0; i<alumnos.length; i++){
			
			alumnos[i]=cont;
			cont++;
		}
	}

	public static void llenarClase(int[][] clase) {
		for( int f=0; f<clase.length; f++){
			for ( int c=0; c<clase[f].length; c++){

					clase[f][c]=(int)(Math.random()*10);
					
					/*Scanner sc = new Scanner(System.in);
					 * syso()Introduce las notas
					 * clase[f][c]=sc.nextInt;
					 * 
					 */
			}
		}
	}
}