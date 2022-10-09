package claseAnidada;

public class Composicion {
	//Atributos
	int externo_x=10;
	static int externoy=20;
	private static int externoPrivado=30; 
	public Composicion(Anindada alul) {
		super();
		this.alul = alul;
	}

	Anindada alul;
	
	//Constructores
	public Composicion() {}

	public Composicion(int externo_x) {
		this.externo_x = externo_x;
	}
	
	//Getters&Setters
	public int getExterno_x() {
		return externo_x;
	}

	public void setExterno_x(int externo_x) {
		this.externo_x = externo_x;
	}

	public static int getExterno_y() {
		return externoy;
	}

	public static void setExterno_y(int externo_y) {
		Composicion.externoy = externo_y;
	}

	public static int getExternoPrivado() {
		return externoPrivado;
	}

	public static void setExternoPrivado(int externoPrivado) {
		Composicion.externoPrivado = externoPrivado;
	}
	
	//Métodos
	@Override
	public String toString() {
		return "Composicion [externo_x=" + externo_x + "]";
	}
	public void mostrar2 () {
		System.out.println("Variable interno ");
	}
	
	//Clases
	static class Anindada{
		int interno;
		
		public Anindada() {}

		public Anindada(int interno) {
			this.interno = interno;
		}
		
		public void mostrar() {
			System.out.println("Atributo interno "+interno);
			System.out.println("Atributo externo "+externoy);
			System.out.println("Atributo privado "+externoPrivado);
		}

		public int getInterno() {
			return interno;
		}
	}
}
