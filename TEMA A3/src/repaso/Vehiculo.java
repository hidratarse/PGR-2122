package repaso;

import java.util.Date;

public abstract class Vehiculo {
	private String matricula;
	private Date fecha;
	
	public Vehiculo(String matricula, Date fecha) {
		super();
		this.matricula = matricula;
		this.fecha = fecha;
	}

	public abstract  void calculaImporte();

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
