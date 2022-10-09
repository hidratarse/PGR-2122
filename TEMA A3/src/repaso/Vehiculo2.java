package repaso;

import java.util.Date;

public abstract class Vehiculo2 {
	private String matricula;
	private Date fecha;
	
	

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
