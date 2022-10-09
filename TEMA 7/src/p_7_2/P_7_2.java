package p_7_2;

import java.util.Scanner;

public class P_7_2 {
	
	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaCorriente cuenta1 = new CuentaCorriente ("Pedro", "López", "06033854B", "Calle Caoba", 2020202020202020202l, 2500.50);
		
		boolean salir=false;
		do {
			System.out.println("Elija su operación \n1.-Sacar dinero \n2.-Ingresar dineron \n3.-Consultar saldo \n4.-Modificar datos personales \n5.-Terminar");
			
			int opcion= sc.nextInt();
		
			switch (opcion) {
			
			case 1:
				System.out.println("Cuanto dinero desea retirar \n");
				double retiro=sc.nextDouble();
				System.out.println("Saldo actual "+cuenta1.sacarDinero(retiro)); 
				break;
			case 2:
				System.out.println("Cuanto dinero desea ingresar \n");
				double ingreso=sc.nextDouble();
				System.out.println("Saldo actual "+cuenta1.ingresarDinero(ingreso)); 
				break;
			case 3:
				cuenta1.mostrarSaldo();
				break;
			case 4:
				cuenta1.modificarDatos(sc);
				break;
			case 5:
				System.out.println("Que tenga un buen día Don/Doña"+cuenta1.nombre);
				salir=true;
				break;
			}
		}while(!salir);
	}
}
