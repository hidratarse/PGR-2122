package Ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo4_ExcepcionControlada {

	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
        int numero;
        int []tabla = new int[8];

        try{
            System.out.println("INTRODUCE LA POSICIÓN HASTA LA QUE QUIERES VISUALIZAR EL CONTENIDO DE LA TABLA ");
            numero = dato.nextInt();
            for(int a=0; a<numero && a<tabla.length;a++) {
                 System.out.println("VALOR DEL ARRAY "+tabla[a]);
            }     
        }	
        catch(InputMismatchException a)  
        {
             System.out.println("EL NÚMERO INTRODUCIDO DEBE SER UN ENTERO");   
        }
        dato.close();
	}

}
