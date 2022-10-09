package p_9_1;

public class Persona {
	
	//Atributos
	private String nombre;
	private String tlf;
	private int edad;
	
	//Getter & Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTlf() {
		return tlf;
	}
	public void setTlf(String tlf) {
		this.tlf = tlf;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//Métodos
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", tlf=" + tlf + ", edad=" + edad + ", getNombre()=" + getNombre()
				+ ", getTlf()=" + getTlf() + ", getEdad()=" + getEdad() + "]";
	}
}
