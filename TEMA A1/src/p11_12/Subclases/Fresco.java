package p11_12.Subclases;

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
	
	//M�todos
	@Override
	public String toString() {
		return "Fresco [getFechaCaducidad()=" + getFechaCaducidad() + ", getNumeroLote()=" + getNumeroLote()
				+ ", getFechaEnvasado()=" + getFechaEnvasado() + ", getPaisOrigen()=" + getPaisOrigen()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}
