package EjemplosOtrasColecciones;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class EjemploPila {
	
	 static int total=0;
	 
	 static Stack<Object> miPola =new Stack<Object>();
	 
	 public static Queue<String> cola = new LinkedList<>();
	 
	 public static void main(String[] args) {
		
		 if (miPola.isEmpty()) {
			 System.out.println("Está vacío");
		 }else {
			 miPola.push("Maria");
			 miPola.push(new Persona());
			 
		 }
			 
		 
	}
}