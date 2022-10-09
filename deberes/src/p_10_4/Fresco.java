package p_10_4;

import java.util.GregorianCalendar;

public class Fresco extends Producto{
	
	//Constructores
	public Fresco() {
		super();
	}

	public Fresco(GregorianCalendar fechaCaducidad, String numeroLote, GregorianCalendar fechaEnvasado,
			String paisOrigen) {
		super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen);
	}
	
	//Métodos
	@Override
	public String toString() {
		return "Fresco [getFechaCaducidad()=" + getFechaCaducidad() + ", getNumeroLote()=" + getNumeroLote()
				+ ", getFechaEnvasado()=" + getFechaEnvasado() + ", getPaisOrigen()=" + getPaisOrigen()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}
