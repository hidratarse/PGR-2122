package p_7_6;

import java.util.Vector;

public class Practica_7_6_VectorObjetos {
	
	public static void main(String[] args) {
		
		Empleado empleados[]= new Empleado[5];
		
		empleados[0]=new Empleado("Grisha Jäeger","2",49,2000);
		empleados[1]=new Empleado("Reiner Braun","2",32,1500);
		empleados[2]=new Empleado("Armin Arlett","4",43,1900);
		empleados[3]=new Empleado("Jean Kirstein","1");
		empleados[4]=new Empleado("Karl Fritz","5");
		
		Empleado emp2;
		Vector<Empleado> vector=new Vector<Empleado>(5,20);
		vector.addElement(emp2=new Empleado("Pieck Finger","6"));
		
		System.out.println(emp2.toString()+"\n");
		
		sacarListado(empleados);
		
		System.out.println("\nEl total pagado por la empresa es "+totalPagado(empleados));
		
		llenarVector(empleados, vector);
		
		sacarListadoV2(empleados, vector);
		
	}

	public static void llenarVector(Empleado[] empleados, Vector<Empleado> vector) {
		for (int i = 0; i < empleados.length; i++) {
			vector.addElement(empleados[i]);
			System.out.print("\n"+vector.elementAt(i)+"\n");
		}
	}
	
	public static double totalPagado(Empleado[] emp) {
		double total=0;
		
		for (int i = 0; i < emp.length; i++) {
			total+=emp[i].salario;
		}
		return total;
	}
	
	public static void sacarListado(Empleado[] empleados) {
		System.out.println("DEPARTAMENTO\tEMPLEADO\t\tSALARIO\n----------------------------------------------- ");
		for (int i = 0; i < empleados.length; i++) {
			System.out.println(empleados[i].departamento+"\t\t"+empleados[i].nombre+"\t\t"+empleados[i].salario);
		}
	}
	
	public static void sacarListadoV2(Empleado[] empleados, Vector<Empleado> vector) {
		System.out.println("DEPARTAMENTO\tEMPLEADO\t\tSALARIO\n----------------------------------------------- ");
		for (int i = 0; i < empleados.length; i++) {
			System.out.println(vector.elementAt(i).departamento+"\t\t"+vector.elementAt(i).nombre+"\t\t"+vector.elementAt(i).salario);
		}
	}
}
