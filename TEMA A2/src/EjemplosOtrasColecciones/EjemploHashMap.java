package EjemplosOtrasColecciones;

import java.time.LocalDate;
//import java.util.HashMap;
//import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
//import java.util.TreeMap;

public class EjemploHashMap {
	public static void main(String[] args) {
		
		//Map <String, Persona> miAgenda = new HashMap<>();
		//Map <String, Persona> miAgenda = new TreeMap<>();
		Map <String, Persona> miAgenda = new LinkedHashMap<>();
		
		
		miAgenda.put("564897845",new Persona (" 12345678A","Pepe","Pérez", LocalDate.of(1990,1,2 )));
		miAgenda.put ("654323121",new Persona (" 23456789B "," Juan ", " Martínez " , LocalDate.of( 1991,2,3 )));
		miAgenda.put ("987652541",new Persona (" 34567890C "," Ana ", " Ramírez " , LocalDate.of( 1992,3,4)));
		Persona p=new Persona (" 45678901D "," María ", " López " , LocalDate.of( 1993,4,5));
		miAgenda.put("789456123",p);
		//miAgenda.put("789456123",p);
		//miAgenda.put("789456123",p);
		miAgenda.put ("987652541",new Persona (" 34567890","Luisa", "Sánchez" , LocalDate.of( 1992,3,4)));

		for (String clave : miAgenda.keySet()) {
			System.out.printf("%s %s %n",clave, miAgenda.get(clave));
		}
		
		if(miAgenda.containsKey("987652541")) System.out.println("LA clave existe en el Set");
		if(miAgenda.containsValue(p)) System.out.println("LA clave existe en el Set");
		if(miAgenda.containsKey("987600541")) System.out.println("LA clave existe en el Set");
		else System.out.println("LA clave NO existe en el Set");
		System.out.println("El objeto contenido en la clave 564897845 "+miAgenda.get("564897845"));
		
	}

}
