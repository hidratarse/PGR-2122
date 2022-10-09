package Ejemplos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejemplo3_CopiarFicheroExcepcionSinControlar {

	public static void main(String[] args) throws FileNotFoundException{
		int i = 0;
		FileInputStream fin=null;
		FileOutputStream fout=null;
				
		//comprobar que se han especificado los dos archivos
		if (args.length != 2){
			System.out.println("Debe especifirar fichero de entrada y salida");
            return;			
		}
		
		//Copiar un archivo
		
			// abrir los archivos
			fin = new FileInputStream(args[0]);
			fout = new FileOutputStream(args[1]);
			
			do{
			   try {
				i = fin.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //leer desde el archivo
			   if(i != -1)
				try {
					fout.write(i);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}while (i!=-1); //cuando i sea igual a -1 se habrá alcanzado el final del archivo origen

			try {
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
