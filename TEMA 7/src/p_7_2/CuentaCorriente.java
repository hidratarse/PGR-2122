package p_7_2;

import java.util.Scanner;

public class CuentaCorriente {
	//Atributos
	String nombre, apellidos, dni, direccion;
	long numcuenta;
	double saldo;
	
	public CuentaCorriente(String nombre, String apellidos, String dni, String direccion, long numcuenta,double saldo){
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.direccion=direccion;
		this.dni=dni;
		this.numcuenta=numcuenta;
		this.saldo=saldo;
	}
	//Métodos
	public double ingresarDinero(double ingreso) {
		saldo+=ingreso;
		return saldo;
	}
	
	public double sacarDinero(double retiro) {
		saldo-=retiro;
		return saldo;
	}
	
	public void mostrarSaldo() {
		System.out.printf("\nEl saldo es %.2f ",saldo);
	}
	
	public void modificarDatos(Scanner sc) {
		boolean salir=false;
		do {
			System.out.println("Sus datos, pulse un número para modificar: \n1.-Nombre: "+nombre+"\n2.-Apellidos: "+apellidos+"\n3.-Dirección: "+direccion+"\n4.-DNI "+dni+"\n5.-SALIR");
			sc.nextLine();
			int opcion=sc.nextInt();		
			switch (opcion) {
			case 1:
				sc.nextLine();
				System.out.println("Introduzca el nuevo nombre");
				nombre=sc.next();
				break;
			case 2:
				sc.nextLine();
				System.out.println("Introduzca el nuevo apellido");
				apellidos=sc.next();
				break;
			case 3:
				sc.nextLine();
				System.out.println("Introduzca la nueva dirección");
				direccion=sc.nextLine();
				System.out.println(direccion);
				break;
			case 4:
				sc.nextLine();
				System.out.println("Introduzca el nuevo dni");
				dni=sc.next();
				break;
			case 5:
				salir=true;
				break;
			}
		}while(!salir);
	}
}
