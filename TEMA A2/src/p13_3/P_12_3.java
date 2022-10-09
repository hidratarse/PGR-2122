package p13_3;
import java.util.*;

public class P_12_3 {

	public static void main(String[] args) {

		LinkedList<String> paises = new LinkedList<String>();

		LinkedList<String> capitales = new LinkedList<String>();

		paises.add("Brasil");
		paises.add("Alemania");
		paises.add("Francia");
		paises.add("Ucrania");
		paises.add("Rusia");

		capitales.add("Brasilia");
		capitales.add("Berlin");
		capitales.add("París");
		capitales.add("Kiev");
		capitales.add("Moscú");

		System.out.println(capitales);
		System.out.println(paises);

		ListIterator<String> iterA = paises.listIterator();
		ListIterator<String> iterB = capitales.listIterator();

//Añadimos al listado de paises la capital

		while (iterB.hasNext()) {
			if (iterA.hasNext()) {
				iterA.next();
			}
			iterA.add(iterB.next());
		}

		System.out.println(paises);
//Inicializamos otra vez el listado de las capitales
		iterB = capitales.listIterator();

//Borramos las capitales pares, pasamos al siguiente dos veces
//y el segundo que es es igual que el par le damos a remove.
		while (iterB.hasNext()) {
			iterB.next();
			if (iterB.hasNext()) {
				iterB.next();
				iterB.remove();
			}
		}
		System.out.println(capitales);

//Borramos las capitales sobrantes que ya no estan en la lista de capitales

		paises.removeAll(capitales);

		System.out.println(paises);

//Con el metodo collections.sort, ordenamos los paises del LikendList

		Collections.sort(paises);
		System.out.println(paises);

//Para terminar creamos un ArrayList y añadimos todos los paises
		ArrayList<String> list = new ArrayList<String>(paises);

		for (String str : list) {
			System.out.println(str);
		}
	}

}
/*import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class P_12_3 {
	
	public static List <Pais> listaPaises=new LinkedList<Pais>();
	
	public static List <Capital> listaCapitales=new ArrayList<Capital>();
	
	public static void main(String[] args) {
		//1
		listaPaises.add(new Pais("Botswana"));
		listaPaises.add(new Pais("Montenegro"));
		listaPaises.add(new Pais("Khazajistan"));
		listaPaises.add(new Pais("Malasia"));
		listaPaises.add(new Pais("Moldavia"));
		//2
		listaCapitales.add(new Capital("Gaborone"));
		listaCapitales.add(new Capital("Podgorica"));
		listaCapitales.add(new Capital("Astana"));
		listaCapitales.add(new Capital("Kuala Lumpur"));
		listaCapitales.add(new Capital("Chisinau"));
		//3
		añadirCapitales();
		//4
		borrado();
		//5
		listaPaises.removeAll(listaCapitales);
	}

	private static void borrado() {
		int tamaño=listaCapitales.size();
		ListIterator<Capital> iter = listaCapitales.listIterator();
		for(int i=0;i<tamaño ;i++) {
			iter.next();
			if (i%2==0) iter.remove();
		}
		for (Capital capital : listaCapitales) System.out.println(capital.getNombre());
	}

	private static void añadirCapitales() {
		int i =0;
		Iterator<Capital> iter = listaCapitales.iterator(); 
		while(iter.hasNext()) {
			if (i%2!=0) listaPaises.add(i, iter.next());
			System.out.println(listaPaises.get(i).getNombre());
			i++;
		}
		
		
	}
	
}*/
