package clase_envoltorio;

public class ClasesEnvoltorio {
	
	public static void main(String[] args) {
		
		
		int x = Integer.parseInt("12345");		//si, integer
		System.out.println(x);
				
		
		System.out.println(Integer.max(x, 12346));//integer
		
		
		System.out.println(Integer.toBinaryString(x)); //integer
		

		Long l = Long.valueOf("34597623495729346"); //long
		Double d = Double.valueOf(3.141592); //double
		System.out.println(l);
		System.out.println(d);
		
		
		char c = 'a';
		System.out.println(Character.isAlphabetic(c)); //character
		System.out.println(Character.isDigit(c)); //character
		
		
		System.out.println(Boolean.logicalXor(true, true)); //boolean
	}
}