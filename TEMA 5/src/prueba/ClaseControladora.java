package prueba;

import java.util.Scanner;

public class ClaseControladora {
	
	public static Scanner sc= new Scanner(System.in);

	public static void main(String[] args) {
		//Instanciar objeto de la clase vehiculo
		
		Vehiculo camion=new Vehiculo("Mercedes","BL2300", 2, 200,7.0f);
		Vehiculo taxi=new Vehiculo("Opel", "Insignia");
		
		/*camion.marca="Mercedes";
		camion.modelo="BL2300";
		camion.consumo=30;
		camion.capacidadCombustible=200;
		camion.numPasajeros=2;*/
		camion.coloresDisponibles[0]= "rojo";
		camion.coloresDisponibles[1]= "azul";
		
		/*taxi.marca="Opel";
		taxi.modelo="Insignia";*/
		taxi.consumo=14.5f;
		taxi.capacidadCombustible=60;
		taxi.coloresDisponibles[0]="blanco";
		
		
		System.out.printf("Vehiculo1: Marca%S - Modelo: %S - Consumo: %.2f - Capacidad Combustible: %d - NªPasajeros: %d \n",camion.marca,camion.modelo, camion.consumo, camion.capacidadCombustible, camion.numPasajeros);
	
		System.out.printf("Vehiculo 2: Marca: %S - Modelo: %S \n",taxi.marca, taxi.modelo);
		
		System.out.printf("Autonomia del Vehiculo 1: %.2f km \nAutonomia del Vehiculo 2: %.2f km \n",camion.calcularAutonomia(), taxi.calcularAutonomia());
		
		int distancia;
		
		do {
			
			System.out.println("Distancia que quiere recorrer: ");
			distancia=sc.nextInt();
			
		}while(distancia<0);
		
	System.out.printf("Con el vehículo 1, para recorrer %d km necesitamos %.2f litros \n", distancia, camion.combustibleNecesario(distancia));
	
	System.out.printf("Con el vehículo 2, para recorrer %d km necesitamos %.2f litros \n", distancia, taxi.combustibleNecesario(distancia));
	
	}

}
