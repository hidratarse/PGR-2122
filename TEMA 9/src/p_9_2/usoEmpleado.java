package p_9_2;

import java.util.GregorianCalendar;

public class usoEmpleado {

	public static void main(String[] args) {

		Empleado emp1=new Empleado("Zeke",2500.0,2022,03,10);
		Empleado emp2=new Empleado("DIO",1000.0,2022,03,10 );
		Empleado emp3= new Empleado("Ana", 2000, new GregorianCalendar(2005-1900,5-1, 5),"45454545A",2);
		
		System.out.println(emp1.toString()+"\n"+emp2.toString());
		
		emp1.subirSueldo(5);
		emp2.subirSueldo(3);
		
		System.out.println("\n"+emp1.getSueldo()+"\n"+emp2.getFechaContrato().getWeekYear()+emp1.getNumHijos());
		
	
		System.out.println("Sueldo de "+emp3.getNombre() +" "+"antes de la subida: "+emp3.getSueldo());

		emp1.subirSueldo(5);
		System.out.println("Sueldo de "+emp1.getNombre() +" "+"después de la subida: "+emp1.getSueldo());
		
	
		System.out.println("Sueldo de "+emp2.getNombre() +" "+"antes de la subida: "+emp1.getSueldo());
	
		emp2.subirSueldo(3);
		System.out.println("Sueldo de "+emp2.getNombre() +" "+"después de la subida: "+emp2.getSueldo());
		
		emp1.imprimirNomina();
		
		emp2.imprimirNomina();
	}
}