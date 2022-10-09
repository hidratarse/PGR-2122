package ejemplos;

public class BusquedaLineal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vector []= {3,8,2,9,10,0,15,7};
		int posicion=0;
		int numeroBuscado=15;
		boolean encontrado=false;
		
		while(!encontrado && posicion<vector.length) {
			if(vector[posicion]==numeroBuscado)encontrado=true;
			else posicion++;
		}
		
		if(encontrado)System.out.printf("El valor %d se ha encontrado en la posición %d",numeroBuscado, posicion+1);
		else System.out.printf("el valor %d no se encuentra en el vector", numeroBuscado);
	}

}
