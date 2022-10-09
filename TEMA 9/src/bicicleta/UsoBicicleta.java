package bicicleta;

public class UsoBicicleta {

	public static void main(String[] args) {
		
		Bicicleta.setNumeroBicicletas(1);
		
		Bicicleta bici1=new Bicicleta(Bicicleta.getNumeroBicicletas(),55,7);
		Bicicleta.setNumeroBicicletas(bici1.getId()+1);
		/*Bicicleta bici2=new Bicicleta(2,53,7);*/
		
		System.out.println(Bicicleta.getNumeroBicicletas());
		/*System.out.println(bici1.getNumeroBicicletas());
		System.out.println(bici2.getNumeroBicicletas());
		*/
	}

}
