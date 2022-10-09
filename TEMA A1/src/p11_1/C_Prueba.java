package p11_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C_Prueba {
	
	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Trabajador trab1=new Trabajador();
		
		trab1.setAntiguedad(5);
		trab1.setCategoria('A');
		trab1.setEdad(24);
		trab1.setNombre("Zeke");
		trab1.setTlf("6260189187");
		
		Trabajador trab2 = null;
		trab2=crearTrabajador(trab2);
		
		System.out.println(trab1.toString()+"\n"+trab2.toString());
		
		if(trab1.getAntiguedad()>trab2.getAntiguedad()) System.out.println(trab1.getNombre()+"es más mayor");
		else System.out.println(trab2.getNombre()+"es más mayor");
		
		
	}

	private static Trabajador crearTrabajador(Trabajador trab) {
		boolean error=false;
		do {
			try {
				System.out.println("Antigüedad");
				int Antiguedad=sc.nextInt();
				
				System.out.println("Categoría");
				char categoria=sc.next().charAt(0);
				
				System.out.println("Edad");
				int edad=sc.nextInt();
				
				System.out.println("Nombre");
				String nombre=sc.next();
				
				System.out.println("teléfono");
				String tlf=sc.next();
				
				trab=new Trabajador(nombre,edad, tlf,categoria,Antiguedad);
				error=false;
			}catch(InputMismatchException e){
				System.out.println("error");
				sc.next();
				error=true;
			}
		}while(error);
		return trab;
	}

}
