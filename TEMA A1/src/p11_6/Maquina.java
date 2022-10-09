package p11_6;

public abstract class Maquina {
	//Atributos
	private String numSerie;
	private String modelo;
	private int horasFuncionamiento;
	
	//Getters&Setters 
	public String getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getHorasFuncionamiento() {
		return horasFuncionamiento;
	}

	public void setHorasFuncionamiento(int horasFuncionamiento) {
		this.horasFuncionamiento = horasFuncionamiento;
	}
	
	//Metodos
	public abstract void encender();
	
	public abstract void apagar();
}
