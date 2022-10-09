package p_9_4;

public class AparatoElectrico {
	//Atributos
	private static double consumoTotal;
	private double potencia;

	
	//Constructores
	public AparatoElectrico(double potencia) {
		super();
		this.potencia = potencia;
	}
	
	public AparatoElectrico() {};
	
	//Getters&Setters
	public static double getConsumoTotal() {
		return consumoTotal;
	}
	public static void setConsumoTotal(double consumoTotal) {
		AparatoElectrico.consumoTotal = consumoTotal;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	
	//Métodos
	public void enciende() {
		consumoTotal=(potencia+consumoTotal);
	}
	
	public void apaga() {
		consumoTotal=(consumoTotal-potencia);
	}
}
