package bicicleta;

public class Bicicleta {
	
	//Atributos
	private static int numeroBicicletas;
	
	private int diametroRuedas;
	private int id;
	private int numMarchas;
	
	//Constructores
	public Bicicleta(){}
	
	public Bicicleta(int diametroRuedas, int id, int numMarchas) {
		super();
		this.diametroRuedas = diametroRuedas;
		this.id = id;
		this.numMarchas = numMarchas;
	}
	
	//Getters & Setters
	public static int getNumeroBicicletas() {
		return numeroBicicletas;
	}

	public static void setNumeroBicicletas(int numeroBicicletas) {
		Bicicleta.numeroBicicletas = numeroBicicletas;
	}

	public int getDiametroRuedas() {
		return diametroRuedas;
	}

	public void setDiametroRuedas(int diametroRuedas) {
		this.diametroRuedas = diametroRuedas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumMarchas() {
		return numMarchas;
	}

	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}
	
	//Métodos
	@Override
	public String toString() {
		return "Bicicleta [diametroRuedas=" + diametroRuedas + ", id=" + id + ", numMarchas=" + numMarchas + "]";
	}
}
