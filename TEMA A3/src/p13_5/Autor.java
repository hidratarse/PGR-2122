package p13_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Autor {
	
	int codigo;
	private String nombre;
	private String apellidos;
	private String nacionalidad;
	
	public Autor() {}
	
	public Autor(int codigo, String nombre, String apellidos, String nacionalidad) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nacionalidad = nacionalidad;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	@Override
	public String toString() {
		return "Autor [codigo=" + codigo + ", nombre=" + nombre + ", apellidos=" + apellidos + ", nacionalidad="
				+ nacionalidad + "]";
	}

	public void leerGuardar(FileReader fAutor) throws IOException {
		BufferedReader bAutor=new BufferedReader(fAutor);	
		String buff=bAutor.readLine();
		while (buff!=null) {
			String lectura[]=buff.split(";");
			
			this.codigo=Integer.parseInt(lectura[0]);
			this.nombre=lectura[1];
			this.apellidos=lectura[2];
			this.nacionalidad=apellidos=lectura[3];
			
			buff=bAutor.readLine();
		}
	}
}
