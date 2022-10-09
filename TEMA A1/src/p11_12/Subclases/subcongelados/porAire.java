package p11_12.Subclases.subcongelados;

import java.util.GregorianCalendar;

import p11_12.Subclases.Congelado;

public class porAire extends Congelado {
	//Atributos;
	private int N;
	private int O;
	private int cO2;
	private int vaporH2O;
	
	//Constructores
	public porAire() {};
	
	public porAire(GregorianCalendar fechaCaducidad, String numeroLote, GregorianCalendar fechaEnvasado,
			String paisOrigen, int temperaturaMantenimiento, int n, int o, int cO2, int vaporH2O) {
		super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
		N = n;
		O = o;
		this.cO2 = cO2;
		this.vaporH2O = vaporH2O;
	}
	
	//Getters&&Setters
	public int getN() {
		return N;
	}

	public void setN(int n) {
		N = n;
	}

	public int getO() {
		return O;
	}

	public void setO(int o) {
		O = o;
	}

	public int getcO2() {
		return cO2;
	}

	public void setcO2(int cO2) {
		this.cO2 = cO2;
	}

	public int getVaporH2O() {
		return vaporH2O;
	}

	public void setVaporH2O(int vaporH2O) {
		this.vaporH2O = vaporH2O;
	}
	
	//Métodos
	@Override
	public String toString() {
		return "porAire [N=" + N + ", O=" + O + ", cO2=" + cO2 + ", vaporH2O=" + vaporH2O + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
