package p13_3;

public class Capital extends Pais{
	
	private String nombre;
	
	public Capital(){}
	
	public Capital(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
