package p11_12.Subclases;

import java.util.GregorianCalendar;

public class Congelado extends Producto {
	//Atributos
	private int temperaturaMantenimiento;

	public Congelado(GregorianCalendar fechaCaducidad, String numeroLote, GregorianCalendar fechaEnvasado,
			String paisOrigen, int temperaturaMantenimiento) {
		super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen);
		this.setTemperaturaMantenimiento(temperaturaMantenimiento);
	}
	
	public Congelado() {}
	
	//Getters&Setters
	public int getTemperaturaMantenimiento() {
		return temperaturaMantenimiento;
	}

	public void setTemperaturaMantenimiento(int temperaturaMantenimiento) {
		this.temperaturaMantenimiento = temperaturaMantenimiento;
	}
	
	//Métodos
	@Override
	public String toString() {
		return "Congelado [temperaturaMantenimiento=" + temperaturaMantenimiento + super.toString()+"] ";
	}
	
	
}
