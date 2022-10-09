package p11_3;

public class Administrador extends Persona {
	//Atributos
	private String codigoAdminst;
	private int numVecinos;
	private float salario;
	//Constructores
	public Administrador() {}

	public Administrador(String codigoAdminst, int numVecinos, float salario, String nombre, int edad, String dni, String finca) {
		super(nombre, edad, dni, finca);
		this.codigoAdminst = codigoAdminst;
		this.numVecinos = numVecinos;
		this.salario = salario;
	}

	public String getCodigoAdminst() {
		return codigoAdminst;
	}

	public void setCodigoAdminst(String codigoAdminst) {
		this.codigoAdminst = codigoAdminst;
	}

	public int getNumVecinos() {
		return numVecinos;
	}

	public void setNumVecinos(int numVecinos) {
		this.numVecinos = numVecinos;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Administrador [codigoAdminst=" + codigoAdminst + ", numVecinos=" + numVecinos + ", salario=" + salario
				+ ", Persona=" + super.toString() + "]";
	}
	
}
