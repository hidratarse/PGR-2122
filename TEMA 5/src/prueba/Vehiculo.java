package prueba;

public class Vehiculo {
	//Attributes
	
	String marca;
	String modelo;
	int numPasajeros;
	int capacidadCombustible;
	float consumo;
	String coloresDisponibles[]=new String[5];

	public Vehiculo() {}
	
	public Vehiculo(String marca, String modelo, int numPasajeros, int capacidadCombustible, float consumo,
			String[] coloresDisponibles) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPasajeros = numPasajeros;
		this.capacidadCombustible = capacidadCombustible;
		this.consumo = consumo;
		this.coloresDisponibles = coloresDisponibles;
	}

	public Vehiculo(String ma, String mo, int np, int cc, float con) {
		marca=ma;
		modelo=mo;
		numPasajeros=np;
		capacidadCombustible=cc;
		consumo=con;
	}
	public Vehiculo(String ma, String mo) {
		marca=ma;
		modelo=mo;
	}
	//Methods
	public float calcularAutonomia() {
		float autonomia=0;
		autonomia=capacidadCombustible*consumo;
		return autonomia;
	}
	
	public double combustibleNecesario(int distancia) {
		double litros;
		litros=distancia/consumo;
		return litros;
	}
}
