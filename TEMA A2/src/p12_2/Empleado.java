package p12_2;

import java.util.Comparator;

public class Empleado implements Comparator <Empleado> {
	//Atributos
	private String Empleado;
	private String nSS;
	private double sueldoBase;
	
	//Constructores
	public Empleado() {}
	
	public Empleado(String empleado, String nSS, double sueldoBase) {
		super();
		Empleado = empleado;
		this.nSS = nSS;
		this.sueldoBase = sueldoBase;
	}
	
	//Getters&Setters
	public String getEmpleado() {
		return Empleado;
	}

	public void setEmpleado(String empleado) {
		Empleado = empleado;
	}

	public String getnSS() {
		return nSS;
	}

	public void setnSS(String nSS) {
		this.nSS = nSS;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
	//Métodos
	public double calcularSalario() {return sueldoBase;}

	@Override
	public int compare(Empleado o1, Empleado o2) {
		return o1.getEmpleado().compareTo(o2.getEmpleado());
	}
	
}
