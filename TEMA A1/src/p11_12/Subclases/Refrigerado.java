package p11_12.Subclases;

import java.util.GregorianCalendar;

public class Refrigerado extends Producto {
	//Atributos
	private String codigoOSA;

	public Refrigerado(GregorianCalendar fechaCaducidad, String numeroLote, GregorianCalendar fechaEnvasado,
			String paisOrigen, String codigoOSA) {
		super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen);
		this.codigoOSA = codigoOSA;
	}
	
	public Refrigerado() {}
	
	//Getters&Setters
	public String getCodigoOSA() {
		return codigoOSA;
	}

	public void setCodigoOSA(String codigoOSA) {
		this.codigoOSA = codigoOSA;
	}

	@Override
	public String toString() {
		return "Refrigerado [codigoOSA=" + codigoOSA + super.toString()+"] ";
	}
	
}
