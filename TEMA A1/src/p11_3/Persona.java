package p11_3;

public class Persona {
	//Atributos
	private String nombre;
	private int edad;
	private String dni;
	private String finca;
	
	public Persona() {}
	
	public Persona(String nombre, int edad, String dni, String finca) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.finca = finca;
	}
	
	public Persona(String nombre, int edad, String finca) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.finca = finca;
	}

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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getFinca() {
		return finca;
	}

	public void setFinca(String finca) {
		this.finca = finca;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", finca=" + finca + "]";
	}
	
	public boolean esMayorDeEdad(int e) {
		if (e>18) return true;
		else return false;
	}
	
	public boolean dniValido(String d) {
		if(d.matches("/^[0-9]{8}[A-Z]$/i")) return true;
		else return false;
	}
}
