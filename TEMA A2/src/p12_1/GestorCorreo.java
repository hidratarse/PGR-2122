package p12_1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class GestorCorreo {

	public static Scanner sc = new Scanner(System.in);
	
	public static ArrayList <Correo> listaCorreo =  new ArrayList<>();
	
	public static SimpleDateFormat fecha= new SimpleDateFormat("dd/MM/yyyy");
	
	public static SimpleDateFormat hora= new SimpleDateFormat("HH:mm:ss");
	
	public static void main(String[] args) {
		
		int opcion;
		do {
			menu();
			opcion =  Integer.parseInt (sc.nextLine());

			switch (opcion) {
				case 1 :
				bandejaDeEntrada();
					break;
				case 2 :
					añadirCorreo();
					break;
				case 3 :
				eliminarCorreo();
					break;
				case 4 :
				mostrarCorreo();
					break;
				case 5 :
				mostrarTodos();
					break;
				case 6 :
				mostrarOrigen();
					break;
				case 7 :
					opcion=0;
					break;
				default :
					System.out.print( " Opción no válida. Introducir una opción válida, por favor. " );
				}
		} while (opcion !=  0 );
	}

	private static void mostrarOrigen() {
		String origen;
		int i=0;
		boolean contiene=false;
		do {
			System.out.println("Indica el origen de los correos");
			origen=sc.nextLine();
			for (Correo correo : listaCorreo) if(correo.getOrigen().contains(origen)) contiene=true;
			if(!contiene)System.out.println("ERROR, ese origen no existe.");
		}while(!contiene);
		for (Correo correo : listaCorreo) {
			System.out.println(correo.getOrigen());
			if(correo.getOrigen().contains(origen))
				System.out.println((i+1)+correo.getAsunto());
				System.out.println(correo.getCuerpo());
			i++;
		}
	}

	private static void mostrarTodos() {
		int i=0;
		for (Correo correo : listaCorreo) {
			System.out.print((i+1)+". ");
			System.out.println(correo.getAsunto());
			System.out.println(correo.getCuerpo()+"\n");
			i++;
		}
	}

	private static void mostrarCorreo() {
		System.out.println("¿Qué correo quieres abrir?");
		int opc=sc.nextInt();
		System.out.println(listaCorreo.get(opc-1).getCuerpo()+"\n");
		sc.nextLine();
	}

	private static void eliminarCorreo() {
		System.out.println("¿Qué correo deseas eliminar?");
		int opc =sc.nextInt();
		listaCorreo.remove(opc-1);
		sc.nextLine();
	}

	private static void bandejaDeEntrada() {
		int i=0;
		System.out.println("BANDEJA DE ENTRADA");
		System.out.println("===================");
		for (Correo correo : listaCorreo) {
			System.out.print((i+1)+". ");
			System.out.print(correo.getOrigen()+" ");
			System.out.print(correo.getAsunto()+" ");
			System.out.print(fecha.format(correo.getFechaYhora())+" ");
			System.out.print(hora.format(correo.getFechaYhora())+" \n");
			i++;
		}
		System.out.println();
	}
	
	public static void añadirCorreo() {
		System.out.println("ORIGEN");
		String origen = sc.nextLine();
		System.out.println("DESTINO");
		String destino = sc.nextLine();
		System.out.println("ASUNTO");
		String asunto = sc.nextLine();
		System.out.println("CUERPO");
		String cuerpo = sc.nextLine();
		Date fechaYhora=new Date();
		listaCorreo.add(new Correo (origen, destino, asunto, cuerpo, fechaYhora));
	}
	
	public static void menu () { 
		System.out.println( " CORREO ELECTRONICO " );
		System.out.println( " =================== " );
		System.out.println ( " 1. Bandeja de entrada. ");
		System.out.println ( " 2. Añadir correo. " );
		System.out.println ( " 3. Eliminar correo. " );
		System.out.println ( " 4. Mostrar un correo ");
		System.out.println ( " 5. Mostrar todos los correos. ");
		System.out.println ( " 6. Mostrar correos a partir de su origen." );
		System.out.println ( " 7. Salir. " );
		System.out.println ( " Introdue una opción: ");
	}
}
