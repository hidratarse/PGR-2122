package claseAnidada;

public class UsoClaseAnidada {

	public static void main(String[] args) {
		
		Composicion obejetoCompuesto=new Composicion();
		System.out.println(obejetoCompuesto.toString());
	
		Composicion.Anindada objetoAnidada=new Composicion.Anindada(2000);
		objetoAnidada.mostrar();
		
		System.out.println("Atributo interno clase anidada:"+objetoAnidada.getInterno());
		//Composicion obbbb=new Composicion(objetoAnidada);
	}
	
}
