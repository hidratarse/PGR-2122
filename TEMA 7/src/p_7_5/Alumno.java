package p_7_5;

import java.util.Arrays;

public class Alumno {
	
	//Atributos
	String nombre;
	String apellidos;
	String modulos[];
	int edad;
	
	public Alumno() {modulos=new String[6];}
	
	public Alumno(String nombre, String apellidos, int edad, String []modulos) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.modulos=modulos;
		this.edad=edad;
	}
	
	//Constructores
	public Alumno(String nombre, String apellidos) {
		this.nombre=nombre;
		this.apellidos=apellidos;
	}
	
	//Métodos
	public  String toString() {
		return "Alumno{" + "nombre=" + this.nombre + ", apellidos=" + this.apellidos + ", edad=" + this.edad + ", modulos=" + Arrays.toString(this.modulos) + '}';
	}
}
