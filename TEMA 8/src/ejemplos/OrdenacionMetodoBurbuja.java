package ejemplos;

public class OrdenacionMetodoBurbuja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vector[]=new int[20];
		for (int i = 0; i < vector.length; i++) {
			vector[i]=(int)(Math.random()*100);
		}
		
		int pasadas,aux;
		boolean ordenado=false;
		for (pasadas=1; pasadas<vector.length &&!ordenado; pasadas++) {
			for (int i = 0; i < vector.length-pasadas; i++) {
				if (vector[i]>vector[i+1]) {
					ordenado=false;
					aux=vector[i];
					vector[i]=vector[i+1];
					vector[i]=aux;
				}
			}
		}
		
	}
	
}
