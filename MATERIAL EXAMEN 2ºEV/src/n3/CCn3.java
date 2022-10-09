package n3;

import java.util.Scanner;

public class CCn3 {

	public static Scanner sc=new Scanner(System.in);
	
	public static Empleado emp=new Empleado();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tamaño = sacarTamaño();
		
		Empleado empleados[]= new Empleado[tamaño];
		
		for (int i = 0; i < empleados.length; i++) {
			
			System.out.println("EMPLEAD@ "+(i+1));
			
			empleados[i]= new Empleado();
			
			registroNombre(empleados[i]);
			
			registrarApellidos(empleados[i]);
			
			registrarDNI(empleados[i]);
			
			registrarTelefono(empleados[i]);
			
			registrarEdad(empleados[i]);
			
			registrarCategoria(empleados[i]);
			
			System.out.println(empleados[i].toString());
		}
		
		ordenarPorCat(empleados);
		
		
		
		listado(empleados);
	}

	public static void listado(Empleado[] empleados) {
		System.out.println("CATEGORIA\tNOMBRE\tTELEFONO\n-------------------------------------");
		
		for (int i = 0; i < empleados.length; i++) {
			System.out.println(empleados[i].categoria+"\t\t"+empleados[i].nombre+"\t"+empleados[i].tlf);
		}
	}

	public static void ordenarPorCat(Empleado[] empleados) {
		boolean ordenado = false ; 		
		
		for(int i=1; i<empleados.length && !ordenado; i++) {	
			ordenado=true;
			for (int j = 0 ; j < empleados.length-i; j++) {
				if (empleados[j].categoria>empleados[j+1].categoria) {
					ordenado=false;
					Empleado aux=empleados[j];
					empleados[j]=empleados[j+1];
					empleados[j+1] = aux ;	
				}		
			}
		}
	}

	public static void registrarCategoria(Empleado empleados) {
		char categoria;
		
		System.out.println("Introduce la categoría del empleado ");
		categoria=sc.next().charAt(0);
		
		empleados.categoria=categoria;
	}

	public static void registrarEdad(Empleado empleados) {
		int edad;
		do {
			System.out.println("Introduce la edad del empleado ");
			edad=sc.nextInt();
			
			if (emp.esMayorDeEdad(edad)) empleados.edad=edad;
			else System.out.println("El empleado debe ser mayor de edad, volver a introducir");
		}while(!emp.esMayorDeEdad(edad));
	}

	public static void registrarTelefono(Empleado empleados) {
		String tlf;
		do {
			System.out.println("Introduce el tlf del empleado ");
			sc.nextLine();
			tlf=sc.next();
			
			if (emp.telefonoValido(tlf)) empleados.tlf=tlf;
			else System.out.println("Formato no válido, vueleve a introducirlo");
		}while(!emp.telefonoValido(tlf));
	}

	public static void registrarDNI(Empleado empleados) {
		String dni;
		do {
			System.out.println("Introduce el dni del empleado ");
			sc.nextLine();
			dni=sc.next();
			
			if (emp.dniValido(dni)) empleados.dni=dni;
			else System.out.println("Formato no válido, vueleve a introducirlo");
		}while(!emp.dniValido(dni));
	}

	public static void registrarApellidos(Empleado empleados) {
		String apellidos;
		do {
			System.out.println("Introduce los apellidos del empleado ");
			sc.nextLine();
			apellidos=sc.nextLine();
			
			if (emp.apellidosValido(apellidos)) empleados.apellidos=apellidos;
			else System.out.println("Formato no válido, vueleve a introducirlo");
		}while(!emp.apellidosValido(apellidos));
	}

	public static void registroNombre(Empleado empleados) {
		String nombre;
			do {	
				System.out.println("Introduce el nombre del empleado ");
				sc.nextLine();
				nombre=sc.nextLine();
				
				if (emp.nombreValido(nombre)) empleados.nombre=nombre;
				else System.out.println("Formato no válido, vueleve a introducirlo");
			}while(!emp.nombreValido(nombre));
	}

	public static int sacarTamaño() {
		System.out.println("Introduce el tamaño de la tabla de empleados");
		int tamaño=sc.nextInt();
		return tamaño;
	}

}
