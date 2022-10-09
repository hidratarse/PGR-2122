package p_9_5;

import java.util.Scanner;

public class P_9_5 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int a=3, b=5;
		
		//1. M�todo recursivo para calcular la suma desde 1 hasta N
	    do{
	       System.out.print("Introduce un numero entero >0 ");
	       a = sc.nextInt();
	    }while(a<=0);
	    System.out.println("Suma desde 1 hasta " + a + " = " + suma(a));
	
	    //2. M�todo recursivo para calcular la suma de n�meros pares desde a hasta b
	    do{
	        System.out.print("Introduce dos numeros enteros >0 ");
	        a = sc.nextInt();
	        b = sc.nextInt();
	    }while(a<=0);
	    if(a%2!=0) a-=1;
		if(b%2!=0) b+=1;
	    System.out.println("Suma pares desde "+a+" hasta " + b + " = " + sumaPares(a, b));
	    
	    //3. M�todo recursivo para calcular la divisi�n con restas de a entre b
	    do{
	        System.out.print("Introduce dividendo y divisor");
	        a = sc.nextInt();
	        b = sc.nextInt();
	    }while(a<=0);
	    System.out.println("Divisi�n de "+a+" entre " + b + " = " + divisionResta(a, b));
	    
	    //4. M�todo recursivo para calcular potencias
	    System.out.println("Introduce la base y el exponenete" );
	    a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Potencia con base "+a+" y exponente " + b + " = " + potencia(a, b));
        
        //5. M�todo recursivo para invertir un n�mero
        System.out.printf("%nEl n�mero %d invertido es el %s", a, invertirNumeroString(a));
    }

	public static int suma(int n){
	    if(n == 1) return 1;//caso base
	    else return n + suma(n-1);
	}
	
	public static int sumaPares(int num1, int num2) {
		if(num1<num2) return num1;
		return num1+sumaPares(num1-2, num2);
	}
	
	public static int divisionResta (int a, int b) {
	    if (a == 0) return 0;
	    else return 1 + divisionResta(a - b, b);
	}
	
	public static int potencia(int a,int b) {
		if(b==0) return 1;
		else return a*potencia(a,b-1);
	}

	private static String invertirNumeroString(int num) {
	    if(num<10) return String.valueOf(num);
	    else return String.valueOf(num%10) + invertirNumeroString(num/10);
	}
}
