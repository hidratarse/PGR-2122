package repaso;

import java.util.Comparator;

public class Partido implements Comparator<Partido>{
	public Partido(String equipoL, String equipoV, int golesL, int golesV) {
		super();
		this.equipoL = equipoL;
		this.equipoV = equipoV;
		this.golesL = golesL;
		this.golesV = golesV;
	}
	private String equipoL;
	private String equipoV;
	private int golesL;
	private int golesV;
	public String getEquipoL() {
		return equipoL;
	}
	public void setEquipoL(String equipoL) {
		this.equipoL = equipoL;
	}
	public String getEquipoV() {
		return equipoV;
	}
	public void setEquipoV(String equipoV) {
		this.equipoV = equipoV;
	}
	public int getGolesL() {
		return golesL;
	}
	public void setGolesL(int golesL) {
		this.golesL = golesL;
	}
	public int getGolesV() {
		return golesV;
	}
	public void setGolesV(int golesV) {
		this.golesV = golesV;
	}
	@Override
	public int compare(Partido o1, Partido o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
