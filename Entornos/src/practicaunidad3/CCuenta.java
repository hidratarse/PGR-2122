package practicaunidad3;
/**
 * 
 * @author Miguel Angel y Dario
 *
 *Esta clase est� enlaza al main y nos devuelve metodos que usar�
 */
public class CCuenta {

	protected String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInter�s;

	public CCuenta() {
	}

	public CCuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
		tipoInter�s = tipo;
	}
	/**
	 * 
	 * @param nom
	 */
	public void asignarNombre(String nom) {
		nombre = nom;
	}
	/**
	 * 
	 * @return
	 */
	public String obtenerNombre() {
		return nombre;
	}
	/**
	 * 
	 * @return
	 */
	public double estado() {
		return saldo;
	}
	/**
	 * 
	 * @param cantidad
	 * @throws Exception
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0) {
			throw new Exception("No se puede ingresar una cantidad negativa");
		}
		setSaldo(saldo + cantidad);
	}
	/**
	 * 
	 * @param cantidad
	 * @throws Exception
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad < 0) {
			throw new Exception("No se puede retirar una cantidad negativa");
		}
		if (estado() < cantidad) {
			throw new Exception("No se hay suficiente saldo");
		}
		setSaldo(saldo - cantidad);
	}
	/**
	 * 
	 * @return
	 */
	public String obtenerCuenta() {
		return cuenta;
	}
	/**
	 * 
	 * @param cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/**
	 * 
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 * 
	 * @return
	 */
	public double getTipoInter�s() {
		return tipoInter�s;
	}
	/**
	 * 
	 * @param tipoInter�s
	 */
	public void setTipoInter�s(double tipoInter�s) {
		this.tipoInter�s = tipoInter�s;
	}
}
