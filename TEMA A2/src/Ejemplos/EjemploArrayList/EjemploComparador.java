package Ejemplos.EjemploArrayList;

import java.util.*;


public class EjemploComparador {
	
	public static List<Persona> miLista;
	
	public static void main(String[] args) {
	    miLista= new ArrayList<>();
		
		miLista.add(new Persona("Maria","Lopez","8493893"));
		miLista.add(new Persona("Ana","Alvarez","8658453"));
		miLista.add(new Persona("Juan","Cansado","5689874"));
		miLista.add(new Persona("Luis","Vazquez","5691232"));
		
		miLista.sort(new Comparadores());
		
//		Comparator <Persona> miComparador= Collections.reverseOrder();
//		Collections.sort(miLista);
		
//		miLista.sort(new Comparator <Persona>() {
//			@Override
//			public int compare(Persona p1, Persona p2) {
//				return p1.getApellidos().compareTo(p2.getApellidos());
//			}	
//			
//		});
		
		miLista.forEach(System.out::println);
		
		
		
	}
	
	public static class Comparadores implements Comparator <Persona> {
	 		
			@Override
			public int compare(Persona p1, Persona p2) {
				return p1.getApellidos().compareTo(p2.getApellidos());
				//Ordenación descendente
				//return -p1.getApellidos().compareTo(p2.getApellidos());
			}		
	}
	
		
}
	

