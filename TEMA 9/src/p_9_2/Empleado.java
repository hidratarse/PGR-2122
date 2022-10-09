package p_9_2;

import java.util.GregorianCalendar;

public class Empleado {
	
	//Atributos
	private String nombre;
	private String nif;
	private int numHijos;
	private double sueldo;
	private GregorianCalendar fechaContrato;
	
	//Constructores
	public Empleado(String nombre, double sueldo, int anno, int mes, int dia) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.fechaContrato = new GregorianCalendar(anno, mes, dia);
	}
	
	public Empleado() {}
	
	public Empleado(String nombre, double sueldo, GregorianCalendar fechaContrato, String nif, int numHijos) {
		super();
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.fechaContrato = fechaContrato;
		this.nif = nif;
		this.numHijos = numHijos;
	}

	public Empleado(String nombre, String nif) {
		this.nombre=nombre;
		this.nif=nif;
	}
	
	public Empleado(String nombre, int numHijos) {
		this.nombre=nombre;
		this.numHijos=numHijos;
	}

	//Métodos
	public void subirSueldo(int porcentaje) {sueldo+=sueldo*(porcentaje*0.01);}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public int getNumHijos() {
		return numHijos;
	}

	public void setNumHijos(int numHijos) {
		this.numHijos = numHijos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public GregorianCalendar getFechaContrato() {
		return fechaContrato;
	}

	public void setFechaContrato(GregorianCalendar fechaContrato) {
		this.fechaContrato = fechaContrato;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + ", fechaContrato=" + fechaContrato + "]";
	}
	
	public double sueldoNeto() {
		double sueldoNeto=0,irpf=0;
		if(sueldo<=1000) irpf=6.12;
		else if(sueldo<=1400) irpf=11.8;
			else if(sueldo<=2900) irpf=20.03;
				else irpf=25;
		irpf-= disminucionHijos();
		sueldoNeto=sueldo-sueldo*irpf/100;
		return sueldoNeto;		
	}
	
	public double disminucionHijos() {
		double disminucion=0;
		switch(numHijos) {
			case 0:disminucion=0;break;
			case 1:disminucion=1; break;
			case 2:disminucion=4; break;
			default:disminucion=7;
		}
		return disminucion;
	}
	
	public void imprimirNomina() {
		System.out.printf("NÓMINA DE %S \n", nombre);
		System.out.println("Sueldo bruto:"+sueldo);
		System.out.printf( "      IRPF  : %.2f \n",(sueldo-sueldoNeto()));
		System.out.printf( "SUELDO NETO : %.2f \n", sueldoNeto());
	}
}
