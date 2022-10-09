package Ejemplos.EjemploArrayList;

/*
* PRUEBA DE ORDENACIÓN DE ARRAYLIST QUE CONTIENE DATOS DE TIPO STRING
*/
import java.util.*;

public class OrdenarArrayList {
	
	public static void main(String args[]){
		
		List <String> letras = new ArrayList <String>();
		
		letras.add("a");
		letras.add("z");
		letras.add("g");
		letras.add("b");
		letras.add("l");	
		
		Collections.sort(letras,Comparator.reverseOrder());
		
		for( String let : letras){
			System.out.println(let);
		}
		
		
		
	}
}
