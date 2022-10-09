 package p4_3;

	import java.lang.Math;
	public class P_4_3_6v2 {
		
		public static void main(String[] args) {

			int FIL=4, COL=16;
			float [][] clase= new float[FIL][COL];
			String[] alumno={"AAA","BBB","CCC","DDD","EEE","FFF","GGG","HHH","III","JJJ","KKK","LLL","MMM","NNN","OOO", "Media Asignatura"};
			String[] asignatura={"BBDD","SI","Marcas", "Media_A"};
			float mediaAsignatura=0, mediaAlumno=0, mediaClase=0;
			int f,c;
			boolean t=true;
			
			//SE INTRODUCEN LAS NOTAS DE LOS ALUMNOS
			for( f=0; f<clase.length-1; f++){
				for ( c=0; c<(clase[0].length); c++){
					do{
						if(f<3 && c<15){
							//System.out.print("Introduce la nota de "+asignatura[f]+" para "+alumno[c] + ": ");
							//clase[f][c]=sc.nextFloat();
							clase[f][c]=(float)Math.random()*10;
						}
					}while(clase[f][c]<0 || clase[f][c]>10);
					//SE CALCULA LA MEDIA DE LA ASIGNATURA Y LA MEDIA DE LA CLASE
					if(c==15) clase[f][c]=mediaAsignatura/15;
					else mediaClase=mediaClase+clase[f][c];
					
					mediaAsignatura=mediaAsignatura+ clase[f][c];
					
				}
				mediaAsignatura=0;
			}
			// CALCULA LA MEDIA DE ALUMNO EN LA ULTIMA FILA DEL ARRAY CLASE
			for(c=0; c<15; c++){
				for (f=0; f<4; f++){
					if(f<3) mediaAlumno=mediaAlumno+ clase[f][c];
					if(f==3) clase[f][c]=mediaAlumno/3;
				}
				System.out.println();
				mediaAlumno=0;
			}
			
			System.out.println();
			
			//IMPRIME ARRAY NOMBRES DE ALUMNOS
			for( f=0; f<alumno.length; f++){
				if(f==0) System.out.print("\t");
					System.out.print(alumno[f]+"\t");
				}
				System.out.println();
			// IMPRIME EL NOMBRE DE LAS ASIGNATURAS	
			for( f=0; f<clase.length; f++){
				t=true;
				for (c=0; c<clase[0].length; c++){
					if(t){
						System.out.print(asignatura[f]+"\t");
						t=false;
					}
					System.out.printf("%.2f\t",clase[f][c] );
				}
				System.out.println();
			}
			
			System.out.printf("La nota media de la clase es de: %.2f ",mediaClase/45);
		}
	}