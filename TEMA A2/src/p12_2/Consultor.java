package p12_2;

public class Consultor extends Empleado {
	
	private double precioHora;
	private int numHoras;
	
	public Consultor() {
		super();
	}
	
	public Consultor(double precioHora, int numHoras, String empleado, String nSS, double sueldoBase) {
		super(empleado, nSS, sueldoBase);
		this.precioHora = precioHora;
		this.numHoras = numHoras;
	}
	
	public double getPrecioHora() {
		return precioHora;
	}
	public void setPrecioHora(double precioHora) {
		this.precioHora = precioHora;
	}
	public int getNumHoras() {
		return numHoras;
	}
	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}
	
}
