package marquesina;

import java.util.Scanner;

public class marquesina2 {

	public static Scanner sc = new Scanner(System.in);
	
    public static void main (String [ ] args){

		String frase="";
		int i;
		do{
			System.out.print("Introduce una frase");
			frase=sc.nextLine();
		}while(frase.length()>80);
		char[] letras=new char[80];
		for(i=0; i<frase.length();i++){
			letras[i]=frase.charAt(i);
		}
		for(i=0;i<200;i++){
			try{
				Thread.sleep(500);
			}catch(Exception e){
				System.out.println(e);
			}
			visualizarFrase(letras);
			desplazarLetras(letras);
		}
		
    }
		public static void visualizarFrase(char[] v){
			int i;
			for(i=0;i<v.length;i++){
				System.out.print(v[i]);
			}
			System.out.print("\r");
		}	
		public static void desplazarLetras(char[] d){
			int i;
			char primeraLetra=d[0];
			for(i=0;i<=d.length-2;i++){
				d[i]=d[i+1];
			}
			d[d.length-1]=primeraLetra;
		}
}