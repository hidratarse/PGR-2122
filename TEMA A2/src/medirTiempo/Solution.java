package medirTiempo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public static void main(String[] args) {
	    System.out.println(tiempoInsert(new ArrayList<Object>()));
	    System.out.println(tiempoInsert(new LinkedList<Object>()));
	}

	public static long tiempoInsert(List<Object> list) {
	    long inicio = System.currentTimeMillis();
	    System.out.println(inicio);
	    for (int i = 0; i < 10000; i++) {
	        list.add(new Object());
	    }
	    return System.currentTimeMillis() - inicio;
	}
}
