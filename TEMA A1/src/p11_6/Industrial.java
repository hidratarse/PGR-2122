package p11_6;

public class Industrial extends Maquina {
	
	private int potenciaConsumo;
	
	public int getPotenciaConsumo() {
		return potenciaConsumo;
	}

	public void setPotenciaConsumo(int potenciaConsumo) {
		this.potenciaConsumo = potenciaConsumo;
	}
	
	@Override
	public void encender() {}

	@Override
	public void apagar() {}
}
