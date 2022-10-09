package productos;

public class Producto {
	
	//Atributos
	String codigo;
	String denominacion;
	double precio;
	int stockActual;
	int stockMinimo;
	
	//Constructores
	public Producto(String codigo, String denominacion, double precio, int stockActual, int stockMinimo) {
		this.codigo = codigo;
		this.denominacion = denominacion;
		this.precio = precio;
		this.stockActual = stockActual;
		this.stockMinimo = stockMinimo;
	}
	
	public Producto() {}
	
	//Getters & Setters
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStockActual() {
		return stockActual;
	}

	public void setStockActual(int stockActual) {
		this.stockActual = stockActual;
	}

	public int getStockMinimo() {
		return stockMinimo;
	}

	public void setStockMinimo(int stockMinimo) {
		this.stockMinimo = stockMinimo;
	}

	//Métodos
	@Override
	public String toString() {
		return "Productos [codigo=" + codigo + ", denominacion=" + denominacion + ", precio=" + precio
				+ ", stockActual=" + stockActual + ", stockMinimo=" + stockMinimo + "]";
	}
}
