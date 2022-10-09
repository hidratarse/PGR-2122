package p_10_4;

import java.util.GregorianCalendar;

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
	
	public String descripcion() {
		return"CONGELADO"
				+"\nNª de Lote...................:"+getNumeroLote()
				+"\nTemperatura de Mantenimiento.:"+getTemperaturaMantenimiento()
				+"\nMetodo de congelacion........:"+getInfoMetodo()
				+"\nTiempo de exposicion.........:"+getTiempoExposicion();
	}
}
