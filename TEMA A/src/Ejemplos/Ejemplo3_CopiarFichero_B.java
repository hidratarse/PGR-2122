package Ejemplos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejemplo3_CopiarFichero_B {

	public static void main(String[] args) {
		int i;
		FileInputStream fin=null;
		FileOutputStream fout=null;
				
		//comprobar que se han especificado los dos archivos
		if (args.length != 2){
			System.out.println("Debe especifirar fichero de entrada y salida");
            return;			
		}
		
		//Copiar un archivo
		try {
			// abrir los archivos
			fin = new FileInputStream(args[0]);
			fout = new FileOutputStream(args[1]);
			
			do{
			   i = fin.read(); //leer desde el archivo
			   if(i != -1) fout.write(i);

			}while (i!=-1); //cuando i sea igual a -1 se habrá alcanzado el final del archivo origen
		}
		
		catch (IOException exc){
			System.out.println("Error leyendo el fichero");
		}
		/* posible con un solo catch
		catch(IOException exc) {
			System.out.println("I/o Error: "+exc);
		}*/
		
		finally{  //usar la clausula finally para cerrar el archivo
		    try {
			   if (fin != null) fin.close(); //cerrar fichero
		    }
		    catch(IOException exc){
			    System.out.println("Error cerrando el fichero");
			} 
			try {
			   if (fout !=null) fout.close() ; //cerrar fichero
		    }
		    catch(IOException exc){
			    System.out.println("Error cerrando el fichero");
			}  			
		}

	}

}
