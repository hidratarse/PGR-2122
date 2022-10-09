package vendedores;

import java.util.GregorianCalendar;

public class Vendedor {
	
	//Atributos
	String numeroVendedor;
	String nombre;
	GregorianCalendar fechaAlta;
	double comision;
	
	//Constructores
	public Vendedor(String numeroVendedor, String nombre, GregorianCalendar fechaAlta, double comision) {
		super();
		this.numeroVendedor = numeroVendedor;
		this.nombre = nombre;
		this.fechaAlta = fechaAlta;
		this.comision = comision;
	}
	
	//Getters & Setters
	public Vendedor() {}

	public String getNumeroVendedor() {
		return numeroVendedor;
	}

	public void setNumeroVendedor(String numeroVendedor) {
		this.numeroVendedor = numeroVendedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public GregorianCalendar getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(GregorianCalendar fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}
	
	//Métodos
	@Override
	public String toString() {
		return "Vendedores [numeroVendedor=" + numeroVendedor + ", nombre=" + nombre + ", fechaAlta=" + fechaAlta
				+ ", comision=" + comision + "]";
	}
	
	
}
