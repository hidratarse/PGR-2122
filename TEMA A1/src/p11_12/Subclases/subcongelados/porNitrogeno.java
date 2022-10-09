package p11_12.Subclases.subcongelados;

import java.util.GregorianCalendar;

import p11_12.Subclases.Congelado;

public class porNitrogeno extends Congelado{
	//Atributo
	String infoMetodo;
	int tiempoExposicion;
	
	//Constructores
	public porNitrogeno() {}
	
	public porNitrogeno(GregorianCalendar fechaCaducidad, String numeroLote, GregorianCalendar fechaEnvasado,
			String paisOrigen, int temperaturaMantenimiento, String infoMetodo, int tiempoExposicion) {
		super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
		this.infoMetodo = infoMetodo;
		this.tiempoExposicion = tiempoExposicion;
	}
	
	//Getters&&Setters
	public String getInfoMetodo() {
		return infoMetodo;
	}
	public void setInfoMetodo(String infoMetodo) {
		this.infoMetodo = infoMetodo;
	}
	public int getTiempoExposicion() {
		return tiempoExposicion;
	}
	public void setTiempoExposicion(int tiempoExposicion) {
		this.tiempoExposicion = tiempoExposicion;
	}
	
	//Métodos
	@Override
	public String toString() {
		return "porNitrogeno [infoMetodo=" + infoMetodo + ", tiempoExposicion=" + tiempoExposicion + ", toString()="
				+ super.toString() + "]";
	}
	
}
