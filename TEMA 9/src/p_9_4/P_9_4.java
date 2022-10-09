package p_9_4;

public class P_9_4 {

	public static void main(String[] args) {
		
		AparatoElectrico bombilla=new AparatoElectrico(150);
		AparatoElectrico plancha=new AparatoElectrico(500);
		
		System.out.println("Consumo actual "+AparatoElectrico.getConsumoTotal());
		
		System.out.println("Se encinde la bombilla");
		bombilla.enciende();
		System.out.println("Consumo actual "+AparatoElectrico.getConsumoTotal());
		
		System.out.println("Se encinde la plancha");
		plancha.enciende();
		System.out.println("Consumo actual "+AparatoElectrico.getConsumoTotal());
		
		System.out.println("Se apaga la bombilla");
		bombilla.apaga();
		System.out.println("Consumo actual "+AparatoElectrico.getConsumoTotal());
	}
}
