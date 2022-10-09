package p13_5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

public class P_13_5 {
	public static void main(String[] args) {
		
		try (FileReader fAutor=new FileReader("C:/Users/migue/Desktop/biblio.txt")){
			
			RandomAccessFile rAutor = new RandomAccessFile("C:/Users/migue/Desktop/rautor.txt","rw");
			//Copiar los datos de ficheros de texto al fichero aleatorio
			
			copiarDatos(fAutor, rAutor);
			
		} catch (FileNotFoundException e) {
			System.out.println("No se encontró el fichero");
		} catch (IOException e1) {
			System.out.println("Error de entrada/salida");
		}
	}
	
	public static void copiarDatos(FileReader fa, RandomAccessFile ra) throws IOException{
		try(BufferedReader miBuffer=new BufferedReader(fa)) {
			String autor,nombre,apellidos,nacionalidad;
			int codigoautor;
			autor=miBuffer.readLine();
			while (autor!=null) {
				//Leemos y pasamos a un vector
				String lectura[]=autor.split(";");
				//Cargamos en varriables los campos del registro y ajustamos tamaño
				codigoautor=Integer.parseInt(lectura[0]);
				nombre=ajustarAncho(lectura[1],15);
				apellidos=ajustarAncho(lectura[2],20);
				nacionalidad=apellidos=ajustarAncho(lectura[3],15);
				//Grabar datos en fichero aleatorio
				//Posicionar puntero
				ra.seek(codigoautor-1*60);
				ra.writeInt(codigoautor);
				ra.writeUTF(nombre);
				ra.writeUTF(apellidos);
				ra.writeUTF(nacionalidad);
				autor=miBuffer.readLine();
			}
		}
	}
	
	public static String ajustarAncho(String s, int ancho) {
		if (s.length()>=ancho) return s.substring(0,ancho);
		else return String.format("%-"+ancho+"S",s);
	}
}

