package Ejemplos.EjemploArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class EjemploIterator {
	public static void main(String arg[]) {
        ArrayList<String> listaMarcasCoches = new ArrayList<String>(); 
           
        // El tipo de listaMarcasCoches es Collection     
		listaMarcasCoches.add("Audi");
        listaMarcasCoches.add("Porsche");
        listaMarcasCoches.add("Aston Martin");
        listaMarcasCoches.add("Ferrari");
        listaMarcasCoches.add("Mercedes");
        listaMarcasCoches.add("Seat");
        
        System.out.println("N�mero elementos antes de eliminar: " + listaMarcasCoches.size() ) ;
        System.out.println (listaMarcasCoches.toString() ) ;
        listaMarcasCoches.remove ("Seat");
        listaMarcasCoches.remove ("Mercedes");
        System.out.println("N�mero elementos despu�s de eliminar Seat y Mercedes:" + listaMarcasCoches.size() ) ;
        System.out.println(listaMarcasCoches.toString () );
		
		ArrayList <String> nombreArrayList = new ArrayList <String>();

		// A�adimos 10 Elementos en el ArrayList
		for (int i=1; i<=10; i++){
			nombreArrayList.add("Elemento "+i); 
		}
	
		// A�adimos un nuevo elemento al ArrayList en la posici�n 2
		nombreArrayList.add(2, "Elemento 3");
	
		// Declaramos el Iterador e imprimimos los Elementos del ArrayList
	
		Iterator<String> miIterator = listaMarcasCoches.iterator();
		
		while(miIterator.hasNext()){
			
			String elemento = miIterator.next();
			if(elemento.equals("Audi")) miIterator.remove();
			System.out.print(elemento+" / ");
		}
		
		System.out.println();
		listaMarcasCoches.forEach(System.out::println);
    }
}
