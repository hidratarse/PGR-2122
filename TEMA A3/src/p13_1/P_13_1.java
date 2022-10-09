package p13_1;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class P_13_1 {
	
	public static Scanner sc=new Scanner(System.in);
	
	public static FileReader output;
	
	public static void main(String[] args) {
		
		//1
		lectura();
		//2
		escritura();
		//3 se cambia el boolean del constructor a false
	}

	public static void escritura() {
		System.out.println("\nEscribe la frase a añadir");
		String escritura = sc.nextLine();
		try {
			FileOutputStream input= new FileOutputStream("C:/Users/migue/Desktop/idk.txt",true);
			
			int idk =Integer.parseInt(escritura);
			
			System.out.println(idk);
			
			input.write(idk);
			input.close();
			lectura();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	public static void lectura() {
		try {
			output = new FileReader("C:/Users/migue/Desktop/13_1.txt");
			int c=0;
			while (c!=-1) {
				c=output.read();
				System.out.print((char)c);
				}
		} catch (IOException e) {
			System.out.println("No hay fichero");
		}
	}
}

/*Texto a leer: 
Canto asunto marcial; al héroe canto
Que, de Troya lanzado, a Italia vino;
Que ora en mar, ora en tierra, sufrió tanto
De Juno rencorosa y del destino;
Que en guerras luego padeció quebranto,
Conquistador en el país latino,
Hasta fundar, en fin, con alto ejemplo,
Muro a sus armas, y a sus dioses templo. 
 */
