package p12_1;

import java.util.Date;

public class Correo {
	
	//Atributos
	private String origen;
	private String destino;
	private String asunto;
	private String cuerpo;
	private Date fechaYhora;
	//Constructores
	public Correo() {}
	
	public Correo(String origen, String destino, String asunto, String cuerpo, Date fechaYhora) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.asunto = asunto;
		this.cuerpo = cuerpo;
		this.fechaYhora = fechaYhora;
	}

	//Getters&Setters
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getAsunto() {
		return asunto;
	}
	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}
	public String getCuerpo() {
		return cuerpo;
	}
	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	public Date getFechaYhora() {
		return fechaYhora;
	}
	public void setFechaYhora(Date fecha) {
		this.fechaYhora = fecha;
	}
	
}
