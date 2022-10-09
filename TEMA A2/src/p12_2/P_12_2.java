package p12_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class P_12_2 {
	// 1
	public static ArrayList<Empleado> listaEmpleados = new ArrayList<>(5);

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// 2
		listaEmpleados.add(new Empleado("Eren", "1", 2000.0));
		listaEmpleados.add(new Comercial(20.0, "Zeke", "2", 3000.0));
		listaEmpleados.add(new Comercial(50.0, "Grisha", "3", 5000.0));
		listaEmpleados.add(new Consultor(2.2, 2, "Armin", "4", 4500.50));
		Empleado emp1 = listaEmpleados.get(3);
		System.out.println(emp1);
		System.out.println(listaEmpleados.get(3));
		// 3
		//quitarElemento();
		// 4
		/*String respuesta;
		System.out.println();
		if(listaEmpleados.contains(emp1)) respuesta = "Si";
		else respuesta = "NO";
		System.out.printf("EL EMPLEADO EMP1 %s, se encuentra en la lista ", listaEmpleados.contains(emp1)?"si":"no");*/
		//buscar();
		// 5
		//borrado();
		// 6
		listaEmpleados.set(3, new Empleado("Jean", "5", 1000.0));
		// 7
		//iteratore();
		// 8
		Empleado empleados[]= new Empleado[listaEmpleados.size()];
		listaEmpleados.toArray(empleados);
		// 9
		ordenacion();
	}

	public static void ordenacion() {
		listaEmpleados.sort(new Empleado());
		for (Empleado empleado : listaEmpleados) {
			System.out.println(empleado.getEmpleado());
		}
	}
		
	public static void iteratore() {
		for(Iterator<Empleado> iter = listaEmpleados.iterator(); iter.hasNext();) {
			System.out.println(iter.next().getEmpleado());
		}
	}

	public static void borrado() {
		System.out.println("Introduce el nombre del empleado");

		String borrado = sc.next();
		
		boolean encontrado = false;
		int i;
		for (i = 0; i < listaEmpleados.size() && !encontrado ; i++) {
			if(listaEmpleados.get(i).getEmpleado().contains(borrado)) {
				System.out.println("Se procede a borrar a "+listaEmpleados.get(i).getEmpleado());
				listaEmpleados.remove(i);
				encontrado=true;
			}
		}
		if (encontrado) System.out.println("El elemento de la posición "+(i)+" se ha borrado");
		else System.out.println("El elemento no se encuentra en la lista");
	}

	public static void buscar() {
		System.out.println("Introduce el elemento");

		String buscado = sc.next();

		buscarEmpleado(buscado);
	}

	public static void quitarElemento() {
		System.out.println("Qué elemento quieres borrar.");

		int opc = sc.nextInt();

		System.out.println("Se procede a eliminar a " + listaEmpleados.get(opc - 1).getEmpleado());
		listaEmpleados.remove(opc - 1);
		
	}

	public static void buscarEmpleado(String buscado) {
		boolean encontrado = false;
		int i=0;
		for (i = 0; i < listaEmpleados.size() && !encontrado ; i++) {
			System.out.println(i+" "+listaEmpleados.size());
			if(listaEmpleados.get(i).getEmpleado().contains(buscado)) encontrado=true;
			if(listaEmpleados.get(i).getnSS().contains(buscado)) encontrado=true;
			if(Double.toString(listaEmpleados.get(i).getSueldoBase()).contains(buscado)) encontrado=true;
			if (listaEmpleados.get(i) instanceof Comercial) {
				if(Double.toString(((Comercial) listaEmpleados.get(i)).getComision()).contains(buscado)) encontrado=true;
			}
			if (listaEmpleados.get(i) instanceof Consultor) {
				if(Double.toString(((Consultor) listaEmpleados.get(i)).getPrecioHora()).contains(buscado)) encontrado=true;
				if(Integer.toString(((Consultor) listaEmpleados.get(i)).getNumHoras()).contains(buscado)) encontrado=true;
			}
		}
		if (encontrado) System.out.println("El elemento se encuentra en la posición "+(i)+" que es el elemento "+listaEmpleados.get(i-1).getEmpleado());
		else System.out.println("El elemento no se encuentra en la lista");
	}
	/*while(!encontrado && posicion<vector.length) {
			if(vector[posicion]==numeroBuscado)encontrado=true;
			else posicion++;
		}*/
}
