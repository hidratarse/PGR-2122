package p11_1;

public class Persona {
	//Atributos
	private String nombre;
	private int edad;
	private String tlf;
	
	//Constructores
	public Persona() {}
	
	public Persona(String nombre, int edad, String tlf) {
		this.nombre = nombre;
		this.edad = edad;
		this.tlf = tlf;
	}
	
	//Getters&Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTlf() {
		return tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}
	
	//Métodos
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", tlf=" + tlf + "]";
	}
}
