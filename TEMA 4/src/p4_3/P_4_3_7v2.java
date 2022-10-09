package p4_3;

public class P_4_3_7v2 {
	public static void main(String args[]) {

		String [] grupo = {"DAM", "DAW", "ASIR"};
		
		String [][] alumnos = new String[3][];
		alumnos[0]=new String [30];
		alumnos[1]=new String [15];
		alumnos[2]=new String [20];
		
		int[][] clase=new int [3][];
		clase[0]=new int [30];
		clase[1]=new int [15];
		clase[2]=new int [20];
		
		int max=clase[0][0], min=clase[0][0];
		String alumnomax=alumnos[0][0], alumnomin=alumnos[0][0];
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
					alumnomax=alumnos[f][c];
					clasemax=grupo[f];
					igualmax=false;
					igualmax = buscarIgual(clase, max, igualmax); //metodo para buscar los iguales en los max y min
				}
				if(clase[f][c]<=min) {
					min=clase[f][c];
					alumnomin=alumnos[f][c];
					clasemin=grupo[f];
					igualmin=false;
					igualmin = buscarIgual(clase, min, igualmin);
				}
			}
		} //si encuentra numeros iguales el boolean se activa, en el caso de que no haya(casi imposible) nos dará otro mensaje
		if(igualmax) {
			System.out.println("\n\nNotas maximas");
			imprimirIguales(grupo, clase, max, alumnos); //metodo para imprimir todos los alumnos con notas minimas o maximas
		}else {
			System.out.println();
			System.out.print("\nLa nota maxima la tiene el alumno "+alumnomax+" que pertenece al grupo "+clasemax+ " con la nota de "+max);
		}
		
		if(igualmin) {
			System.out.println("\n\nNotas minimas");
			imprimirIguales(grupo, clase, min, alumnos);
		}else {
			System.out.println();
			System.out.print("\nLa nota minima la tiene el alumno "+alumnomin+" que pertenece al grupo "+clasemin+ " con la nota de "+min);
		}
	}



	public static void imprimirIguales(String[] grupo, int[][] clase, int num, String[][]alumnos) {
		for(int f=0; f<clase.length; f++) {
			for(int c=0; c<clase[f].length; c++) {
				if(clase[f][c]==num)
					System.out.println("Alumno "+alumnos[f][c]+", "+num+" "+grupo[f]);
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

	public static void imprimirArray(String[] grupo, String[][] alumnos, int[][] clase) {
		System.out.println("ALUMNOS DE CADA CLASE\n=======================");
		for(int f=0; f<alumnos.length; f++){
			System.out.print("\t");
			for (int c=0; c<alumnos[f].length; c++){
				
				System.out.print(alumnos[f][c]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("\n\nNOTAS DE LOS ALUMNOS DE CADA CLASE\n==================================");
		for( int f=0; f<clase.length; f++){
			for ( int c=0; c<clase[f].length; c++){
				if(c==0)System.out.print(grupo[f]+"\t");
				System.out.print(clase[f][c]+"\t");
			}
			System.out.println();
		}
	}

  public static void llenarAlumnos(String[][] alumnos) {
	int cont=65;
	
	for( int i=0; i<alumnos.length; i++){
		for ( int c=0; c<alumnos[i].length; c++){
			alumnos[i][c]=Character.toString((char)cont)+Character.toString((char)cont)+Character.toString((char)cont);;
			cont++;
		}	
	}
  }

	public static void llenarClase(int[][] clase) {
		for( int f=0; f<clase.length; f++){
			for ( int c=0; c<clase[f].length; c++){
	
					clase[f][c]=(int)(Math.random()*11);
					
					/*Scanner sc = new Scanner(System.in);
					 * syso()Introduce las notas
					 * clase[f][c]=sc.nextInt;
					 * 
					 */
			}
		}

	}
}


