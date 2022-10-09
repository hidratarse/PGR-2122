package recursividad;

public class Ejemplo {

	public static void main(String[] args) {
		int n=5, a=3, b=4;
		System.out.println(n+"!="+factorial(n));
		
		System.out.println(a+"+"+b+"="+suma(a,b));
	}
	
	public static int factorial(int n) {
		if(n==0) return 0;
		else return n*factorial(n-1);
	}
	
	public static int suma(int a, int b) {
		if(b==0) return a;
		else return 1+suma(a, b-1);	
	}
}
