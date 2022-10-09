package p11_3;

public class Vecino extends Persona {
	//Atributos
	private String codigoVecino;
	private String codVivienda;
	private static double cuota;
	//Constructores
	public Vecino() {}
	
	public Vecino(String nombre, int edad, String dni, String finca, String codigoVecino, String codVivienda) {
		super(nombre, edad, dni, finca);
		this.codigoVecino = codigoVecino;
		this.codVivienda = codVivienda;
	}
	
	public Vecino(String nombre, int edad, String finca, String codigoVecino, String codVivienda) {
		super(nombre, edad, finca);
		this.codigoVecino = codigoVecino;
		this.codVivienda = codVivienda;
	}
	//Getters&Setters
	public String getCodigoVecino() {
		return codigoVecino;
	}

	public void setCodigoVecino(String codigoVecino) {
		this.codigoVecino = codigoVecino;
	}

	public String getCodVivienda() {
		return codVivienda;
	}

	public void setCodVivienda(String codVivienda) {
		this.codVivienda = codVivienda;
	}

	public static double getCuota() {
		return cuota;
	}

	public static void setCuota(double cuota) {
		Vecino.cuota = cuota;
	}

	@Override
	public String toString() {
		return "Vecino [codigoVecino=" + codigoVecino + ", codVivienda=" + codVivienda + ", Persona="
				+ super.toString() + "]";
	}
	
}
