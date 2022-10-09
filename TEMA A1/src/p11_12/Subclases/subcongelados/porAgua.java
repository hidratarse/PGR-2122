package p11_12.Subclases.subcongelados;

import java.util.GregorianCalendar;

import p11_12.Subclases.Congelado;

public class porAgua extends Congelado{
	//Atributos
	private int salinidadH2O;
	
	//Constructores
	public porAgua() {}
	
	public porAgua(GregorianCalendar fechaCaducidad, String numeroLote, GregorianCalendar fechaEnvasado,
			String paisOrigen, int temperaturaMantenimiento, int salinidadH2O) {
		super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
		this.salinidadH2O = salinidadH2O;
	}
	
	//Getters&Setters
	public int getSalinidadH2O() {
		return salinidadH2O;
	}

	public void setSalinidadH2O(int salinidadH2O) {
		this.salinidadH2O = salinidadH2O;
	}
	
	//Métodos
	@Override
	public String toString() {
		return "porAgua [salinidadH2O=" + salinidadH2O + ", toString()=" + super.toString() + "]";
	}
	
}
