package p_9_1;

import java.util.*;

public class P_9_1 {
	
	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona perso1=new Persona();
		
		introDatos(perso1);
		
		System.out.println(perso1.toString());
		
		Persona perso2=new Persona();
		
		introDatos(perso2);
		
		if(perso1.getEdad()>perso2.getEdad()) System.out.println(perso1.getNombre()+" es mas mayor, tiene "+perso1.getEdad()+" años.");
		else System.out.println(perso2.getNombre()+" es mas mayor, tiene  "+perso2.getEdad()+" años.");
	}

	public static void introDatos(Persona perso1) {
		System.out.println("Nombre");
		perso1.setNombre(sc.next());
		
		System.out.println("Teléfono");
		perso1.setTlf(sc.next());
		
		System.out.println("Edad");
		sc.nextLine();
		perso1.setEdad(sc.nextInt());
	}
}
