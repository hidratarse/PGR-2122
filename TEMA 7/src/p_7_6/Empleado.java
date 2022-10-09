package p_7_6;

public class Empleado {
	
	//Atributos
	String nombre, departamento;
	int edad;
	double salario;
	
	//Constructores
	public Empleado() {};
	
	public Empleado(String nombre,String departamento,int edad, double salario) {
	this.nombre=nombre;
	this.departamento=departamento;
	this.edad=edad;
	this.salario=salario;
	}
	
	public Empleado(String nombre,String departamento) {
		this.nombre=nombre;
		this.departamento=departamento;
	}
	
	//Métodos
	public String toString() {
		return "nombre="+nombre+" dpto="+departamento+" edad="+edad+" salario="+salario;
	}
}
	
