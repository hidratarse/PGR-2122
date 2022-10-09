package n3;

public class Empleado {
	
	//Atributos
	String nombre, apellidos, dni, tlf;
	
	int edad;
	
	char categoria;
	
	//Constructores
	
	public Empleado(){}
	
	public Empleado(String nombre, String apellidos, String dni, String tlf, int edad, char categoria) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.dni=dni;
		this.tlf=tlf;
		this.edad=edad;
		this.categoria=categoria;
	}
	
	//Métodos
	
	public String toString() {
		return "nombre= "+nombre+" apellidos= "+apellidos+" dni= "+dni+" tlf= "+tlf+" edad="+edad+" categoria= "+categoria;
	}
	
	public boolean esMayorDeEdad(int e) {
		if(e>18)return true; 
		else return false;
		}
	
	public boolean dniValido(String d) {
		if(d.matches("^[0-9]{7,8}[A-Z a-z]$")) return true;
		else return false;
	}
	
	public boolean nombreValido(String n) {
		if(n.matches("^[A-Z a-z \s]{1,15}$"))return true;
		else return false;
	}
	
	public boolean apellidosValido(String a) {
		if(a.matches("^[A-Z a-z \s]{1,25}$"))return true;
		else return false;
	}
	
	public boolean telefonoValido(String t) {
		if(t.matches("^(6|91)[0-9]{8,9}$"))return true;
		else return false;
	}
}
