package p_10_3_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P_10_3_2 {
	
	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Reserva reservas[]=new Reserva[3];
		reservas[1]=new Reserva(21,"023091","Zeke");
		boolean salir=false;
		
		visualizarReservas(reservas);
		
		do {		
			System.out.println("\n\nQué desea hacer\n1-Reservar\n2-Quitar reserva\n3-Visualizar reservas\n4-Salir");
			
			int opcion = pedirOpcion();
			
			
			switch (opcion) {
			case 1:
				System.out.println("Introduce la hora de la reserva");
				int hora=pedirHora();
				
				System.out.println("Introduce el Nº de socio, debe tener 5 dígitos");
				String nSocio = pedirNsocio();
				
				System.out.println("Introduce el nombre");
				String nombre=sc.nextLine();
					
				reservas[hora-18]=new Reserva(hora,nSocio,nombre);
				break;
			case 2:
				quitarReserva(reservas);
				break;
			case 3:
				visualizarReservas(reservas);
				break;
			case 4:
				System.out.println("Qué tenga un buen día");
				salir=true;
				break;
			default:
				break;
			}
		} while (!salir);
	}

	public static String pedirNsocio() {
		String nSocio = null;
		boolean error=false;
		do {
			try {
				nSocio = sc.next();
				Integer.parseInt(nSocio);
				if(nSocio.length()>5||nSocio.length()<5) System.out.println("ERROR, EL Nº DE SOCIO DEBE TENER 5 DIGITOS, VUELVE A INTRODUCIRLO");
				sc.nextLine();
				error=false;
			}catch(NumberFormatException e) {
				System.out.println("ERROR, EL NºSOCIO SOLO CONTIENE NÚMEROS, VUELVE A INTRODUCIRLO");
				error=true;
				sc.nextLine();
			};
		}while((nSocio.length()>5||nSocio.length()<5)||error);
		return nSocio;
	}

	public static void quitarReserva(Reserva[] reservas) {
		System.out.println("Introduce la hora de la reserva que quieres quitar");
		int hora = pedirHora();
		reservas[hora-18]=null;
	}

	public static int pedirHora() {
		int hora;
		do {
			hora=pedirEntero();
			if(hora<18 || hora>20)System.out.println("ERROR, LAS HORAS DE RESERVAS SON DE 18 A 20");
		} while (hora<18 || hora>20);
		return hora;
	}

	public static int pedirOpcion() {
		int opcion;
		do {
			opcion = pedirEntero();
			if (opcion<1||opcion>4) System.out.println("ERROR, el número debe estar entre el 1 y el 4");
		} while (opcion<1||opcion>4);
		return opcion;
	}

	public static int pedirEntero() {
		boolean error=false;
		int entero = 0;
		do {
			try {
				entero=sc.nextInt();
				error=false;
			} catch (InputMismatchException e) {
				System.out.println("ERROR, TIENE QUE SER UN NÚMERO ENTERO");
				error=true;
				sc.next();
			}
		} while (error);
		return entero;
	}

	public static void visualizarReservas(Reserva[] reservas) {
		System.out.println("\t\tRESERVAS ACTUALES\n-------------------------------------------------------------------------------");
		for (int i = 0; i < reservas.length; i++) {
			if(reservas[i]==null) System.out.print("|"+(i+18)+":00 LIBRE|\t");
			else System.out.print("|"+(i+18)+":00 "+reservas[i].getNombre()+" NºSocio "+reservas[i].getnSocio()+"|\t");
		}
	}

}
