package p_10_3_2;

public class Reserva {
	
	//Atributos
	private int hora;
	private String nSocio;
	private String nombre;
	
	//Constructores
	public Reserva(int hora, String nSocio, String nombre) {
		super();
		this.hora = hora;
		this.nSocio = nSocio;
		this.nombre = nombre;
	}
	
	public Reserva() {}
	
	//Getters&Stters
	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public String getnSocio() {
		return nSocio;
	}

	public void setnSocio(String nSocio) {
		this.nSocio = nSocio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Métodos


}
