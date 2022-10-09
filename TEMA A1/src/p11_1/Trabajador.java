package p11_1;

public class Trabajador extends Persona {
	//Atributos
	char categoria;
	int Antiguedad;

	//Constructores
	public Trabajador(String nombre, int edad, String tlf, char categoria, int Antiguedad) {
		super(nombre, edad, tlf);
		this.categoria=categoria;
		this.Antiguedad=Antiguedad;
	}

	public Trabajador() {}

	//Getters&&Setters
	public char getCategoria() {
		return categoria;
	}

	public void setCategoria(char categoria) {
		this.categoria = categoria;
	}

	public int getAntiguedad() {
		return Antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		Antiguedad = antiguedad;
	}
	
	//Métodos
	@Override
	public String toString() {
		return "Trabajador [categoria=" + categoria + ", Antiguedad=" + Antiguedad + super.toString()+"]";
	}

}
