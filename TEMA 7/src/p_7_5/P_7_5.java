package p_7_5;

public class P_7_5 {

	static String [] asignaturas = new String [6];
	static int [] numAsig = new int [6];
	
	public static void procesarAsignaturas (Alumno a) {
		for (int i=0; i<a.modulos.length; i++) {
			String asignaturaBuscada = a.modulos[i];
			int j = 0;
			while (j<asignaturas.length && asignaturas[j]!=null && !asignaturas[j].equals(asignaturaBuscada)) {
				j++;
			}
			if(j<asignaturas.length) {
				if(asignaturas[j]==null) {
					asignaturas[j]=asignaturaBuscada;
					numAsig[j]=1;
				}else {
					numAsig[j]++;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		String [] modulos = {"Programacion", "Bases de Datos", "Sistemas Operativos"};
		Alumno alumno1 = new Alumno ("Elle", "Lawliet", 24, modulos);
		
		String [] modulos2 = {"Programacion", "Bases de Datos"};
		Alumno alumno2 = new Alumno ("Pepito", "Perez");
		alumno2.edad=21;
		alumno2.modulos= modulos2;
		
		String [] modulos3 = {"Programacion", "Lenguaje de Marcas"};
		Alumno alumno3 = new Alumno ("Javi", "Madrid", 20, modulos3);
		
		System.out.println("Datos del tercer objecto: "+alumno3.toString());
		
		//Procesar alumnos
		procesarAsignaturas(alumno1);
		procesarAsignaturas(alumno2);
		procesarAsignaturas(alumno3);
		
		System.out.println("Informe de las asignaturas");
		
		for (int i=0;i<asignaturas.length && asignaturas[i]!=null ;i++) {
			System.out.println(asignaturas[i]+": "+numAsig[i]);
			}
		
	}

}
