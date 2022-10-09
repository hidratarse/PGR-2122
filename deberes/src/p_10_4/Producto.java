package p_10_4;

import java.util.GregorianCalendar;

public class Producto {
	//Atributos
	private GregorianCalendar fechaCaducidad;
	private String numeroLote;
	private GregorianCalendar fechaEnvasado;
	private String paisOrigen;
	
	//Constructores
	public Producto(GregorianCalendar fechaCaducidad, String numeroLote, GregorianCalendar fechaEnvasado,
			String paisOrigen) {
		this.fechaCaducidad = fechaCaducidad;
		this.numeroLote = numeroLote;
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}
	
	public Producto() {}
	
	//Getters&Setters
	public GregorianCalendar getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(GregorianCalendar fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public String getNumeroLote() {
		return numeroLote;
	}

	public void setNumeroLote(String numeroLote) {
		this.numeroLote = numeroLote;
	}

	public GregorianCalendar getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(GregorianCalendar fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	
	//Métodos
	@Override
	public String toString() {
		return " Producto [fechaCaducidad=" + fechaCaducidad + ", numeroLote=" + numeroLote + ", fechaEnvasado="
				+ fechaEnvasado + ", paisOrigen=" + paisOrigen + "]";
	}
	
}
