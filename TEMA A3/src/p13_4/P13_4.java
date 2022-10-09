package p13_4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class P13_4 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		try (RandomAccessFile ficheroRandom = new RandomAccessFile("C:/Users/migue/Desktop/P13_4.txt", "rw")){
			
			int opc;
			do {
				System.out.println("Elije una opción:"
						+ "\n1- Registrar reserva."
						+ "\n2- Consultar reserva de un cliente"
						+ "\n3- Listado de reservas"
						+ "\n4- Informe mensual de reservas de un determinado mes.");
					opc=sc.nextInt();
					switch (opc) {
					case 1:
						reervar(ficheroRandom);
						
						break;
					case 2:
						System.out.println("Introduce el nombre a buscar");
						
						
						ficheroRandom.seek(0);
						
						for (int i = 0; i < ficheroRandom.length(); i++) {
							
							
						}
						
						break;
					default:
						break;
					}
			}while(opc!=0);
			
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no existe.");
		} catch (IOException e1) {
			System.out.println("Error de lectura.");
		}
	}

	private static void reervar(RandomAccessFile ficheroRandom) throws IOException {
		ficheroRandom.seek(ficheroRandom.length());
		
		System.out.println("Nombre: ");
		String nombre=sc.nextLine();
		System.out.println("Fecha: ");
		String fecha=sc.next();
		System.out.println("Nº Noches: ");
		int noches=sc.nextInt();
		sc.nextLine();
		System.out.println("Precio/noche: ");
		double precio=sc.nextDouble();
		sc.nextLine();
		System.out.println("Se procede a reservar "+nombre+fecha+noches+precio);
		
		ficheroRandom.writeUTF(nombre);
		ficheroRandom.writeUTF(fecha);
		ficheroRandom.writeInt(noches);
		ficheroRandom.writeDouble(precio);
	}
}
