package p12_2;

public class Comercial extends Empleado {
	
	private double comision;

	public Comercial() {
		super();
	}

	public Comercial(double comision, String empleado, String nSS, double sueldoBase) {
		super(empleado, nSS, sueldoBase);
		this.comision = comision;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

}
